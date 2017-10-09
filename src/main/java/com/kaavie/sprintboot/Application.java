package com.kaavie.sprintboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by kaavie on 17/10/9.
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) throws Exception {
        ApplicationContext ctx =SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}