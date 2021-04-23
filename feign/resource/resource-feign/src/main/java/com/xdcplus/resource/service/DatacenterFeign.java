package com.xdcplus.resource.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**   
 * @Description:  [Feign远程调用服务接口]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@FeignClient(name = "resource-feign-service")
@RequestMapping("//customer")
public interface DatacenterFeign {

    @GetMapping(value = "/selectbyid/{id}")
    public String selectOneById(@PathVariable("id") Integer id);


}
