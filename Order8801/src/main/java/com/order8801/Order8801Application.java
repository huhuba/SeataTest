package com.order8801;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@MapperScan(value = "com.order8801.dao")
@EnableFeignClients
@EnableDiscoveryClient
public class Order8801Application {

    public static void main(String[] args) {
        SpringApplication.run(Order8801Application.class, args);
    }

}
