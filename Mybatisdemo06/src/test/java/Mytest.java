import com.lzz.Dao.StudentMapper;
import com.lzz.Dao.TeacherMapper;
import com.lzz.pojo.Student;
import com.lzz.pojo.Teacher;
import com.lzz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {

    @Test
    public void test(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher();
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
    }

    @Test
    public void test1(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> s1 = mapper.getStudent();
        for (Student student : s1) {
            System.out.println(student);
        }
    }

    @Test
    public void test2(){
        SqlSession sqlSession = Mybatisutil.getsqlsession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> s1 = mapper.getStudent2();
        for (Student student : s1) {
            System.out.println(student);
        }
    }
}
