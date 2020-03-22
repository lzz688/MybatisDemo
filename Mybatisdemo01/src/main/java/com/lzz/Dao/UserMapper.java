package com.lzz.Dao;

import com.lzz.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询所有用户
    List<User> getuserlist();

    //根据ID查询用户
    User getUserById(int id);

    //增加用户
    String addUser(User user);

    //通过map去实现增删改更加万能
    void UpdateUser1(Map<String,Object> map);

    //删除用户
    String DeleteUser(int id);

    //更改用户
    String UpdateUser(User user);
}
