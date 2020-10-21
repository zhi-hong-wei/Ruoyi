package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 tbl_sysdata
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class TblSysdata extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 采集数据的设备ID */
    @Excel(name = "采集数据的设备ID")
    private Long unitid;

    /** cpu核心数 */
    @Excel(name = "cpu核心数")
    private BigDecimal cpunum;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal cpuused;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal cpusys;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal cpufree;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal memtotal;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal memused;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal memfree;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal memusage;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private String sysdirname;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private String systypename;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private String systotal;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private String sysfree;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private String sysused;

    /** $column.columnComment */
    @Excel(name = "cpu核心数")
    private BigDecimal sysusage;

    /** $column.columnComment */
    @Excel(name = "cpu核心数", width = 30, dateFormat = "yyyy-MM-dd")
    private Date collactiontime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUnitid() {
        return unitid;
    }

    public void setUnitid(Long unitid) {
        this.unitid = unitid;
    }

    public BigDecimal getCpunum() {
        return cpunum;
    }

    public void setCpunum(BigDecimal cpunum) {
        this.cpunum = cpunum;
    }

    public BigDecimal getCpuused() {
        return cpuused;
    }

    public void setCpuused(BigDecimal cpuused) {
        this.cpuused = cpuused;
    }

    public BigDecimal getCpusys() {
        return cpusys;
    }

    public void setCpusys(BigDecimal cpusys) {
        this.cpusys = cpusys;
    }

    public BigDecimal getCpufree() {
        return cpufree;
    }

    public void setCpufree(BigDecimal cpufree) {
        this.cpufree = cpufree;
    }

    public BigDecimal getMemtotal() {
        return memtotal;
    }

    public void setMemtotal(BigDecimal memtotal) {
        this.memtotal = memtotal;
    }

    public BigDecimal getMemused() {
        return memused;
    }

    public void setMemused(BigDecimal memused) {
        this.memused = memused;
    }

    public BigDecimal getMemfree() {
        return memfree;
    }

    public void setMemfree(BigDecimal memfree) {
        this.memfree = memfree;
    }

    public BigDecimal getMemusage() {
        return memusage;
    }

    public void setMemusage(BigDecimal memusage) {
        this.memusage = memusage;
    }

    public String getSysdirname() {
        return sysdirname;
    }

    public void setSysdirname(String sysdirname) {
        this.sysdirname = sysdirname;
    }

    public String getSystypename() {
        return systypename;
    }

    public void setSystypename(String systypename) {
        this.systypename = systypename;
    }

    public String getSystotal() {
        return systotal;
    }

    public void setSystotal(String systotal) {
        this.systotal = systotal;
    }

    public String getSysfree() {
        return sysfree;
    }

    public void setSysfree(String sysfree) {
        this.sysfree = sysfree;
    }

    public String getSysused() {
        return sysused;
    }

    public void setSysused(String sysused) {
        this.sysused = sysused;
    }

    public BigDecimal getSysusage() {
        return sysusage;
    }

    public void setSysusage(BigDecimal sysusage) {
        this.sysusage = sysusage;
    }

    public Date getCollactiontime() {
        return collactiontime;
    }

    public void setCollactiontime(Date collactiontime) {
        this.collactiontime = collactiontime;
    }

    @Override
    public String toString() {
        return "TblSysdata{" +
                "id=" + id +
                ", unitid=" + unitid +
                ", cpunum=" + cpunum +
                ", cpuused=" + cpuused +
                ", cpusys=" + cpusys +
                ", cpufree=" + cpufree +
                ", memtotal=" + memtotal +
                ", memused=" + memused +
                ", memfree=" + memfree +
                ", memusage=" + memusage +
                ", sysdirname='" + sysdirname + '\'' +
                ", systypename='" + systypename + '\'' +
                ", systotal='" + systotal + '\'' +
                ", sysfree='" + sysfree + '\'' +
                ", sysused='" + sysused + '\'' +
                ", sysusage=" + sysusage +
                ", collactiontime=" + collactiontime +
                '}';
    }
}
