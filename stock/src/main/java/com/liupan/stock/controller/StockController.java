package com.liupan.stock.controller;

import com.liupan.order.feign.OrderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:StockController
 * Author:  Liu pan 刘攀
 * Date:    2022/9/17 23:52
 */
@RestController
@RequestMapping("stock")
public class StockController {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @GetMapping("callOrder")
    public String callOrder(){
        return orderFeignClient.getOrder();
    }
}
