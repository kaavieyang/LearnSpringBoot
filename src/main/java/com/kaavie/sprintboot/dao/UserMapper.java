package com.kaavie.sprintboot.dao;

import com.kaavie.sprintboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

/**
 * Created by kaavie on 17/10/10.
 */
@Mapper
public interface UserMapper {
   public User getUserById();
}
