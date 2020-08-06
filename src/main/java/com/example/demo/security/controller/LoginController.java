package com.example.demo.security.controller;

import com.example.demo.common.CustomerException;
import com.example.demo.security.entity.VerificationEntity;
import com.example.demo.security.entity.UserEntity;
import com.example.demo.security.service.MailService;
import com.example.demo.security.service.UsersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UsersInfoService service;

    @Autowired
    MailService mailService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login/getUpUser")
    @ResponseBody
    public Object getUpUser(@RequestParam("username") String username) {
        List<UserEntity> users = service.getUpUserByUsername(username);
        Iterator<UserEntity> i = users.iterator();
        List<String> names = new ArrayList<>();
        while (i.hasNext()) {
            UserEntity u = i.next();
            names.add(u.getUsername() + "-" + u.getUserrealname());
        }
        return names;
    }

    @PostMapping("/login/sendVerification")
    @ResponseBody
    public Object sendVerification(@RequestParam("upusername") String upusername, @RequestParam("username") String username) throws CustomerException {
        upusername = upusername.split("-")[0];
        UserEntity upuser = service.getUserByUsername(upusername);
        UserEntity user = service.getUserByUsername(username);
        if (upuser.getLevel() <= user.getLevel())
            throw new CustomerException("登录用户等级高于获得验证码用户等级");
        String code= StringUtils.randomAlphanumeric(10);
        VerificationEntity entity=new VerificationEntity(user.getId(),code);
        service.insertVerification(entity);
        mailService.sendVerification(
                upuser.getUsername() + "-" + upuser.getUserrealname(),
                user.getUsername() + "-" + user.getUserrealname(),
                upuser.getEmailaddress(),
                code);
        return null;
    }
    @GetMapping("/403")
    public Object error403(Model model,HttpServletResponse response) throws IOException {
        response.setStatus(403);
        model.addAttribute("component", "403");
        return "home";
    }
    @GetMapping("/home")
    public Object loginH() {
        return "home";
    }

    @GetMapping("/")
    public Object home() {
        return "login";
    }
}
