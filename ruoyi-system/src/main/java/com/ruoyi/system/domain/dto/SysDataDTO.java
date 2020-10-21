package com.ruoyi.system.domain.dto;

import java.util.Date;

/**
 * 折线图数据
 */
public class SysDataDTO {

    private float cpuUserUse;

    private float cpuSysUse;

    private float memUsage;

    private float localUsage;

    private Date collactiontime;

    public Date getCollactiontime() {
        return collactiontime;
    }

    public void setCollactiontime(Date collactiontime) {
        this.collactiontime = collactiontime;
    }

    public float getCpuUserUse() {
        return cpuUserUse;
    }

    public void setCpuUserUse(float cpuUserUse) {
        this.cpuUserUse = cpuUserUse;
    }

    public float getCpuSysUse() {
        return cpuSysUse;
    }

    public void setCpuSysUse(float cpuSysUse) {
        this.cpuSysUse = cpuSysUse;
    }

    public float getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(float memUsage) {
        this.memUsage = memUsage;
    }

    public float getLocalUsage() {
        return localUsage;
    }

    public void setLocalUsage(float localUsage) {
        this.localUsage = localUsage;
    }
}
