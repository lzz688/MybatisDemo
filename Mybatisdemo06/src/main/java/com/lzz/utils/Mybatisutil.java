package com.lzz.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mybatisutil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream inputStream = null;
        try {
            //使用Mybatis第一步:获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //有了SqlSessionFactory，顾名思义，我们就可以从中获得SqlSession实例
    //SqlSession完全包含了面向数据库执行sql命令所需的所有方法
    public static SqlSession getsqlsession(){
        return sqlSessionFactory.openSession();
    }
}
