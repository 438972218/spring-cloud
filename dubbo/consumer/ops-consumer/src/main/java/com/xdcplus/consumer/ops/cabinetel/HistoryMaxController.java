package com.xdcplus.consumer.ops.cabinetel;

import com.xdcplus.cabinetel.max.service.HistoryMaxService;
import com.xdcplus.cabinetel.max.vo.HistoryMaxVO;
import com.xdcplus.model.dto.cabinetel.QueryDTO;
import com.xdcplus.utils.result.Result;
import com.xdcplus.utils.result.ResultUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@Api(description = "HisrotyMax查询接口")
@RestController
@RequestMapping(value = "/cabinetel/historymax")
public class HistoryMaxController {

    @Autowired
    HistoryMaxService historyMaxService;

    @ApiOperation(value = "查询cabinetel History Max" , httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "queryDTO", value = "queryDTO", dataType = "QueryDTO")
    })
    @ApiResponses({@ApiResponse(code = 200, message = "", response = Book.class)})
    @PostMapping("/list")
    public Result list(@RequestBody QueryDTO queryDTO) {
        try {
            List<HistoryMaxVO> historySumList = historyMaxService.selectTopValue(queryDTO);

            return ResultUtil.success(historySumList);
        } catch (DataAccessException e) {
            return ResultUtil.notFound().buildMessage("not found");
        }
    }
}
