package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * RFID标签管理对象 tbl_rfidtag
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
public class TblRfidtag extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** RFID标签编号 */
    @Excel(name = "RFID标签编号")
    private String rfid;

    /** RFID绑定的设备ID */
    @Excel(name = "RFID绑定的设备ID")
    private Long deviceid;

    /** 标签状态 */
    @Excel(name = "标签状态")
    private String rfState;

    /** 销毁登记人 */
    @Excel(name = "销毁登记人")
    private String destroyBy;

    /** 销毁时间 */
    @Excel(name = "销毁时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date destroyTime;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRfid(String rfid) 
    {
        this.rfid = rfid;
    }

    public String getRfid() 
    {
        return rfid;
    }
    public void setDeviceid(Long deviceid) 
    {
        this.deviceid = deviceid;
    }

    public Long getDeviceid() 
    {
        return deviceid;
    }
    public void setRfState(String rfState) 
    {
        this.rfState = rfState;
    }

    public String getRfState() 
    {
        return rfState;
    }
    public void setDestroyBy(String destroyBy) 
    {
        this.destroyBy = destroyBy;
    }

    public String getDestroyBy() 
    {
        return destroyBy;
    }
    public void setDestroyTime(Date destroyTime) 
    {
        this.destroyTime = destroyTime;
    }

    public Date getDestroyTime() 
    {
        return destroyTime;
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
            .append("rfid", getRfid())
            .append("deviceid", getDeviceid())
            .append("rfState", getRfState())
            .append("destroyBy", getDestroyBy())
            .append("destroyTime", getDestroyTime())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
