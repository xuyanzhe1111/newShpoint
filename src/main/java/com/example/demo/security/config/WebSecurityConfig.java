package com.example.demo.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService authUserDetailsService;
    @Autowired
    private AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> authenticationDetailsSource;

    @Bean
    AccessDeniedServletHandler accessDeniedServletHandler() {
        return new AccessDeniedServletHandler();
    }

    @Bean
    CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler() {
        return new CustomAuthenticationSuccessHandler();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.exceptionHandling().accessDeniedHandler(accessDeniedServletHandler());
        http.headers().frameOptions().disable();
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(
                        "/css/**",
                        "/fonts/**",
                        "/js/**",
                        "/login/**",
                        "/403",
                        "/getCurrentUserName"
                ).permitAll() //默认不拦截静态资源的url pattern （2）
                .antMatchers("/ExportProjectData", "/dataTable/downLoadExcel").hasAnyRole("ADMIN", "OWERN")
                .antMatchers("/ImportProjectData",
                        "/projectData/ProjectColumnDefinitionList",
                        "/dataTable/updataTable",
                        "/dataTable/createNewTable",
                        "/dataTable/deleteTable",
                        "/dataTable/upExcel"
                        ).hasAnyRole("OWERN")
                .and().authorizeRequests().anyRequest().authenticated()
                .and().formLogin().loginPage("/login").authenticationDetailsSource(authenticationDetailsSource)// 登录url请求路径 (3)
                .successHandler(customAuthenticationSuccessHandler())
                .and() // 登录成功跳转路径url(4)
                .logout().logoutSuccessUrl("/").permitAll()
                .and().sessionManagement().invalidSessionUrl("/login");
    }

    @Bean
    public LoginAuthenticationProvider provider() {
        return new LoginAuthenticationProvider();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authUserDetailsService); // （6）
        auth
                //添加自定义的认证管理类
                .authenticationProvider(provider());
    }

}