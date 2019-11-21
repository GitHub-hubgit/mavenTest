package com.iotek.controller;

import com.iotek.entity.User;
import com.iotek.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * @Auther: 邪灵
 * @Date: 2019/11/21 11:02
 * @Description: 用户controller
 * @Since: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    public String login(){
        userService.updateUser(new User());
        return "";
    }

}
