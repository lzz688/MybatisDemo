package com.lzz.Dao;

import com.lzz.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


public interface UserMapper {

    //查询所有用户
    @Select("select * from User ")
    List<User> getuserlist();

    //根据ID查询用户
    @Select("select * from User where id=#{uid}")
    User getUserById(@Param("uid") int id);

    //增加用户
    @Insert("insert into User (id,name,password) values(#{id},#{name},#{password})")
    String addUser(User user);

    //通过map去实现增删改更加万能
    void UpdateUser1(Map<String, Object> map);

    //删除用户
    @Delete("delete from User where id=#{uid}")
    String DeleteUser(@Param("uid")int id);

    //更改用户
    @Update("update #{name},#{passowrd} from User where id=#{id}")
    String UpdateUser(User user);

}
