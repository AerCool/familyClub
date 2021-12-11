/*
 * Copyright (c) 2021-2030 丰尚智慧农牧科技有限公司
 * 不能修改和删除上面的版权声明
 * 此代码属于丰尚智慧农牧科技有限公司编写，在未经允许的情况下不得传播复制
 */
package com.aercool.construct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 构造方法推断
 *
 * @author AerCool Yang
 * @date 2021-12-11 14:09:56
 */
@Component
public class UserService {

    public UserService() {
        System.out.println("我是无参构造方法");
    }

    @Autowired
    public UserService(OrderService orderService) {
        System.out.println("我是UserService的有参构造方法:" + orderService);
    }

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext con =
                     new AnnotationConfigApplicationContext(Config.class)) {
            Object userService = con.getBean("userService");
            System.out.println(userService);
        }
    }
}
