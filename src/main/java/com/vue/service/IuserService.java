package com.vue.service;

import com.vue.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IuserService {
//    查询用户列表
    List<User> findAll();
//    根据ID查询用户
    User findById(Integer userId);
//    修改用户
    void updateUser(User user);
//    删除用户
    void deleteUser(User user);
//    新增用户
    void insertUser(User user);

//    void insertUser(User user, User user2, User user3, User user4, User user5, User user6);
}
