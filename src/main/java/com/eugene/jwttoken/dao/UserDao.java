package com.eugene.jwttoken.dao;

import com.eugene.common.dao.BaseDAO;
import com.eugene.jwttoken.model.User;

public interface UserDao extends BaseDAO<User, Integer> {

    User checkLoginInfo(String userName, String password);
}
