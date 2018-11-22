package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    int insert(User user);

    User login(@Param("username") String username, @Param("password") String password);

    User get(Integer id);

    int update(User user);

    int delete();

    List<User> queryAll();
}