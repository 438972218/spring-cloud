package com.xdcplus.resource.basic.mapper;

import com.xdcplus.model.dto.cabinetel.CabinetelDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.dto.KeywordDTO;
import com.xdcplus.resource.basic.entity.Cabinet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xdcplus.resource.basic.vo.CabinetByKeywordVO;
import com.xdcplus.resource.basic.vo.CabinetByShowVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
public interface CabinetMapper extends BaseMapper<Cabinet> {

    List<CabinetByKeywordVO> selectByKeyword(KeywordDTO keywordDTO);

    List<CabinetelDTO> selectCabinetelDTOs(QueryDTO queryDTO);

    CabinetByShowVO showCabinet(Integer id);

}
