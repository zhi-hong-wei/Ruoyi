package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TblDevice;
import org.apache.ibatis.annotations.Param;

/**
 * 设备管理Mapper接口
 * 
 * @author admin
 * @date 2020-10-18
 */
public interface TblDeviceMapper {
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
     * 删除设备管理
     *
     * @param id 设备管理ID
     * @return 结果
     */
    public int deleteTblDeviceById(Long id);

    /**
     * 批量删除设备管理
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTblDeviceByIds(String[] ids);


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
     * 查询设备的分类集合  集合传到service层做去重计数处理
     *
     * @return
     */
    public List<String> countCategorySum();

    /**
     * 查询设备借出数
     *
     * @return
     */
    public int countDeviceSumByIsBorrow();

    /**
     * 按照部门查找部门使用的机器数量
     * @param agency 部门名称
     * @return
     */
    public int countSumByAgency( @Param("agency") String agency);


    /**
     * 查询现有的部门,交给service层去重计数
     * @return
     */
    public List<String> countAgencySum();

    /**
     * 查询设备分类数
     * @param category 分类
     * @return
     */
    public int countSumByCategory(@Param("category") String category);





}



