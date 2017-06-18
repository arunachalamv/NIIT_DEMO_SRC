package com.niit.demo.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.demo.springmvc.dao.UserDao;
import com.niit.demo.springmvc.model.Login;
import com.niit.demo.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
