package com.xdcplus.resource.basic.vo;


import com.xdcplus.resource.basic.entity.Cabinet;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
  * @author : Martin Ji
  */
@Data
@EqualsAndHashCode(callSuper = false)
public class CabinetByKeywordVO extends Cabinet implements Serializable {

    private Integer datacenterId;
    private String datacenterName;
    private String datacenterFullName;
    private String zoneName;
    private String deviceClassifyName;
    private String deviceTypeName;
    private String deviceBrandName;
    private String deviceModelName;
    private String deviceModelSpecification;
    private String customerCode;
    private String customerName;
    private String chargeTypeName;
    private String finalCustomerCode;
    private String finalCustomerName;

}
