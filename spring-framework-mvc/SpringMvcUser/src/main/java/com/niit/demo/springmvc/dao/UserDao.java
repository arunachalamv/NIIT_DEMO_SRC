package com.niit.demo.springmvc.dao;

import com.niit.demo.springmvc.model.Login;
import com.niit.demo.springmvc.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}
