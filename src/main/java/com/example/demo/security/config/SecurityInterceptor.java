package com.example.demo.security.config;

import org.apache.catalina.Manager;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


public class SecurityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println(""+request.getRequestURI());
		String path = request.getRequestURI();
        HttpSession session = request.getSession();
        Manager manager = (Manager) session.getAttribute(session.getId());
        //如果是ajax请求
        boolean isAjax = "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
        if (null == manager || null == session) {
            //如果是ajax请求
            if (isAjax) {
                String jsonObject = "{\"success\":false,\"isLoginRequired\":true}";
                String contentType = "application/json";
                response.setContentType(contentType);
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = response.getWriter();
                out.print(jsonObject);
                out.flush();
                out.close();
                return false;
            }else{
                response.sendRedirect(request.getContextPath()+"/manager/toLogin");
                return false;
            }
        }else{
            return true;
        }
    }

}