package com.xdcplus.resource.basic.service.impl;

import com.xdcplus.model.dto.cabinetel.HistoryDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.entity.CabinetMonitor;
import com.xdcplus.resource.basic.mapper.CabinetMonitorMapper;
import com.xdcplus.resource.basic.service.CabinetMonitorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xdcplus.utils.other.ListUtil;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
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
@Service(version = "1.0.0")
public class CabinetMonitorServiceImpl extends ServiceImpl<CabinetMonitorMapper, CabinetMonitor> implements CabinetMonitorService {

    @Autowired
    CabinetMonitorMapper cabinetMonitorMapper;

    @Override
    public Map<Integer, List<HistoryDTO>> getCabinetIdHistoryDTO(QueryDTO queryDTO) {
        Map<Integer, List<HistoryDTO>> map=new HashMap<>();
        List<HistoryDTO> historyDTOS = cabinetMonitorMapper.selectHistoryDTO(queryDTO);

        Integer cabinetId;
        for (int i = 0; i <= historyDTOS.size() - 1; i++) {
            cabinetId=historyDTOS.get(i).getCabinetId();

            if(ListUtil.isEmpty(map.get(cabinetId))){
                List<HistoryDTO> historyDTOS1=new ArrayList<>();
                historyDTOS1.add(historyDTOS.get(i));
                map.put(historyDTOS.get(i).getCabinetId(), historyDTOS1);
            }else{
                List<HistoryDTO> historyDTOS1 = map.get(cabinetId);
                historyDTOS1.add(historyDTOS.get(i));
                map.put(historyDTOS.get(i).getCabinetId(), historyDTOS1);
            }
        }
        return map;
    }
}
