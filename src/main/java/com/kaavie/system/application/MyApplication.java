package com.kaavie.system.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.redis.AutoConfigureDataRedis;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kaavie on 2017/6/20.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@AutoConfigureDataRedis
public class MyApplication {


public static void main(String[] args){
    SpringApplication.run(MyApplication.class,args);
}



}
