package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TblRfiddevice;

/**
 * RFID设备管理Service接口
 * 
 * @author admin
 * @date 2020-10-19
 */
public interface ITblRfiddeviceService 
{
    /**
     * 查询RFID设备管理
     * 
     * @param id RFID设备管理ID
     * @return RFID设备管理
     */
    public TblRfiddevice selectTblRfiddeviceById(Long id);

    /**
     * 查询RFID设备管理列表
     * 
     * @param tblRfiddevice RFID设备管理
     * @return RFID设备管理集合
     */
    public List<TblRfiddevice> selectTblRfiddeviceList(TblRfiddevice tblRfiddevice);

    /**
     * 新增RFID设备管理
     * 
     * @param tblRfiddevice RFID设备管理
     * @return 结果
     */
    public int insertTblRfiddevice(TblRfiddevice tblRfiddevice);

    /**
     * 修改RFID设备管理
     * 
     * @param tblRfiddevice RFID设备管理
     * @return 结果
     */
    public int updateTblRfiddevice(TblRfiddevice tblRfiddevice);

    /**
     * 批量删除RFID设备管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTblRfiddeviceByIds(String ids);

    /**
     * 删除RFID设备管理信息
     * 
     * @param id RFID设备管理ID
     * @return 结果
     */
    public int deleteTblRfiddeviceById(Long id);
}
