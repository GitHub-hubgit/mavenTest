package com.iotek.serviceImpl;

import com.iotek.dao.IUserDao;
import com.iotek.entity.User;
import com.iotek.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 邪灵
 * @Date: 2019/11/21 10:54
 * @Description: 用户service实现类
 * @Since: 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public boolean saveUser(User user) {
        userDao.addUser(user);
        return true;
    }

    @Override
    public boolean deleteUser(User user) {
        userDao.deleteUser(user);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        userDao.updateUser(user);
        return true;
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }
}
