package com.example.demo;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoTests {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSave() {
        userMapper.insert(new User(3, "21", "12"));
    }

    @Test
    public void testQuery() {
        User login = userMapper.login("1", "2");
        System.out.println(login);
    }


}
