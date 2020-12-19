package com.xsj.dao;

import com.xsj.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author xsj
 * @create 2020-12-17 11:15
 */
public interface UserMapper {
    //查询全部用户
    List<User> selectUser();

    //按id查询用户
    User getUserById(int id);
    //增加用户
    int addUser(User user);

    //删除指定id的用户
    int deleteUser(int id);
    //改用户信息
    int updateUser(User user);





}
