package com.xsj.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author xsj
 * @create 2020-12-17 11:13
 */
//实体类 在<typeAliases>中使用<package>时 如果用的是package按照包名寻找类时，那么可以用注解再取一个别名
@Alias("user")
public class User {
    private int id;
    private String name;
    private String password;

    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
