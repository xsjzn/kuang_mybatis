package com.xsj.dao;

import com.xsj.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xsj
 * @create 2020-12-18 17:17
 */
public interface TeacherMapper {



    Teacher getTeacherById(@Param("tid") int id);

    Teacher getTeacherById2(@Param("tid") int id);
}
