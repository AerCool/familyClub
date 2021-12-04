/*
 * Copyright (c) 2021-2030 丰尚智慧农牧科技有限公司
 * 不能修改和删除上面的版权声明
 * 此代码属于丰尚智慧农牧科技有限公司编写，在未经允许的情况下不得传播复制
 */
package com.aercool.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的创建
 *
 * @author AerCool Yang
 * @date 2021-12-04 11:44:14
 */
public class Main {

//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("spring.xml");
//
//        Object userService = context.getBean("userService");
//        System.out.println(userService);
//    }
//}

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(Config.class);
        Object userService = context.getBean("orderService");

        System.out.println(userService);
    }
}


