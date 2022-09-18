package com.liupan.order.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:OrderFeignClient
 * Author:  Liu pan 刘攀
 * Date:    2022/9/17 23:48
 */
@FeignClient(name = "order-service",value = "order-service",contextId = "contextId")
public interface OrderFeignClient extends OrderBaseController{
}
