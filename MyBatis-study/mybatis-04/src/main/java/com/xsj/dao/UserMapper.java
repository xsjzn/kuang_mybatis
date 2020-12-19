package com.xsj.dao;

import com.xsj.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author xsj
 * @create 2020-12-17 11:15
 */
public interface UserMapper {


    //按id查询用户
    User getUserById(int id);

    List<User> getUserByLimit(Map<String,Integer> map);




}
