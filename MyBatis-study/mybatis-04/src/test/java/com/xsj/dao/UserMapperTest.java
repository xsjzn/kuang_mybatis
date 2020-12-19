package com.xsj.dao;

import com.xsj.pojo.User;
import com.xsj.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;

/**
 * @author xsj
 * @create 2020-12-17 11:27
 */
public class UserMapperTest {
    static Logger logger=Logger.getLogger(UserMapperTest.class);
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testLog4j(){
        logger.debug("debug:进入了testLog4j");
        logger.info("info:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }
    @Test
    public void testUserMapper(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userByLimit = userMapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}
