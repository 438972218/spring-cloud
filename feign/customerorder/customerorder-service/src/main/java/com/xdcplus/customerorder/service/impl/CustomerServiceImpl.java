package com.xdcplus.customerorder.service.impl;

import com.xdcplus.customerorder.entity.Customer;
import com.xdcplus.customerorder.mapper.CustomerMapper;
import com.xdcplus.customerorder.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fish
 * @since 2021-04-13
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
