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

}
