package com.zx.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.zx.demo"})
@MapperScan(basePackages = "com.zx.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
