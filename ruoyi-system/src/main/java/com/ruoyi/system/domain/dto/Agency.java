package com.ruoyi.system.domain.dto;

/**
 * 雷达图数据实体
 */
public class Agency {

    private String agencyName;

    private int agencyCount;

    private int agencyMax;

    public int getAgencyMax() {
        return agencyMax;
    }

    public void setAgencyMax(double i) {
        this.agencyMax = (int) Math.ceil(this.agencyCount/i);
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public int getAgencyCount() {
        return agencyCount;
    }

    public void setAgencyCount(int agencyCount) {
        this.agencyCount = agencyCount;
    }
}
