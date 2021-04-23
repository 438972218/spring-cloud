package com.xdcplus.resource.basic.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@TableName("cabinet")
public class Cabinet implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer customerId;

    private Integer finalCustomerId;

    private Integer zoneId;

    private String number;

    private String mark;

    private Integer chargeTypeId;

    private LocalDate estimateChargeDateFrom;

    private LocalDate chargeDateFrom;

    private LocalDate chargeDateTo;

    private LocalDateTime powerOnTime;

    private LocalDateTime powerDownTime;

    private Float chargeValue;

    private Float price;

    private Float specificPrice;

    private Float overcurrentPrice;

    private Integer priceTermsId;

    private Integer paymentTermsId;

    private Float costNrc;

    private Float costPrice;

    private Integer deviceModelId;

    private String serialNumber;

    private String assetTag;

    private String facilityNumber;

    private Float nominalWatts;

    private LocalDate deliveryDate;

    private String pduTypeName;

    private String pduBrand;

    private String pduPowerTypeName;

    private Integer pduPowerNumber;

    private Integer width;

    private Integer height;

    private Integer depth;

    private Integer planDeviceNumber;

    private Float xAxis;

    private Float yAxis;

    /**
     * AB路相加告警最大值
     */
    private Float alarmMaxValue;

    /**
     * AB路相加告警最小值
     */
    private Float alarmMinValue;

    /**
     * AB路相加告警最大值，用于告警给客户群
     */
    private Float alarmMaxValueToCustomer;

    /**
     * AB路相加告警最小值，用于告警给客户群
     */
    private Float alarmMinValueToCustomer;

    private String unit;

    private Integer parentId;

    private Integer createById;

    private Integer updateById;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;


}
