package com.xdcplus.customerorder.basic.service.impl;

import com.xdcplus.customerorder.basic.entity.PaymentTerms;
import com.xdcplus.customerorder.basic.mapper.PaymentTermsMapper;
import com.xdcplus.customerorder.basic.service.PaymentTermsService;
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
public class PaymentTermsServiceImpl extends ServiceImpl<PaymentTermsMapper, PaymentTerms> implements PaymentTermsService {

}
