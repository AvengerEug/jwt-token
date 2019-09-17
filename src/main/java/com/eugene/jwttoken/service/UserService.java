package com.eugene.jwttoken.service;

import com.eugene.jwttoken.model.User;

import java.util.List;

public interface UserService {

    String login(String userName, String password);

    List<User> fetchAllInfo();
}
