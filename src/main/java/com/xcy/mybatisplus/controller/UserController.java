package com.xcy.mybatisplus.controller;


import com.xcy.mybatisplus.entity.User;
import com.xcy.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 * @author jerry
 * @since 2020-07-15
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Object index() {
        User user = userService.getById(1L);
        return user;
    }

}
