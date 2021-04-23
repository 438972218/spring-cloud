package com.xdcplus.resource.basic.service.impl;

import com.xdcplus.resource.basic.entity.Datacenter;
import com.xdcplus.resource.basic.mapper.DatacenterMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xdcplus.resource.basic.service.DatacenterService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fish
 * @since 2021-04-07
 */
@Service(version = "1.0.0")
@Slf4j
public class DatacenterServiceImpl extends ServiceImpl<DatacenterMapper, Datacenter> implements DatacenterService {

}
