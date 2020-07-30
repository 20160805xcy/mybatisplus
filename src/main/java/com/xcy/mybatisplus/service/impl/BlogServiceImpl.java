package com.xcy.mybatisplus.service.impl;

import com.xcy.mybatisplus.entity.Blog;
import com.xcy.mybatisplus.mapper.BlogMapper;
import com.xcy.mybatisplus.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
