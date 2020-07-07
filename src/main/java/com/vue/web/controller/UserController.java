package com.vue.web.controller;

import com.vue.domain.User;
import com.vue.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private IuserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }
    @RequestMapping("/updateUser")
    public void updateUser (@RequestBody User user){
        System.out.println(user);
        userService.updateUser(user);
    }
    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestBody User user){
        userService.deleteUser(user);
    }
    @RequestMapping("/insertUser")
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }
}
