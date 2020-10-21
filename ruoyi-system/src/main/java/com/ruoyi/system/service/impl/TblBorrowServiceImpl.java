package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TblBorrowMapper;
import com.ruoyi.system.domain.TblBorrow;
import com.ruoyi.system.service.ITblBorrowService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备借出申请Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
@Service
public class TblBorrowServiceImpl implements ITblBorrowService 
{
    @Autowired
    private TblBorrowMapper tblBorrowMapper;

    /**
     * 查询设备借出申请
     * 
     * @param id 设备借出申请ID
     * @return 设备借出申请
     */
    @Override
    public TblBorrow selectTblBorrowById(Long id)
    {
        return tblBorrowMapper.selectTblBorrowById(id);
    }

    /**
     * 查询设备借出申请列表
     * 
     * @param tblBorrow 设备借出申请
     * @return 设备借出申请
     */
    @Override
    public List<TblBorrow> selectTblBorrowList(TblBorrow tblBorrow)
    {
        return tblBorrowMapper.selectTblBorrowList(tblBorrow);
    }

    /**
     * 新增设备借出申请
     * 
     * @param tblBorrow 设备借出申请
     * @return 结果
     */
    @Override
    public int insertTblBorrow(TblBorrow tblBorrow)
    {
        tblBorrow.setCreateTime(DateUtils.getNowDate());
        return tblBorrowMapper.insertTblBorrow(tblBorrow);
    }

    /**
     * 修改设备借出申请
     * 
     * @param tblBorrow 设备借出申请
     * @return 结果
     */
    @Override
    public int updateTblBorrow(TblBorrow tblBorrow)
    {
        tblBorrow.setUpdateTime(DateUtils.getNowDate());
        return tblBorrowMapper.updateTblBorrow(tblBorrow);
    }

    /**
     * 删除设备借出申请对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTblBorrowByIds(String ids)
    {
        return tblBorrowMapper.deleteTblBorrowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备借出申请信息
     * 
     * @param id 设备借出申请ID
     * @return 结果
     */
    @Override
    public int deleteTblBorrowById(Long id)
    {
        return tblBorrowMapper.deleteTblBorrowById(id);
    }
}
