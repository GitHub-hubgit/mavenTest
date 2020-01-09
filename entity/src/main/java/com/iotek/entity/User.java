package com.iotek.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: 邪灵
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

    /**
     * @date  2019/12/3 16:30
     * @param id 主键属性
     * @param name 姓名
     * @param pass 密码
     * @param age 年龄
     * @param type 类型
     * @return 
     * @description 全参的构造方法
     */
    public User(Integer id, String name, String pass, Byte age, Character type) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.type = type;
    }

    /**
     * @date  2019/12/3 16:31
     * @param name 姓名
     * @param pass 密码
     * @param age 年龄
     * @param type 类型
     * @return 
     * @description 除主键外属性构造
     */
    public User(String name, String pass, Byte age, Character type) {
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.type = type;
    }

    /**
     * @date  2019/12/3 16:33
     * @param 
     * @return java.lang.Integer
     * @description id属性的getter方法
     */
    public Integer getId() {
        return id;
    }

    /**
     * @date  2019/12/3 16:33
     * @param id
     * @return void
     * @description ID属性的setter方法
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @date  2019/12/3 16:34
     * @param 
     * @return java.lang.String
     * @description name属性的getter方法
     */
    public String getName() {
        return name;
    }

    /**
     * @date  2019/12/3 16:34
     * @param name
     * @return void
     * @description name属性的setter方法
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @date  2019/12/3 16:34
     * @param 
     * @return java.lang.String
     * @description pass属性的getter方法
     */
    public String getPass() {
        return pass;
    }

    /**
     * @date  2019/12/3 16:34
     * @param pass
     * @return void
     * @description pass属性的setter方法
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @date  2019/12/3 16:35
     * @param 
     * @return java.lang.Byte
     * @description age属性的getter方法
     */
    public Byte getAge() {
        return age;
    }

    /**
     * @date  2019/12/3 16:35
     * @param age
     * @return void
     * @description age属性的setter方法
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * @date  2019/12/3 16:35
     * @param 
     * @return java.lang.Character
     * @description type属性的getter方法
     */
    public Character getType() {
        return type;
    }

    /**
     * @date  2019/12/3 16:35
     * @param type
     * @return void
     * @description type属性的setter方法
     */
    public void setType(Character type) {
        this.type = type;
    }

    /**
     * @date  2019/12/3 16:32
     * @param o 任意对象
     * @return boolean 是否相同
     * @description 重写equals方法
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(pass, user.pass) &&
                Objects.equals(age, user.age) &&
                Objects.equals(type, user.type);
    }

    /**
     * @date  2019/12/3 16:33
     * @param 
     * @return int
     * @description 重写hashcode方法
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, pass, age, type);
    }

    /**
     * @date  2019/12/3 16:33
     * @param 
     * @return java.lang.String
     * @description 重写tostring方法
     */
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
