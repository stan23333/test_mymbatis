package test_mybatis.mapper;


import com.test_mybatis.mapper.StudentMapper;
import com.test_mybatis.pojo.Student;
import com.test_mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    SqlSession sqlSession;
    StudentMapper studentMapper;

    Logger logger;


    @Before
    public void getSqlSession() {
        sqlSession = MybatisUtils.getSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
        logger = Logger.getLogger(StudentMapperTest.class);
    }

    @After
    public void closeSqlSession() {
        sqlSession.close();
    }


    @Test
    public void getAllUser() {

        List<Student> students = studentMapper.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }


    }

    @Test
    public void getAllStudent() {
        List<Student> allStudents = studentMapper.getStudents();
        for (Student allStudent : allStudents) {
            System.out.println(allStudent);
        }
    }

}
