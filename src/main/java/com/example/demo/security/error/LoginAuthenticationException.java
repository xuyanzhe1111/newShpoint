package com.example.demo.security.error;



import java.nio.file.AccessDeniedException;

public class LoginAuthenticationException extends AccessDeniedException {

    public LoginAuthenticationException(String msg) {
        super(msg);
    }


    public LoginAuthenticationException(Error error) {
        super(error.getErrStr(),null,error.getErrStr()+"");
    }
}
