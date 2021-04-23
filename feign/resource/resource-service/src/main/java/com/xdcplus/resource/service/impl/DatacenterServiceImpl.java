package com.xdcplus.resource.service.impl;

import com.xdcplus.customerorder.service.CustomerFeign;
import com.xdcplus.resource.entity.Datacenter;
import com.xdcplus.resource.mapper.DatacenterMapper;
import com.xdcplus.resource.service.DatacenterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DatacenterServiceImpl extends ServiceImpl<DatacenterMapper, Datacenter> implements DatacenterService {

    @Autowired
    CustomerFeign customerFeign;

    @Override
    public String selectName(Integer id) {
        return customerFeign.selectOneById(id);
    }
}
