package com.xdcplus.resource.service;

import com.xdcplus.resource.entity.Datacenter;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fish
 * @since 2021-04-13
 */
public interface DatacenterService extends IService<Datacenter> {

    String selectName(Integer id);

}
