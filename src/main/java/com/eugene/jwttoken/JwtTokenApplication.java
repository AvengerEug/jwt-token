package com.eugene.jwttoken;

import com.eugene.common.annotation.EnableFilters;
import com.eugene.jwttoken.annotation.EnablePropertyClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableFilters
@EnablePropertyClass
public class JwtTokenApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(JwtTokenApplication.class);
        springApplication.run(args);
    }
}
