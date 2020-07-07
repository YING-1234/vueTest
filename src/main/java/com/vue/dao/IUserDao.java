package com.vue.dao;

import com.vue.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
//    查询用户
    @Select("select * from user")
    List<User> findAll();
//    根据id查询用户
    @Select("select * from user where id=#{userId}")
    User findById(Integer userId);
//    修改用户
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);
//    新增用户(username,password,age,sex,email)
    @Insert("insert into user (id,username,password,age,sex,email) values (null,#{username},#{password},#{age},#{sex},#{email})")
    void insertUser(User user);
//    删除用户
    @Delete("delete from user where id=#{id}")
    void deleteUser(User user);
}
