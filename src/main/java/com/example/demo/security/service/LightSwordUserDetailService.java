package com.example.demo.security.service;

import com.example.demo.security.entity.VerificationEntity;
import com.example.demo.security.entity.MyUserDetails;
import com.example.demo.security.entity.RoleEntity;
import com.example.demo.security.entity.UserEntity;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LightSwordUserDetailService implements UserDetailsService  {

    @Autowired
    private UsersInfoService userService;

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String s) {
        UserEntity user=userService.getUserByUsername(s);
        if(user==null){
            return null;
        }
        VerificationEntity code=userService.selectVerificationByUserId(user.getId());
        List<String> authorities=new ArrayList<>();
        authorities.add(RoleEntity.getRoleByLevel(user.getLevel()).toString());
        authorities.add(s);
        return new MyUserDetails(user,authorities,code);
    }
}
