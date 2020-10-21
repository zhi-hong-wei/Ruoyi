package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备管理对象 tbl_device
 * 
 * @author admin
 * @date 2020-10-18
 */
public class TblDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 设备id */
    @Excel(name = "设备id")
    private String selfId;

    /** RFID标签 */
    @Excel(name = "RFID标签")
    private Long rfidId;

    /** 设备ip地址 */
    @Excel(name = "设备ip地址")
    private String ip;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String name;

    /** 设备身份编码 */
    @Excel(name = "设备身份编码")
    private String deviceCode;

    /** ITSM设备编码 */
    @Excel(name = "ITSM设备编码")
    private String itsmCode;

    /** 设备状态 */
    @Excel(name = "设备状态")
    private String status;

    /** 设备类别 */
    @Excel(name = "设备类别")
    private String category;

    /** 设备品牌 */
    @Excel(name = "设备品牌")
    private String brand;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String model;

    /** 产品序列号 */
    @Excel(name = "产品序列号")
    private String serialNumber;

    /** 投运日期 */
    @Excel(name = "投运日期")
    private String startTime;

    /** 设备使用机构 */
    @Excel(name = "设备使用机构")
    private String agency;//要去的数据

    /** 设备使用部门 */
    @Excel(name = "设备使用部门")
    private String department;

    /** 设备运维班组 */
    @Excel(name = "设备运维班组")
    private String maintenance;

    /** 责任人 */
    @Excel(name = "责任人")
    private String responsible;

    /** 使用人 */
    @Excel(name = "使用人")
    private String user;

    /** 原厂维保到期时间 */
    @Excel(name = "原厂维保到期时间")
    private String expirationTime;

    /** 供应商 */
    @Excel(name = "供应商")
    private String supplier;

    /** 产权单位 */
    @Excel(name = "产权单位")
    private String propertyUnit;

    /** 设备位置 */
    @Excel(name = "设备位置")
    private String location;

    /** 是否借出 */
    @Excel(name = "是否借出")
    private Integer isborrow;

    /** 是否采集数据 */
    @Excel(name = "是否采集数据")
    private Integer iscollection;

    /** 删除标志 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSelfId(String selfId) 
    {
        this.selfId = selfId;
    }

    public String getSelfId() 
    {
        return selfId;
    }
    public void setRfidId(Long rfidId) 
    {
        this.rfidId = rfidId;
    }

    public Long getRfidId() 
    {
        return rfidId;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDeviceCode(String deviceCode) 
    {
        this.deviceCode = deviceCode;
    }

    public String getDeviceCode() 
    {
        return deviceCode;
    }
    public void setItsmCode(String itsmCode) 
    {
        this.itsmCode = itsmCode;
    }

    public String getItsmCode() 
    {
        return itsmCode;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setSerialNumber(String serialNumber) 
    {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() 
    {
        return serialNumber;
    }
    public void setStartTime(String startTime) 
    {
        this.startTime = startTime;
    }

    public String getStartTime() 
    {
        return startTime;
    }
    public void setAgency(String agency) 
    {
        this.agency = agency;
    }

    public String getAgency() 
    {
        return agency;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setMaintenance(String maintenance) 
    {
        this.maintenance = maintenance;
    }

    public String getMaintenance() 
    {
        return maintenance;
    }
    public void setResponsible(String responsible) 
    {
        this.responsible = responsible;
    }

    public String getResponsible() 
    {
        return responsible;
    }
    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getUser() 
    {
        return user;
    }
    public void setExpirationTime(String expirationTime) 
    {
        this.expirationTime = expirationTime;
    }

    public String getExpirationTime() 
    {
        return expirationTime;
    }
    public void setSupplier(String supplier) 
    {
        this.supplier = supplier;
    }

    public String getSupplier() 
    {
        return supplier;
    }
    public void setPropertyUnit(String propertyUnit) 
    {
        this.propertyUnit = propertyUnit;
    }

    public String getPropertyUnit() 
    {
        return propertyUnit;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setIsborrow(Integer isborrow) 
    {
        this.isborrow = isborrow;
    }

    public Integer getIsborrow() 
    {
        return isborrow;
    }
    public void setIscollection(Integer iscollection) 
    {
        this.iscollection = iscollection;
    }

    public Integer getIscollection() 
    {
        return iscollection;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("selfId", getSelfId())
            .append("rfidId", getRfidId())
            .append("ip", getIp())
            .append("name", getName())
            .append("deviceCode", getDeviceCode())
            .append("itsmCode", getItsmCode())
            .append("status", getStatus())
            .append("category", getCategory())
            .append("brand", getBrand())
            .append("model", getModel())
            .append("serialNumber", getSerialNumber())
            .append("startTime", getStartTime())
            .append("agency", getAgency())
            .append("department", getDepartment())
            .append("maintenance", getMaintenance())
            .append("responsible", getResponsible())
            .append("user", getUser())
            .append("expirationTime", getExpirationTime())
            .append("supplier", getSupplier())
            .append("propertyUnit", getPropertyUnit())
            .append("location", getLocation())
            .append("isborrow", getIsborrow())
            .append("iscollection", getIscollection())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
