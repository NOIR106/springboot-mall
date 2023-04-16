package com.stan.springbootmall.service;

import com.stan.springbootmall.dto.UserRegisterRequest;
import com.stan.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
