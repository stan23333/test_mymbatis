package com.test_mybatis.mapper;

import com.test_mybatis.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapperAnnotate {
    @Select(" select * from hw_mangagement.user")
    List<User> getUserList();
}
