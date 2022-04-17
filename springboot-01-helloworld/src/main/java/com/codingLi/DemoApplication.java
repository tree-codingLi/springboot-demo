package com.codingLi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明我们的入口类，并且声明是springboot项目的
 */
@SpringBootApplication
public class DemoApplication {

    //程序入口
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
