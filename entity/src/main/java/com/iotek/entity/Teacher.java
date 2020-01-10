package com.iotek.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author: 邪灵
 * @Date: 2020/1/10 17:31
 * @Description: 教师类
 * @Since: 1.0
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String pass;
}
