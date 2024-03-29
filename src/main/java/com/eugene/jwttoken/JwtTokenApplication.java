package com.eugene.jwttoken;

import com.eugene.common.annotation.EnableCors;
import com.eugene.common.annotation.EnableFilters;
import com.eugene.jwttoken.annotation.EnablePropertyClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFilters
@EnablePropertyClass
@EnableCors
public class JwtTokenApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(JwtTokenApplication.class);
        springApplication.run(args);
    }
}
