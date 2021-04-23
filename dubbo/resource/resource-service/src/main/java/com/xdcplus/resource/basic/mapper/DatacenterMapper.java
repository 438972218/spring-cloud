package com.xdcplus.resource.basic.mapper;
import org.apache.ibatis.annotations.Param;

import com.xdcplus.resource.basic.entity.Datacenter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fish
 * @since 2021-04-07
 */
public interface DatacenterMapper extends BaseMapper<Datacenter> {

    Datacenter findOneById(@Param("id")Integer id);

}
