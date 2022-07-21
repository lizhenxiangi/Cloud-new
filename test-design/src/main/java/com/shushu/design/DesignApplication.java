package com.shushu.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: DesignApplication
 * @Author: ShiQian
 * @Creat: 2022/6/26 10:53
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DesignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class,args);
    }
}
