package com.iotek.service;

import com.iotek.entity.User;

import java.util.List;

/**
 * @Auther: 邪灵
 * @Date: 2019/11/21 10:52
 * @Description: 用户service接口
 * @Since: 1.0
 */
public interface IUserService {
    boolean saveUser(User user);
    boolean deleteUser(User user);
    boolean updateUser(User user);
    User queryUserById(Integer id);
    List<User> queryAllUser();
}
