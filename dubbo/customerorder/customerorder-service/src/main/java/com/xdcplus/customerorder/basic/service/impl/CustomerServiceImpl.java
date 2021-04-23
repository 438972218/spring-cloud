package com.xdcplus.customerorder.basic.service.impl;

import com.xdcplus.customerorder.basic.entity.Customer;
import com.xdcplus.customerorder.basic.mapper.CustomerMapper;
import com.xdcplus.customerorder.basic.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
@Service(version = "1.0.0")
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

//    @DS("processplus")
    @Override
    public Map<Integer, Customer> getCustomers() {
        try {
            List<Customer> customers = customerMapper.selectList(null);
            HashMap<Integer, Customer> map = new HashMap<>();
            for (int i = 0; i <= customers.size() - 1; i++) {
                map.put(customers.get(i).getId(), customers.get(i));
            }
            return map;
        } catch (Exception e) {
            return null;
        }
    }
}
