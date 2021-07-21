package test_mybatis.mapper;

import com.test_mybatis.mapper.UserMapperAnnotate;
import com.test_mybatis.pojo.User;
import com.test_mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AnnotateTest {
    @Test
    public void getAllUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapperAnnotate mapper = sqlSession.getMapper(UserMapperAnnotate.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
