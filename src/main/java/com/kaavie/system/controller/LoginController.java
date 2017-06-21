package com.kaavie.system.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaavie on 2017/6/20.
 */
@RestController
@EnableAutoConfiguration
public class LoginController {

    @RequestMapping("/")
    public String home(){
        return "hello";
    }
    public static void main(String[] args){

SpringApplication.run(LoginController.class,args);
    }

}
