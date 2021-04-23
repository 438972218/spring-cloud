package com.xdcplus.resource.basic.vo;

import java.io.Serializable;

/**
 * @author : Martin Ji
 */
public class CabinetMonitorByKeywordVO implements Serializable {

    private Integer Id;
    private String circuit;
    private String pdcNumber;
    private String itemName;
    private String itemId;
    private String oidName;
    private String oid;
    private Float alarmMaxValue;
    private Float alarmMinValue;
    private Float alarmMaxValueToCustomer;
    private Float alarmMinValueToCustomer;
    private String unit;
    private String panelCode;
    private String classify;

    public String getPdcNumber() {
        return pdcNumber;
    }

    public void setPdcNumber(String pdcNumber) {
        this.pdcNumber = pdcNumber;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getOidName() {
        return oidName;
    }

    public void setOidName(String oidName) {
        this.oidName = oidName;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Float getAlarmMaxValue() {
        return alarmMaxValue;
    }

    public void setAlarmMaxValue(Float alarmMaxValue) {
        this.alarmMaxValue = alarmMaxValue;
    }

    public Float getAlarmMinValue() {
        return alarmMinValue;
    }

    public void setAlarmMinValue(Float alarmMinValue) {
        this.alarmMinValue = alarmMinValue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getAlarmMaxValueToCustomer() {
        return alarmMaxValueToCustomer;
    }

    public void setAlarmMaxValueToCustomer(Float alarmMaxValueToCustomer) {
        this.alarmMaxValueToCustomer = alarmMaxValueToCustomer;
    }

    public Float getAlarmMinValueToCustomer() {
        return alarmMinValueToCustomer;
    }

    public void setAlarmMinValueToCustomer(Float alarmMinValueToCustomer) {
        this.alarmMinValueToCustomer = alarmMinValueToCustomer;
    }

    public String getPanelCode() {
        return panelCode;
    }

    public void setPanelCode(String panelCode) {
        this.panelCode = panelCode;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "CabinetMonitorByKeywordVO{" +
                "itemName='" + itemName + '\'' +
                ", oidName='" + oidName + '\'' +
                ", oid='" + oid + '\'' +
                '}';
    }
}
