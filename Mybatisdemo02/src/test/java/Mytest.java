import com.lzz.Dao.UserMapper;
import com.lzz.pojo.User;
import com.lzz.util.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mytest {

    //查询所有用户
    @Test
    public void test(){
        SqlSession sqlSession= Mybatisutil.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList=mapper.getuserlist();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    //根据ID查询用户
    @Test
    public void test1(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //增加用户
    @Test
    public void test2(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String s = mapper.addUser(new User(4, "赵六", "147"));
        if (s!=null){
            System.out.println("增加成功");
        }
        sqlSession.commit();//提交事务
        sqlSession.close();
    }


    //通过map去实现增删改更加万能
    @Test
    public void test5(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map=new HashMap<String,Object>();
        map.put("zhuid",3);
        map.put("pwd",159);
        mapper.UpdateUser1(map);
        sqlSession.commit();
        sqlSession.close();
    }

    //删除用户
    @Test
    public void test3(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String i = mapper.DeleteUser(4);
        if (i!=null){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //更改用户
    @Test
    public void test4(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String s = mapper.UpdateUser(new User(4, "马七", "258"));
        if (s!=null){
            System.out.println("更改成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
