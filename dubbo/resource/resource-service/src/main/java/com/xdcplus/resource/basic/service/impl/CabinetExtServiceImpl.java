package com.xdcplus.resource.basic.service.impl;

import com.xdcplus.resource.basic.entity.CabinetExt;
import com.xdcplus.resource.basic.mapper.CabinetExtMapper;
import com.xdcplus.resource.basic.service.CabinetExtService;
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
public class CabinetExtServiceImpl extends ServiceImpl<CabinetExtMapper, CabinetExt> implements CabinetExtService {

}
