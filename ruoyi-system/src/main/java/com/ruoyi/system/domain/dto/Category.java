package com.ruoyi.system.domain.dto;

/**
 * 饼状图数据模型
 */
public class Category {

    private String categoryName;

    private int categoryNum;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(int categoryNum) {
        this.categoryNum = categoryNum;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryNum=" + categoryNum +
                '}';
    }
}
