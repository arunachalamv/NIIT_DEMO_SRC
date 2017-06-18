package com.niit.demo.springmvc.service;

import com.niit.demo.springmvc.model.Login;
import com.niit.demo.springmvc.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
