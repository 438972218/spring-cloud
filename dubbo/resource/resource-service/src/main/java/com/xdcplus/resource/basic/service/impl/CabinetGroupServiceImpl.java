package com.xdcplus.resource.basic.service.impl;

import com.xdcplus.resource.basic.entity.CabinetGroup;
import com.xdcplus.resource.basic.mapper.CabinetGroupMapper;
import com.xdcplus.resource.basic.service.CabinetGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
@Service(version = "1.0.0")
public class CabinetGroupServiceImpl extends ServiceImpl<CabinetGroupMapper, CabinetGroup> implements CabinetGroupService {

}
