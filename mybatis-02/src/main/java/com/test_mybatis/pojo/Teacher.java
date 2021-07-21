package com.test_mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher {
    private String id;
    private String name;
    private String sex;
    private String age;
    private List<Student> students;
}
