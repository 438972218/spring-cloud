package com.xdcplus.resource.basic.controller;


import com.xdcplus.resource.basic.entity.Datacenter;
import com.xdcplus.resource.basic.service.DatacenterService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fish
 * @since 2021-04-07
 */
@RestController
@RequestMapping("//datacenter")
public class DatacenterController {

    @Reference
    DatacenterService datacenterService;

    @GetMapping("/dubbo/sayHi/{id}")
    public Datacenter get(@PathVariable("id") Integer id){
        return datacenterService.getById(id);
    }


}
