package com.lzz.pojo;


import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;

    //多个学生对应一个老师，利用类的组合
    private Teacher teacher;
}
