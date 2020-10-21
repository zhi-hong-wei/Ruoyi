package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * RFID设备管理对象 tbl_rfiddevice
 * 
 * @author admin
 * @date 2020-10-19
 */
public class TblRfiddevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** 设备的编号 */
    @Excel(name = "设备的编号")
    private String dcode;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private String dtype;

    /** 设备所在房间 */
    @Excel(name = "设备所在房间")
    private String droom;

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
    public void setDcode(String dcode) 
    {
        this.dcode = dcode;
    }

    public String getDcode() 
    {
        return dcode;
    }
    public void setDtype(String dtype) 
    {
        this.dtype = dtype;
    }

    public String getDtype() 
    {
        return dtype;
    }
    public void setDroom(String droom) 
    {
        this.droom = droom;
    }

    public String getDroom() 
    {
        return droom;
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
            .append("dcode", getDcode())
            .append("dtype", getDtype())
            .append("droom", getDroom())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
