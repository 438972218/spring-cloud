package com.xdcplus.resource.controller;


import com.xdcplus.customerorder.service.CustomerFeign;
import com.xdcplus.resource.service.DatacenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fish
 * @since 2021-04-13
 */
//@RefreshScope
@RestController
@RequestMapping("/datacenter")
public class DatacenterController {

    @Autowired
    DatacenterService datacenterService;

    @GetMapping("/selectname/{id}")
    public String selectOneById(@PathVariable("id") Integer id){
        return datacenterService.selectName(id);
    }


}
