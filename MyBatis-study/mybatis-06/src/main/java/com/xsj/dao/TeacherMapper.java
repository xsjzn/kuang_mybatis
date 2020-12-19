package com.xsj.dao;

import com.xsj.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xsj
 * @create 2020-12-18 17:17
 */
public interface TeacherMapper {

    public Teacher getTeacherByTid(int id);
}
