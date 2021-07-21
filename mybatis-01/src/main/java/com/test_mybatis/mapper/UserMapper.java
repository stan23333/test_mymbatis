package com.test_mybatis.mapper;

import com.test_mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 获取全部用户
     * @return
     */
    List<User> getUserList();

    /**通过id获取用户
     *
     * @param id
     * @return
     */
    User getUserById( int id);

    /**插入用户
     *
     * @param user
     */
    void insertUser(User user);
}
