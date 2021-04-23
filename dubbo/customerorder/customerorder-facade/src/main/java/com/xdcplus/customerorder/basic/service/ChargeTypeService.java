package com.xdcplus.customerorder.basic.service;

import com.xdcplus.customerorder.basic.entity.ChargeType;
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
public interface ChargeTypeService extends IService<ChargeType> {

    Map<Integer, ChargeType> getChargeTypes();

    int insert(ChargeType chargeType);

}
