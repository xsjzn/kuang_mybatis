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
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

}
