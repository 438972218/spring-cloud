package com.xdcplus.customerorder.basic.service.impl;

import com.xdcplus.customerorder.basic.entity.PriceTerms;
import com.xdcplus.customerorder.basic.mapper.PriceTermsMapper;
import com.xdcplus.customerorder.basic.service.PriceTermsService;
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
public class PriceTermsServiceImpl extends ServiceImpl<PriceTermsMapper, PriceTerms> implements PriceTermsService {

}
