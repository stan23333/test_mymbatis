package com.test_mybatis.mapper;

import com.test_mybatis.pojo.Student;
import com.test_mybatis.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {
    /**
     * 按照查询嵌套处理
     *
     * @return
     */
    List<Teacher> getAllTeacher();

    /**
     * 按照结果嵌套处理
     * @return
     */
    List<Teacher> getTeacher();

    List<Student> getStudentByTid(String tid);

    Teacher getTeacherByParam(Map map);
}
