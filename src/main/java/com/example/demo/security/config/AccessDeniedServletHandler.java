package com.example.demo.security.config;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccessDeniedServletHandler implements AccessDeniedHandler {
    private static final String DEF_ERROR_PAGE_PATH="/403";

    @Override
    public void handle(HttpServletRequest req,
                       HttpServletResponse resp, AccessDeniedException reason) throws ServletException,
            IOException {
        boolean isAjax = "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));

//如果是ajax请求
        if (isAjax) {
        }
        else{
        }
        resp.sendRedirect(DEF_ERROR_PAGE_PATH);

    }


}