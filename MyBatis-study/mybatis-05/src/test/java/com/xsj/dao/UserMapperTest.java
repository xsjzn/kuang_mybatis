package com.xsj.dao;

import com.xsj.pojo.User;
import com.xsj.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;


import java.util.List;

/**
 * @author xsj
 * @create 2020-12-17 11:27
 */
public class UserMapperTest {
    @Test
    public void selectUsersTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void selectUserByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUserTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.addUser(new User(4, "qwew", "12312"));
        sqlSession.close();
    }


    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.deleteUser(6);
        sqlSession.close();
    }


    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.updateUser(new User(3, "阿青", "das213"));
        sqlSession.close();
    }


}
