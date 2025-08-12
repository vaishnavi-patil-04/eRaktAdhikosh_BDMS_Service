package com.bloodbank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void init(SecurityBuilder builder) throws Exception {

    }

    @Override
    public void configure(SecurityBuilder builder) throws Exception {

    }
}
