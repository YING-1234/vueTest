package com.vue.test;

import com.vue.domain.User;
import com.vue.service.IuserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class UserTest {
    @Autowired
    private IuserService userService;
    @Test
//    查
    public void testFindAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }
    @Test
//    改
    public void testFindById(){
        User user = userService.findById(2);
        System.out.println("修改前的用户"+user);
        user.setAge(18);
        userService.updateUser(user);
        user = userService.findById(2);
        System.out.println("修改后的用户"+user);
    }
    @Test
//    删
    public void testDelete(){
        User user = userService.findById(9);
        userService.deleteUser(user);
        System.out.println(user);
    }
    @Test
//    增
    public void testInsertUser(){
        User user = userService.findById(1);
        user.setUsername("张若昀");
        user.setPassword("1234");
        user.setAge(28);
        user.setSex("男");
        user.setEmail("zhangruoyun@163.com");
        userService.insertUser(user);
    }
}
