/*
 * Copyright (c) 2021-2030 丰尚智慧农牧科技有限公司
 * 不能修改和删除上面的版权声明
 * 此代码属于丰尚智慧农牧科技有限公司编写，在未经允许的情况下不得传播复制
 */
package com.aercool.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 基于注解
 *
 * @author AerCool Yang
 * @date 2021-12-04 11:47:09
 */
@ComponentScan
public class Config {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
