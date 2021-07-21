package com.test_mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int id;
    private String uname;
    private String pwd;
    private String sex;
    private String rname;
    private String type;
    private String phone;
    private String status;





}
