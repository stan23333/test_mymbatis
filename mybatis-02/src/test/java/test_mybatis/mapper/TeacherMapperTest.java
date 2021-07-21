package test_mybatis.mapper;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.test_mybatis.mapper.TeacherMapper;
import com.test_mybatis.pojo.Teacher;
import com.test_mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherMapperTest {
    SqlSession sqlSession;
    TeacherMapper mapper;

    @Before
    public void getSqlsession() {
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void closeSqlsession() {
        sqlSession.close();
    }

    @Test
    public void testGetAllTeacher() {
        List<Teacher> teachers = mapper.getAllTeacher();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Test
    public void testGetTeacher() {
        List<Teacher> teachers = mapper.getTeacher();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Test
    public void testGetTeacherByParam() {
        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("name","admin");
        map.put("id", 2);
        Teacher teacher = mapper.getTeacherByParam(map);
        System.out.println(teacher);
    }

}
