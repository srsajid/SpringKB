package com.sr;

import com.sr.aop_points.Operation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Operation helloService = context.getBean(Operation.class);
//        context.start();
        System.out.println(helloService.k());
    }
}
