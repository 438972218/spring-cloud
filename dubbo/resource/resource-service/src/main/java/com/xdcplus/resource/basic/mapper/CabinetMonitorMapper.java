package com.xdcplus.resource.basic.mapper;

import com.xdcplus.model.dto.cabinetel.HistoryDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.entity.CabinetMonitor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
public interface CabinetMonitorMapper extends BaseMapper<CabinetMonitor> {

    List<HistoryDTO> selectHistoryDTO(QueryDTO queryDTO);

}
