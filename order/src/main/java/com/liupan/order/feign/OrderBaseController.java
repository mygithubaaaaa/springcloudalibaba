package com.liupan.order.feign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:OrderBaseController
 * Author:  Liu pan 刘攀
 * Date:    2022/9/18 0:05
 */
public interface OrderBaseController {

    @PostMapping("get")
    String getOrder();
}
