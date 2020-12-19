package com.xsj.dao;

import com.xsj.pojo.Student;
import com.xsj.pojo.Teacher;
import com.xsj.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author xsj
 * @create 2020-12-18 17:29
 */
public class MyTest {


    @Test
    public void getTeacherTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById(1);
        System.out.println(teacherById);
        sqlSession.close();
    }

    @Test
    public void getTeacher2Test(){
        SqlSession sqlSession = MybatisUtil.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById2(1);
        System.out.println(teacherById);
        sqlSession.close();
    }

}
