package com.xdcplus.customerorder.basic.controller;


import com.xdcplus.customerorder.basic.entity.Customer;
import com.xdcplus.customerorder.basic.service.CustomerService;
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
@RequestMapping("//customer")
public class CustomerController {

    @Reference(version = "1.0.0")
    CustomerService customerService;

    @GetMapping("/dubbo/sayHi/{id}")
    public Customer get(@PathVariable("id") Integer id){
        return customerService.getById(id);
    }


}
