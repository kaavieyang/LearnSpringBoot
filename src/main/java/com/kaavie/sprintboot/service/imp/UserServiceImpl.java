package com.kaavie.sprintboot.service.imp;

import com.kaavie.sprintboot.entity.User;
import com.kaavie.sprintboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by kaavie on 17/10/9.
 */
@Service
public class UserServiceImpl implements UserService{

    public User getUserById() {

        System.out.println("这里是最屌的!");
        return null;
    }
}
