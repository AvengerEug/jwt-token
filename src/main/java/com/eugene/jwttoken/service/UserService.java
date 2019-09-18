package com.eugene.jwttoken.service;

import com.eugene.common.exception.BusinessException;
import com.eugene.jwttoken.model.User;

import java.util.List;

public interface UserService {

    String login(String userName, String password) throws BusinessException;

    List<User> fetchAllInfo();
}
