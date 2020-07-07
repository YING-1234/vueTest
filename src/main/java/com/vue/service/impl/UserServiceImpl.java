package com.vue.service.impl;

import com.vue.dao.IUserDao;
import com.vue.domain.User;
import com.vue.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IuserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }
    @Override
    public User findById(Integer userId){
        return userDao.findById(userId);
    }
    @Override
    public void updateUser(User user){
        userDao.updateUser(user);
    }
    @Override
    public void deleteUser(User user){
        userDao.deleteUser(user);
    }

    /*@Override
    public void insertUser(Integer id, String username, String password, Integer age, String sex, String email) {

    }*/

    @Override
    public void insertUser(User user){
        userDao.insertUser(user);
    }
}
