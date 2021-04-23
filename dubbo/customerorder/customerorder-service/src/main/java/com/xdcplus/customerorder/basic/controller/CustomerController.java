package com.xdcplus.customerorder.basic.controller;


import com.xdcplus.customerorder.basic.entity.Customer;
import com.xdcplus.customerorder.basic.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
@RestController
@RequestMapping("//customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public Map<Integer, Customer> get(){
        return customerService.getCustomers();
    }

}
