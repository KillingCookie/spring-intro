package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan
public class MyApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyApp.class);

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);

        MessageService secondMessageService = applicationContext.getBean("randomMessageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(secondMessageService.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(secondMessageService.hashCode());

    }

}
