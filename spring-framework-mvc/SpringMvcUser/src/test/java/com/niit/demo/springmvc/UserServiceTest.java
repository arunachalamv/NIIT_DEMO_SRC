package com.niit.demo.springmvc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.demo.springmvc.model.Login;
import com.niit.demo.springmvc.model.User;
import com.niit.demo.springmvc.service.UserService;

@ContextConfiguration(locations = { "classpath:com/niit/demo/config/user-beans.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

  @Autowired
  UserService userService;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testValidateUser() {

    Login login = new Login();
    login.setUsername("sriram");
    login.setPassword("password");

    User user = userService.validateUser(login);

    assertEquals("Seshagiri", user.getFirstname());
  }

}
