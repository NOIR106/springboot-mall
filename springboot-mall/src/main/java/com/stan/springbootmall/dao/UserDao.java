package com.stan.springbootmall.dao;

import com.stan.springbootmall.dto.UserRegisterRequest;
import com.stan.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
