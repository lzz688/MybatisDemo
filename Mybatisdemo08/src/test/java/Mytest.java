import com.lzz.Dao.blogMapper;
import com.lzz.pojo.blog;
import com.lzz.utils.IDutils;
import com.lzz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mytest {

    @Test
    public void test(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);

        blog blog=new blog();
        blog.setId(IDutils.getid());
        blog.setTitle("xxxx");
        blog.setAuthor("yyyy");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDutils.getid());
        blog.setTitle("java");
        mapper.addBook(blog);

        blog.setId(IDutils.getid());
        blog.setTitle("c");
        mapper.addBook(blog);

        blog.setId(IDutils.getid());
        blog.setTitle("c++");
        mapper.addBook(blog);

        sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void test1(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        HashMap map=new HashMap();
        //map.put("title","java");
        //map.put("author","张三");
        map.put("view","9999");
        List<blog> blogs = mapper.queryBlogIF1(map);
        for (blog blog : blogs) {
            System.out.println(blog);
        }
    }
}

