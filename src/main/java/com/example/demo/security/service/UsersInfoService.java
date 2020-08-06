package com.example.demo.security.service;

import com.example.demo.security.entity.VerificationEntity;
import com.example.demo.mapper.UsersInfoMapper;
import com.example.demo.security.entity.RoleEntity;
import com.example.demo.security.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;


@Service
public class UsersInfoService {
    @Autowired
    UsersInfoMapper usermapper;

    public List<UserEntity> getAll(Integer level) {
        List<UserEntity> l = usermapper.getAllUnderLevel(level);
        Iterator<UserEntity> i = l.iterator();
        while (i.hasNext()) {
            UserEntity u = i.next();
            u.setRole(RoleEntity.getRoleByLevel(u.getLevel()).getUsername());
        }
        return l;
    }

    public Integer insertUser(UserEntity entity) throws Exception {
        checkDuplicate(entity,"add");
        checkEmpty(entity);
        entity.setLevel(RoleEntity.getRoleByString(entity.getRole()).getLevel());
        return usermapper.insertUser(entity);
    }

    private void checkDuplicate(UserEntity entity,String type) throws Exception {
        List<UserEntity> l = usermapper.getAll();
        Iterator<UserEntity> i = l.iterator();
        while (i.hasNext()) {
            UserEntity u = i.next();
            if (u.getId().equals(entity.getId()))
                continue;
            if (u.getUsername().equals(entity.getUsername()))
                throw new Exception("已存在用户名为" + u.getUsername() + "的用户");
            if (u.getUserrealname().equals(entity.getUserrealname()))
                throw new Exception("已存在姓名为" + u.getUserrealname() + "的用户");
        }
    }

    private void checkEmpty(UserEntity entity) throws Exception {
        if (entity.getUsername().isEmpty()) {
            throw new Exception("请填写用户名");
        }
        if (entity.getPassword().isEmpty()) {
            throw new Exception("请填写密码");
        }
        if (entity.getRole().isEmpty()) {
            throw new Exception("请选择身份");
        }
        if (entity.getEmailaddress().isEmpty()) {
            throw new Exception("请填写邮箱");
        }
        if (entity.getEmailaddress().isEmpty()) {
            throw new Exception("请填写邮箱");
        }
    }

    public void updataUser(UserEntity entity) throws Exception {
        checkDuplicate(entity,"up");
        checkEmpty(entity);
        entity.setLevel(RoleEntity.getRoleByString(entity.getRole()).getLevel());
        usermapper.updataUserById(entity);
    }

    public UserEntity getUserByUsername(String username) {
        return usermapper.getUserByUsername(username);
    }

    public void deleteById(UserEntity entity) {
        usermapper.deleteById(entity.getId());
    }

    public VerificationEntity selectVerificationByUserId(int id) {
        return usermapper.selectVerificationByUserId(id);
    }

    public List<UserEntity> getUpUserByUsername(String username) {
        return usermapper.getUpUserByUsername(username);
    }

    public int insertVerification(VerificationEntity entity) {
        VerificationEntity codeEntity = selectVerificationByUserId(entity.getUserid());
        if (codeEntity != null) {
            entity.setCode(entity.getCode());
            return usermapper.updateVerification(entity);
        }
        else
            return usermapper.insertVerification(entity);
    }

    ;
}
