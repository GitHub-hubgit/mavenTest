package com.iotek.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Auther: 邪灵
 * @Date: 2019/11/21 09:58
 * @Description: 用户类
 * @Since: 1.0
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String pass;
    private Byte age;
    private Character type;

    public User() {
    }

    public User(Integer id, String name, String pass, Byte age, Character type) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(pass, user.pass) &&
                Objects.equals(age, user.age) &&
                Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pass, age, type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User").append(":[")
                .append("id=")
                .append(id)
                .append(",name=")
                .append(name)
                .append(",pass=")
                .append(pass)
                .append(",age=")
                .append(age)
                .append(",type=")
                .append(type)
                .append("]  ");
        return sb.toString();
    }
}
