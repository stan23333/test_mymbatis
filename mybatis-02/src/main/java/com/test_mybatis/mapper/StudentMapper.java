package com.test_mybatis.mapper;

import com.test_mybatis.pojo.Student;
import com.test_mybatis.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    /**
     * 按照查询嵌套处理
     *
     * @return
     */
    List<Student> getAllStudents();
    /**
     * 按照结果嵌套处理
     *
     * @return
     */
    List<Student> getStudents();

    Teacher getTeacher(String tid);



}
