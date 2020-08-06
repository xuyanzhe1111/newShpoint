package com.example.demo.security.error;

import java.nio.file.AccessDeniedException;

public class UserException extends AccessDeniedException {
    public UserException(String msg) {
        super(msg);
    }

    public UserException(Error error) {
        super(error.getErrStr(),null,error.getErrStr()+"");
    }
}
