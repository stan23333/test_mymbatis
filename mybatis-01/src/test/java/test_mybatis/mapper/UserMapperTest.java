package test_mybatis.mapper;

import com.test_mybatis.mapper.UserMapper;
import com.test_mybatis.mapper.UserMapperAnnotate;
import com.test_mybatis.pojo.User;
import com.test_mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    SqlSession sqlSession;
    UserMapper userMapper;

    Logger logger;


    @Before
    public void getSqlSession() {
        sqlSession = MybatisUtils.getSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        logger = Logger.getLogger(UserMapperTest.class);
    }

    @After
    public void closeSqlSession() {
        sqlSession.close();
    }


    @Test
    public void getAllUser() {

        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void getUserById() {

        User user = userMapper.getUserById(1);
        System.out.println(user);


    }

    @Test
    public void inserUser() {

        User user = new User(6936, "test_mybatis", "root", "男", "李好田", "学生", "11161", "");
        userMapper.insertUser(user);

    }

    @Test
    public void test_logger() {
        logger.info("info:进入test_logger");
    }
}
