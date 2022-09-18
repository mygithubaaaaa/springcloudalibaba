package com.liupan.order.controller;

import com.liupan.order.feign.OrderBaseController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:OrderController
 * Author:  Liu pan 刘攀
 * Date:    2022/9/16 1:20
 */
@RefreshScope
@RestController
public class OrderController implements OrderBaseController {

    @Value("${aaaa:1221}")
    private String username;

    @Override
    public String getOrder(){
        return "hello " + username;
    }
}
