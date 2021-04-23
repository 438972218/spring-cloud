package com.xdcplus.resource.basic.controller;


import com.xdcplus.model.dto.cabinetel.CabinetelDTO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.resource.basic.entity.Cabinet;
import com.xdcplus.resource.basic.service.CabinetService;
import com.xdcplus.utils.exception.CustomException;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
@RestController
@RequestMapping("//cabinet")
public class CabinetController {

    @Reference(version = "1.0.0")
    CabinetService cabinetService;

    @PostMapping("/")
    public List<CabinetelDTO> get(@RequestBody QueryDTO queryDTO) throws CustomException {
        return cabinetService.selectCabinetelDTOsOnlySByQueryDTO(queryDTO);
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Cabinet cabinet) {
        cabinetService.insert(cabinet);
    }

}
