package com.xdcplus.resource.basic.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author fish
 * @since 2021-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cabinet_monitor")
public class CabinetMonitor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer cabinetId;

    private Long itemId;

    private String itemCode;

    private String itemName;

    private String circuit;

    private String pdcNumber;

    private String oidName;

    private String oid;

    private String oidType;

    private String oidDescription;

    private Float alarmMaxValue;

    private Float alarmMinValue;

    private Float alarmMaxValueToCustomer;

    private Float alarmMinValueToCustomer;

    private String unit;

    private String panelCode;

    private String classify;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;


}
