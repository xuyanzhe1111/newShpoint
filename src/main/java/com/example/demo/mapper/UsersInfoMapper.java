package com.example.demo.mapper;

import com.example.demo.security.entity.VerificationEntity;
import com.example.demo.security.entity.UserEntity;

import java.util.List;

public interface UsersInfoMapper {
    List<UserEntity> getAll();

    List< UserEntity> getAllUnderLevel(Integer level);

    List< UserEntity> getUpUserByUsername(String username);

    Integer insertUser(UserEntity user);

    Integer updataUserById(UserEntity user);

    Integer deleteById(Integer id);

    UserEntity getUserByUsername(String username);

    VerificationEntity selectVerificationByUserId(Integer id);

    Integer insertVerification(VerificationEntity entity);

    Integer updateVerification(VerificationEntity entity);
}
