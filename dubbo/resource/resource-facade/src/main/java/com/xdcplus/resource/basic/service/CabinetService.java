package com.xdcplus.resource.basic.service;

import com.xdcplus.model.dto.cabinetel.CabinetelDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.dto.KeywordDTO;
import com.xdcplus.resource.basic.entity.Cabinet;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xdcplus.resource.basic.vo.CabinetByKeywordVO;
import com.xdcplus.resource.basic.vo.CabinetByShowVO;
import com.xdcplus.utils.exception.CustomException;

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
public interface CabinetService extends IService<Cabinet> {

    Map<Integer, CabinetByKeywordVO> selectMapCabinets(KeywordDTO keywordDTO);

    List<CabinetelDTO> selectCabinetelDTOsByQueryDTO(QueryDTO queryDTO);

    List<CabinetelDTO> selectCabinetelDTOsOnlySByQueryDTOAndDatacenterId(QueryDTO queryDTO) throws CustomException;

    List<CabinetelDTO> selectCabinetelDTOsOnlySByQueryDTO(QueryDTO queryDTO) throws CustomException;

    CabinetByShowVO showCabinet(Integer id);

    void insert(Cabinet cabinet);

}
