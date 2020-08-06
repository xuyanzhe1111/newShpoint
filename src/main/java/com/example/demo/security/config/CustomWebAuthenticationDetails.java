package com.example.demo.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class CustomWebAuthenticationDetails extends WebAuthenticationDetails {
    private static final long serialVersionUID = 6975601077710753878L;
    @Getter
    @Setter
    private String verificationCode;

    public CustomWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        Map<String, String[]> s = request.getParameterMap();
        if(s.containsKey("verificationCode")){
            verificationCode=s.get("verificationCode")[0];
        }else{
            verificationCode=null;
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
