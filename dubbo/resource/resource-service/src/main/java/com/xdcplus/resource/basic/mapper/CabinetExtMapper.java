package com.xdcplus.resource.basic.mapper;

import com.xdcplus.model.dto.cabinetel.CabinetelDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.entity.CabinetExt;
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
public interface CabinetExtMapper extends BaseMapper<CabinetExt> {

    List<CabinetelDTO> selectCabinetelDTOsByQueryDTO(QueryDTO queryDTO);

}
