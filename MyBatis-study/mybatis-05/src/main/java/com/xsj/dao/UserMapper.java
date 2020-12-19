package com.xsj.dao;

import com.xsj.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author xsj
 * @create 2020-12-17 11:15
 */
public interface UserMapper {
    @Select("select * from user ")
    List<User> selectUsers();

    @Select("select * from user where id=#{id}")
    User selectUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Delete("delete from user where id=#{uid}")
    int deleteUser(@Param("uid") int id);

    @Update("update user set name=#{name}, pwd=#{password} where id=#{id}")
    int updateUser(User user);




}
