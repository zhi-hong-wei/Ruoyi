package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备借出申请对象 tbl_borrow
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
public class TblBorrow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** 设备ID外键 */
    @Excel(name = "设备ID外键")
    private Long deviceid;

    /** 申请借用人 */
    @Excel(name = "申请借用人")
    private String borrowBy;

    /** 申请借出时间 */
    @Excel(name = "申请借出时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date borrowTime;

    /** 计划归还时间 */
    @Excel(name = "计划归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date backTime;

    /** 审批状态（默认0 待审核，1 同意，2不同意,3已归还） */
    @Excel(name = "审批状态", readConverterExp = "默=认0,待=审核，1,同=意，2不同意,3已归还")
    private String isborrow;

    /** 审核说明，不同意时填写 */
    private String reason;

    /** 归还办理人 */
    @Excel(name = "归还办理人")
    private String recoverBy;

    /** 归还时间 */
    @Excel(name = "归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recoverTime;

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
    public void setDeviceid(Long deviceid) 
    {
        this.deviceid = deviceid;
    }

    public Long getDeviceid() 
    {
        return deviceid;
    }
    public void setBorrowBy(String borrowBy) 
    {
        this.borrowBy = borrowBy;
    }

    public String getBorrowBy() 
    {
        return borrowBy;
    }
    public void setBorrowTime(Date borrowTime) 
    {
        this.borrowTime = borrowTime;
    }

    public Date getBorrowTime() 
    {
        return borrowTime;
    }
    public void setBackTime(Date backTime) 
    {
        this.backTime = backTime;
    }

    public Date getBackTime() 
    {
        return backTime;
    }
    public void setIsborrow(String isborrow) 
    {
        this.isborrow = isborrow;
    }

    public String getIsborrow() 
    {
        return isborrow;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setRecoverBy(String recoverBy) 
    {
        this.recoverBy = recoverBy;
    }

    public String getRecoverBy() 
    {
        return recoverBy;
    }
    public void setRecoverTime(Date recoverTime) 
    {
        this.recoverTime = recoverTime;
    }

    public Date getRecoverTime() 
    {
        return recoverTime;
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
            .append("deviceid", getDeviceid())
            .append("borrowBy", getBorrowBy())
            .append("borrowTime", getBorrowTime())
            .append("backTime", getBackTime())
            .append("isborrow", getIsborrow())
            .append("reason", getReason())
            .append("recoverBy", getRecoverBy())
            .append("recoverTime", getRecoverTime())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .toString();
    }
}
