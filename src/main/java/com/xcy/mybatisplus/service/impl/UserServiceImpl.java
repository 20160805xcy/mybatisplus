package com.xcy.mybatisplus.service.impl;

import com.xcy.mybatisplus.entity.User;
import com.xcy.mybatisplus.mapper.UserMapper;
import com.xcy.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jerry
 * @since 2020-07-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
