package com.xsj.dao;

import com.xsj.pojo.User;
import com.xsj.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xsj
 * @create 2020-12-17 11:27
 */
public class UserMapperTest {
    @Test
    public void selectUserTest(){
        //第一步获得sqlSession对象
        SqlSession sqlSession = MybatisUtil.getSession();
        //方式一:getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUserTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.addUser(new User(4, "大佬", "123"));
        if(i>0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        //增删改查要提交事物
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.deleteUser(4);
        if(i>0){
            System.out.println("删除成功");
        }
        //增删改查要提交事物
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.updateUser(new User(2,"祥林嫂","21312"));
        if(i>0){
            System.out.println("修改成功");
        }
        //增删改查要提交事物
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void getUserLikeTest(){
        SqlSession sqlSession=MybatisUtil.getSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserLike("%李%");
        for (User user : userLike) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
