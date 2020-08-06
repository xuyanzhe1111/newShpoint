package com.example.demo.controller;

import com.example.demo.common.CustomerException;
import com.example.demo.security.entity.MyUserDetails;
import com.example.demo.security.entity.RoleEntity;
import com.example.demo.security.entity.UserEntity;
import com.example.demo.security.error.UserException;
import com.example.demo.security.service.UsersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static com.example.demo.security.error.UserError.ERROR_NOTENUUGHLEVEL;


@Controller
public class UserManagerController {

    @Autowired
    UsersInfoService userService;

    @GetMapping("/usermanager")
//    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_OWERN')")
    public String getWeb(Model model) {
        model.addAttribute("mainHtml", "usermanager");
        model.addAttribute("pdfname", "usermanager");
        return "newHtml/home";
    }

    public int getRoleLevelByString(String role){
        return RoleEntity.getRoleByString(role).getLevel();
    }
    public int getRoleLevelByRoleString(String role){
        return RoleEntity.valueOf(role).getLevel();
    }
    @PostMapping("/usermanager/insertUser")
    @ResponseBody
    public String insertUser(@RequestBody UserEntity user, HttpServletRequest req) throws Exception {
        MyUserDetails cuser=getCurrentUser();
        if(getRoleLevelByString(user.getRole())>=getRoleLevelByRoleString(cuser.getRoleList().get(0)))
            throw new UserException(ERROR_NOTENUUGHLEVEL);
        user.setIpaddress(req.getRemoteAddr());
        userService.insertUser(user);
        return "";
    }

    @PostMapping("/usermanager/updataUser")
    @ResponseBody
    public String updataUser( @RequestBody UserEntity user) throws Exception {
        MyUserDetails currentUser=getCurrentUser();
        if(user.getLevel()>=getCurrentUserLevel()){
            throw new CustomerException("没有权限");
        }
        userService.updataUser(user);
        return "";
    }
    @PostMapping("/usermanager/deleteUser")
    @ResponseBody
    public void deleteUser(@RequestBody UserEntity user) throws CustomerException {
        MyUserDetails currentUser=getCurrentUser();
        if(user.getLevel()>=getCurrentUserLevel()){
            throw new CustomerException("没有权限");
        }
        userService.deleteById(user);
    }

    @GetMapping("/usermanager/getUserList")
    @ResponseBody
    public Object getAllUser(){
        return userService.getAll(getCurrentUserLevel());
    }

    @GetMapping("/usermanager/getRoleList")
    @ResponseBody
    public Object getRoleList(){
        MyUserDetails user=getCurrentUser();
        String rolename=user.getRoleList().get(0);
        int level=RoleEntity.valueOf(rolename).getLevel();
        return RoleEntity.getRoleNameListUnderLevel(level);

    }

    @GetMapping("/getCurrentUser")
    @ResponseBody
    public MyUserDetails getCurrentUser(){
        Authentication authentication =SecurityContextHolder.getContext().getAuthentication();
        return (MyUserDetails) authentication.getPrincipal();
    }

    @GetMapping("/getCurrentUserLevel")
    @ResponseBody
    public Integer getUserLevel(){
        return getCurrentUserLevel();
    }

    @PostMapping("/getCurrentUserName")
    @ResponseBody
    public Object getCurrentUserName(){
        Authentication authentication =SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails user=((MyUserDetails)authentication.getPrincipal());
        return  user.getUsername()+"-"+user.getName();
    }
    private int getCurrentUserLevel(){
        RoleEntity entity=RoleEntity.valueOf(getCurrentUser().getRoleList().get(0));
        return entity.getLevel();
    }
}
