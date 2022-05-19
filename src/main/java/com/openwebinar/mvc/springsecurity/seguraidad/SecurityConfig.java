package com.openwebinar.mvc.springsecurity.seguraidad;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rostro
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

           auth
                   .inMemoryAuthentication()
                   .passwordEncoder(NoOpPasswordEncoder.getInstance())
                   .withUser("admin")
                   .password("admin")
                   .roles("ADMIN");
    }
/*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
          
    }
    
    */
    
    
    
    
    
}
