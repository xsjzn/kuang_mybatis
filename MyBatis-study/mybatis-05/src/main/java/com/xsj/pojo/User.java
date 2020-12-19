package com.xsj.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xsj
 * @create 2020-12-17 11:13
 */
//实体类 在<typeAliases>中使用<package>时 如果用的是package按照包名寻找类时，那么可以用注解再取一个别名
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;

}
