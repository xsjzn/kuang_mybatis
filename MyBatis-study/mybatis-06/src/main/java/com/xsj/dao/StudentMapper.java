package com.xsj.dao;

import com.xsj.pojo.Student;

import java.util.List;

/**
 * @author xsj
 * @create 2020-12-18 17:17
 */
public interface StudentMapper {

    //查询所有学生信息以及老师信息
    public List<Student> getStudent();

    //查询所有学生信息以及老师信息
    public List<Student> getStudent2();
}
