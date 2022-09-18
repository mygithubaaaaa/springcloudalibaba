package com.liupan.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:StockApplication
 * Author:  Liu pan 刘攀
 * Date:    2022/9/17 23:53
 */
@EnableFeignClients(basePackages = "com.liupan.order.feign")
@SpringBootApplication
public class StockApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class);
    }
}
