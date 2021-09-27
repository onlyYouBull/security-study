package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class SecurityBasicApplication {
    public static void main(String[] args) {
            SpringApplication.run(SecurityBasicApplication.class,args);
    }
}
