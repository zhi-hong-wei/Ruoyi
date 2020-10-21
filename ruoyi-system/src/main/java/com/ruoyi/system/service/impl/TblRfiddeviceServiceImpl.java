package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TblRfiddeviceMapper;
import com.ruoyi.system.domain.TblRfiddevice;
import com.ruoyi.system.service.ITblRfiddeviceService;
import com.ruoyi.common.core.text.Convert;

/**
 * RFID设备管理Service业务层处理
 * 
 * @author admin
 * @date 2020-10-19
 */
@Service
public class TblRfiddeviceServiceImpl implements ITblRfiddeviceService 
{
    @Autowired
    private TblRfiddeviceMapper tblRfiddeviceMapper;

    /**
     * 查询RFID设备管理
     * 
     * @param id RFID设备管理ID
     * @return RFID设备管理
     */
    @Override
    public TblRfiddevice selectTblRfiddeviceById(Long id)
    {
        return tblRfiddeviceMapper.selectTblRfiddeviceById(id);
    }

    /**
     * 查询RFID设备管理列表
     * 
     * @param tblRfiddevice RFID设备管理
     * @return RFID设备管理
     */
    @Override
    public List<TblRfiddevice> selectTblRfiddeviceList(TblRfiddevice tblRfiddevice)
    {
        return tblRfiddeviceMapper.selectTblRfiddeviceList(tblRfiddevice);
    }

    /**
     * 新增RFID设备管理
     * 
     * @param tblRfiddevice RFID设备管理
     * @return 结果
     */
    @Override
    public int insertTblRfiddevice(TblRfiddevice tblRfiddevice)
    {
        tblRfiddevice.setCreateTime(DateUtils.getNowDate());
        return tblRfiddeviceMapper.insertTblRfiddevice(tblRfiddevice);
    }

    /**
     * 修改RFID设备管理
     * 
     * @param tblRfiddevice RFID设备管理
     * @return 结果
     */
    @Override
    public int updateTblRfiddevice(TblRfiddevice tblRfiddevice)
    {
        tblRfiddevice.setUpdateTime(DateUtils.getNowDate());
        return tblRfiddeviceMapper.updateTblRfiddevice(tblRfiddevice);
    }

    /**
     * 删除RFID设备管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTblRfiddeviceByIds(String ids)
    {
        return tblRfiddeviceMapper.deleteTblRfiddeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除RFID设备管理信息
     * 
     * @param id RFID设备管理ID
     * @return 结果
     */
    @Override
    public int deleteTblRfiddeviceById(Long id)
    {
        return tblRfiddeviceMapper.deleteTblRfiddeviceById(id);
    }
}
