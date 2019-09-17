package com.eugene.jwttoken.service.impl;

import com.eugene.common.peroperty.JwtProperty;
import com.eugene.jwttoken.model.User;
import com.eugene.jwttoken.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtProperty jwtProperty;

    @Override
    public String login(String userName, String password) {
        return loginHandler(userName, password);
    }

    private String loginHandler(String userName, String password) {
        /*UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userName, password);
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = userDetailsService.loadUserByUsername(userName);*/

        return Jwts.builder().claim(userName, password)
                .setExpiration(new Date(System.currentTimeMillis() + Long.valueOf(jwtProperty.getExpiration()) * 1000))
                .signWith(SignatureAlgorithm.HS512, jwtProperty.getSecret()).compact();
    }

    @Override
    public List<User> fetchAllInfo() {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            users.add(new User(i, i, UUID.randomUUID().toString()));
        }

        return users;
    }
}
