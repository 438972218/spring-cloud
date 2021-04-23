package com.xdcplus.customerorder.basic.service.impl;

import com.xdcplus.customerorder.basic.entity.ChargeType;
import com.xdcplus.customerorder.basic.mapper.ChargeTypeMapper;
import com.xdcplus.customerorder.basic.service.ChargeTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
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
@GlobalTransactional(rollbackFor = Exception.class)
@Service(version = "1.0.0")
public class ChargeTypeServiceImpl extends ServiceImpl<ChargeTypeMapper, ChargeType> implements ChargeTypeService {
    @Autowired
    ChargeTypeMapper chargeTypeMapper;

    @Override
    public Map<Integer, ChargeType> getChargeTypes() {
        try {
            List<ChargeType> chargeTypes = chargeTypeMapper.selectList(null);
            HashMap<Integer, ChargeType> map = new HashMap<>();
            for (int i = 0; i <= chargeTypes.size() - 1; i++) {
                map.put(chargeTypes.get(i).getId(), chargeTypes.get(i));
            }
            return map;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int insert(ChargeType chargeType) {
        return chargeTypeMapper.insert(chargeType);
    }
}
