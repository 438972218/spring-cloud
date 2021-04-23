package com.xdcplus.customerorder.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**   
 * @Description:  [Feign远程调用服务接口]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@FeignClient(name = "customerorder-feign-service")
@RequestMapping("/customer")
public interface CustomerFeign {

    @GetMapping(value = "/selectbyid/{id}")
    String selectOneById(@PathVariable("id") Integer id);


}
