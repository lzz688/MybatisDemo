package com.lzz.utils;


import java.util.UUID;

@SuppressWarnings("all")//镇压警告
//生成随机ID
public class IDutils {
    public static String getid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
