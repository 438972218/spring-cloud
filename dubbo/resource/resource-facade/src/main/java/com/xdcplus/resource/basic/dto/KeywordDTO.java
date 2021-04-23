package com.xdcplus.resource.basic.dto;

import com.xdcplus.model.common.dto.BaseDTO;

import java.util.List;

/**
  * @author : Martin Ji
  */
public class KeywordDTO extends BaseDTO {
    private String keyword;
    private String cabinetNumber;
    private Integer position;
    private String deviceSn;
    private String portNumber;
    private String circuit;
    private Integer deviceId;
    private Integer cabinetId;
    private Integer zoneId;
    private String zoneName;
    private String pdcId;
    private Integer datacenterId;
    private String datacenterName;
    private Integer componentModelId;
    private Integer componentBrandId;
    private Integer componentTypeId;
    private Integer componentClassifyId;
    private Integer customerId;
    private Integer finalCustomerId;
    private List<Integer> customerIds;
    private List<Integer> finalCustomerIds;
    private String customerCode;
    private Integer parentId;
    private Integer deviceModelId;
    private Integer deviceTypeId;
    private Integer deviceBrandId;
    private Integer deviceClassifyId;
    private Integer devicePortId;
    private List<Integer> deviceClassifyIds;
    private List<Integer> deviceTypeIds;
    private Integer monitorId;
    private Boolean online;
    private Boolean enabled;
    private String enable;
    private String serialNumber;
    private List<String> serialNumbers;
    private Boolean flowDevice;
    private Boolean customerPort;
    private String[] allowDatacenterIds;
    private Integer isStoreroom;
    private String number;
    private String type;
    private String classify;
    private Integer isItemId;
    private String attribute;
    private String assetBelong;
    private String assetOwner;
    private Integer isZone;
    private String ip;
    private String groupName;
    private String groupBy;
    private String groupByClause;
    private String algorithm;
    private Integer chargeTypeId;
    private Boolean ifExt;
    private Boolean ifBindCustomer;
    private Boolean ifBusiness;
    private Boolean ifHostname;
    private String operator;
    private Integer id;
    private String mark;
    private String hostname;
    private String statusName;
    private List<String> statusNames;
    private List<String> markList;
    private Integer opcserverId;
    private String itemCode;
    private String itemName;
    private String itemDescription;
    private Boolean manually;
    private Integer groupId;

    public Boolean getManually() {
        return manually;
    }

    public void setManually(Boolean manually) {
        this.manually = manually;
    }

    public Integer getFinalCustomerId() {
        return finalCustomerId;
    }

    public void setFinalCustomerId(Integer finalCustomerId) {
        this.finalCustomerId = finalCustomerId;
    }

    public List<Integer> getFinalCustomerIds() {
        return finalCustomerIds;
    }

    public void setFinalCustomerIds(List<Integer> finalCustomerIds) {
        this.finalCustomerIds = finalCustomerIds;
    }

    public List<String> getStatusNames() {
        return statusNames;
    }

    public void setStatusNames(List<String> statusNames) {
        this.statusNames = statusNames;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Boolean getIfBusiness() {
        return ifBusiness;
    }

    public void setIfBusiness(Boolean ifBusiness) {
        this.ifBusiness = ifBusiness;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(String cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(Integer cabinetId) {
        this.cabinetId = cabinetId;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getPdcId() {
        return pdcId;
    }

    public void setPdcId(String pdcId) {
        this.pdcId = pdcId;
    }

    public Integer getDatacenterId() {
        return datacenterId;
    }

    public void setDatacenterId(Integer datacenterId) {
        this.datacenterId = datacenterId;
    }

    public String getDatacenterName() {
        return datacenterName;
    }

    public void setDatacenterName(String datacenterName) {
        this.datacenterName = datacenterName;
    }

    public Integer getComponentModelId() {
        return componentModelId;
    }

    public void setComponentModelId(Integer componentModelId) {
        this.componentModelId = componentModelId;
    }

    public Integer getComponentBrandId() {
        return componentBrandId;
    }

    public void setComponentBrandId(Integer componentBrandId) {
        this.componentBrandId = componentBrandId;
    }

    public Integer getComponentTypeId() {
        return componentTypeId;
    }

    public void setComponentTypeId(Integer componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    public Integer getComponentClassifyId() {
        return componentClassifyId;
    }

    public void setComponentClassifyId(Integer componentClassifyId) {
        this.componentClassifyId = componentClassifyId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
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

    public Integer getDeviceClassifyId() {
        return deviceClassifyId;
    }

    public void setDeviceClassifyId(Integer deviceClassifyId) {
        this.deviceClassifyId = deviceClassifyId;
    }

    public Integer getDevicePortId() {
        return devicePortId;
    }

    public void setDevicePortId(Integer devicePortId) {
        this.devicePortId = devicePortId;
    }

    public List<Integer> getDeviceClassifyIds() {
        return deviceClassifyIds;
    }

    public void setDeviceClassifyIds(List<Integer> deviceClassifyIds) {
        this.deviceClassifyIds = deviceClassifyIds;
    }

    public Integer getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public Boolean getFlowDevice() {
        return flowDevice;
    }

    public void setFlowDevice(Boolean flowDevice) {
        this.flowDevice = flowDevice;
    }

    public Boolean getCustomerPort() {
        return customerPort;
    }

    public void setCustomerPort(Boolean customerPort) {
        this.customerPort = customerPort;
    }

    public String[] getAllowDatacenterIds() {
        return allowDatacenterIds;
    }

    public void setAllowDatacenterIds(String[] allowDatacenterIds) {
        this.allowDatacenterIds = allowDatacenterIds;
    }

    public Integer getIsStoreroom() {
        return isStoreroom;
    }

    public void setIsStoreroom(Integer isStoreroom) {
        this.isStoreroom = isStoreroom;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Integer getIsItemId() {
        return isItemId;
    }

    public void setIsItemId(Integer isItemId) {
        this.isItemId = isItemId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAssetBelong() {
        return assetBelong;
    }

    public void setAssetBelong(String assetBelong) {
        this.assetBelong = assetBelong;
    }

    public String getAssetOwner() {
        return assetOwner;
    }

    public void setAssetOwner(String assetOwner) {
        this.assetOwner = assetOwner;
    }

    public Integer getIsZone() {
        return isZone;
    }

    public void setIsZone(Integer isZone) {
        this.isZone = isZone;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public Integer getChargeTypeId() {
        return chargeTypeId;
    }

    public void setChargeTypeId(Integer chargeTypeId) {
        this.chargeTypeId = chargeTypeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIfExt() {
        return ifExt;
    }

    public void setIfExt(Boolean ifExt) {
        this.ifExt = ifExt;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Boolean getIfBindCustomer() {
        return ifBindCustomer;
    }

    public void setIfBindCustomer(Boolean ifBindCustomer) {
        this.ifBindCustomer = ifBindCustomer;
    }

    public List<Integer> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<Integer> customerIds) {
        this.customerIds = customerIds;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public List<String> getMarkList() {
        return markList;
    }

    public void setMarkList(List<String> markList) {
        this.markList = markList;
    }

    public List<Integer> getDeviceTypeIds() {
        return deviceTypeIds;
    }

    public void setDeviceTypeIds(List<Integer> deviceTypeIds) {
        this.deviceTypeIds = deviceTypeIds;
    }

    public Integer getOpcserverId() {
        return opcserverId;
    }

    public void setOpcserverId(Integer opcserverId) {
        this.opcserverId = opcserverId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Boolean getIfHostname() {
        return ifHostname;
    }

    public void setIfHostname(Boolean ifHostname) {
        this.ifHostname = ifHostname;
    }
}
