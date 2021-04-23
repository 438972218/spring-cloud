package com.xdcplus.resource.basic.vo;


import java.util.List;

/**
 * @author : Martin Ji
 */
public class CabinetByShowVO extends CabinetByKeywordVO {

    private Integer deviceClassifyId;
    private Integer deviceTypeId;
    private Integer deviceBrandId;
    private List<CabinetMonitorByKeywordVO> cabinetMonitorVOs;

    public Integer getDeviceClassifyId() {
        return deviceClassifyId;
    }

    public void setDeviceClassifyId(Integer deviceClassifyId) {
        this.deviceClassifyId = deviceClassifyId;
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public Integer getDeviceBrandId() {
        return deviceBrandId;
    }

    public void setDeviceBrandId(Integer deviceBrandId) {
        this.deviceBrandId = deviceBrandId;
    }

    public List<CabinetMonitorByKeywordVO> getCabinetMonitorVOs() {
        return cabinetMonitorVOs;
    }

    public void setCabinetMonitorVOs(List<CabinetMonitorByKeywordVO> cabinetMonitorVOs) {
        this.cabinetMonitorVOs = cabinetMonitorVOs;
    }
}
