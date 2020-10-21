package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TblRfidtagMapper;
import com.ruoyi.system.domain.TblRfidtag;
import com.ruoyi.system.service.ITblRfidtagService;
import com.ruoyi.common.core.text.Convert;

/**
 * RFID标签管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
@Service
public class TblRfidtagServiceImpl implements ITblRfidtagService 
{
    @Autowired
    private TblRfidtagMapper tblRfidtagMapper;

    /**
     * 查询RFID标签管理
     * 
     * @param id RFID标签管理ID
     * @return RFID标签管理
     */
    @Override
    public TblRfidtag selectTblRfidtagById(Long id)
    {
        return tblRfidtagMapper.selectTblRfidtagById(id);
    }

    /**
     * 查询RFID标签管理列表
     * 
     * @param tblRfidtag RFID标签管理
     * @return RFID标签管理
     */
    @Override
    public List<TblRfidtag> selectTblRfidtagList(TblRfidtag tblRfidtag)
    {
        return tblRfidtagMapper.selectTblRfidtagList(tblRfidtag);
    }

    /**
     * 新增RFID标签管理
     * 
     * @param tblRfidtag RFID标签管理
     * @return 结果
     */
    @Override
    public int insertTblRfidtag(TblRfidtag tblRfidtag)
    {
        tblRfidtag.setCreateTime(DateUtils.getNowDate());
        return tblRfidtagMapper.insertTblRfidtag(tblRfidtag);
    }

    /**
     * 修改RFID标签管理
     * 
     * @param tblRfidtag RFID标签管理
     * @return 结果
     */
    @Override
    public int updateTblRfidtag(TblRfidtag tblRfidtag)
    {
        tblRfidtag.setUpdateTime(DateUtils.getNowDate());
        return tblRfidtagMapper.updateTblRfidtag(tblRfidtag);
    }

    /**
     * 删除RFID标签管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTblRfidtagByIds(String ids)
    {
        return tblRfidtagMapper.deleteTblRfidtagByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除RFID标签管理信息
     * 
     * @param id RFID标签管理ID
     * @return 结果
     */
    @Override
    public int deleteTblRfidtagById(Long id)
    {
        return tblRfidtagMapper.deleteTblRfidtagById(id);
    }
}
