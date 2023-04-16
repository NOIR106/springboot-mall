package com.stan.springbootmall.service.impl;


import com.stan.springbootmall.dao.UserDao;
import com.stan.springbootmall.dto.UserRegisterRequest;
import com.stan.springbootmall.model.User;
import com.stan.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
