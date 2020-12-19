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
    public void Test(){
        SqlSession sqlSession = MybatisUtil.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherByTid = mapper.getTeacherByTid(1);
        System.out.println(teacherByTid);
        sqlSession.close();
    }

    @Test
    public void getStudentTest(){
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void getStudent2Test(){
        SqlSession sqlSession = MybatisUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }


}
