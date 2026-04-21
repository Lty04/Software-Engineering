package com.takeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.takeout.dto.LoginDTO;
import com.takeout.dto.RegisterDTO;
import com.takeout.entity.User;

import java.util.Map;

/**
 * 用户服务接口
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     */
    boolean register(RegisterDTO registerDTO);

    /**
     * 用户登录
     */
    Map<String, Object> login(LoginDTO loginDTO);

    /**
     * 根据用户名查询用户
     */
    User getByUsername(String username);
}
