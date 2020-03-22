package com.lzz.Dao;

import com.lzz.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from Teacher")
    List<Teacher> getTeacher();




}
