package com.lingfeng.consumer;

import com.lingfeng.provider.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        UserService userService = app.getBean(UserService.class);
        String userName = userService.getUserNameById("000001");
        System.out.println("调用用户服务："+ userName);
    }
}
