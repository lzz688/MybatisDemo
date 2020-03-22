package com.lzz.Dao;

import com.lzz.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    //获取指定老师和对应学生的所有信息
    List<Teacher> getTeacher(@Param("tid") int id);

}
