package com.iotek.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 邪灵
 * @Date: 2019/12/31 14:51
 * @Description: 学生类
 * @Since: 1.0
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Byte age;
}
