package com.stack8802;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(value = "com.stack8802.mapper")
@EnableDiscoveryClient
public class Stack8802Application {

    public static void main(String[] args) {
        SpringApplication.run(Stack8802Application.class, args);
    }

}
