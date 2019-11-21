package com.iotek.dao;

import com.iotek.entity.User;

import java.util.List;

/**
 * @Auther: 邪灵
 * @Date: 2019/11/21 10:47
 * @Description: 用户dao接口
 * @Since: 1.0
 */
public interface IUserDao {
    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    User queryUserById(Integer id);
    List<User> queryAllUser();
}
