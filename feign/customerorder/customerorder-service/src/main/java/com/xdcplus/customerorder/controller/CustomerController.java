package com.xdcplus.customerorder.controller;


import com.xdcplus.customerorder.mapper.CustomerMapper;
import com.xdcplus.system.annotation.DB;
import com.xdcplus.system.common.enums.DataSourceType;
import com.xdcplus.system.datasource.DynamicDataSourceContextHolder;
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
@RefreshScope
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerMapper customerMapper;

    @DB(DataSourceType.DB2)
    @GetMapping("/selectbyid/{id}")
    public String selectOneById(@PathVariable("id") Integer id){

        //手动切换数据源
//        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.DB2.name());
        return customerMapper.selectById(id).getFullName();
    }

}
