package com.takeout.dto;

import lombok.Data;

/**
 * 用户登录 DTO
 */
@Data
public class LoginDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
