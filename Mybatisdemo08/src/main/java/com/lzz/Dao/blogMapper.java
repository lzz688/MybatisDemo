package com.lzz.Dao;

import com.lzz.pojo.blog;

import java.util.List;
import java.util.Map;

public interface blogMapper {

    int addBook(blog blog);

    List<blog> queryBlogIF(Map map);

    List<blog> queryBlogIF1(Map map);
}
