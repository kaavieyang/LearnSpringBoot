package com.kaavie.sprintboot.controller;

import com.kaavie.sprintboot.entity.User;
import com.kaavie.sprintboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaavie on 17/10/9.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;
@RequestMapping("/hello")
    public String hello(){
   User user = userServiceImpl.getUserById();
    System.out.println(userServiceImpl);
    System.out.println(user.getId());
    System.out.println(user.getName());
    return "hello";

}
}
