package com.xdcplus.resource.basic.service;

import com.xdcplus.model.dto.cabinetel.HistoryDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.entity.CabinetMonitor;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
public interface CabinetMonitorService extends IService<CabinetMonitor> {

    Map<Integer, List<HistoryDTO>> getCabinetIdHistoryDTO(QueryDTO queryDTO);

}
