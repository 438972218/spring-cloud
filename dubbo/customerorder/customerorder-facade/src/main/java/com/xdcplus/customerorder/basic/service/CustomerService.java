package com.xdcplus.customerorder.basic.service;

import com.xdcplus.customerorder.basic.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
public interface CustomerService extends IService<Customer> {

    Map<Integer, Customer> getCustomers();

}
