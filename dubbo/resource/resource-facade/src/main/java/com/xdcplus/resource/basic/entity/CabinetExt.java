package com.xdcplus.resource.basic.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
@TableName("cabinet_ext")
public class CabinetExt implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer cabinetId;

    private Integer customerId;

    private Integer chargeTypeId;

    private LocalDate chargeDateFrom;

    private LocalDate chargeDateTo;

    private Float chargeValue;

    private Float price;

    private Float specificPrice;

    private Float overcurrentPrice;

    private Integer priceTermsId;

    private Integer paymentTermsId;

    private Float costNrc;

    private Float costPrice;

    private String remark;


}
