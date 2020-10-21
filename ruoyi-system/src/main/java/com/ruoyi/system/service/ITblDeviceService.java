package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TblDevice;
import com.ruoyi.system.domain.dto.Agency;
import com.ruoyi.system.domain.dto.Category;
import com.ruoyi.system.domain.dto.Sum;

/**
 * 设备管理Service接口
 * 
 * @author admin
 * @date 2020-10-18
 */
public interface ITblDeviceService 
{
    /**
     * 查询设备管理
     * 
     * @param id 设备管理ID
     * @return 设备管理
     */
    public TblDevice selectTblDeviceById(Long id);

    /**
     * 查询设备管理列表
     * 
     * @param tblDevice 设备管理
     * @return 设备管理集合
     */
    public List<TblDevice> selectTblDeviceList(TblDevice tblDevice);

    /**
     * 新增设备管理
     * 
     * @param tblDevice 设备管理
     * @return 结果
     */
    public int insertTblDevice(TblDevice tblDevice);

    /**
     * 修改设备管理
     * 
     * @param tblDevice 设备管理
     * @return 结果
     */
    public int updateTblDevice(TblDevice tblDevice);

    /**
     * 批量删除设备管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTblDeviceByIds(String ids);

    /**
     * 删除设备管理信息
     * 
     * @param id 设备管理ID
     * @return 结果
     */
    public int deleteTblDeviceById(Long id);


    /**
     * 查询设备总数
     *
     * @return 设备总数
     */
    public int countDeviceSum();


    /**
     * 查询状态为运行的设备总数
     *
     * @return
     */
    public int countDeviceSumByStatus();


    /**
     * 查询设备的分类总数
     *
     * @return
     */
    public int countCategorySum();

    /**
     * 查询设备借出数
     *
     * @return
     */
    public int countDeviceSumByIsBorrow();

    /**
     * 查询使用部门及其数量
     * @return
     */
    public List<Agency> getAgency();

    /**
     * 查询设备分类及其数量
     * @return
     */
    public List<Category> getCategory();

    /**
     * 查询 运行数 借出数  监控数
     * @return
     */
    public Sum getSum();
}
