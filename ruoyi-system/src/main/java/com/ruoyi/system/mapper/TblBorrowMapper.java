package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TblBorrow;

/**
 * 设备借出申请Mapper接口
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
public interface TblBorrowMapper 
{
    /**
     * 查询设备借出申请
     * 
     * @param id 设备借出申请ID
     * @return 设备借出申请
     */
    public TblBorrow selectTblBorrowById(Long id);

    /**
     * 查询设备借出申请列表
     * 
     * @param tblBorrow 设备借出申请
     * @return 设备借出申请集合
     */
    public List<TblBorrow> selectTblBorrowList(TblBorrow tblBorrow);

    /**
     * 新增设备借出申请
     * 
     * @param tblBorrow 设备借出申请
     * @return 结果
     */
    public int insertTblBorrow(TblBorrow tblBorrow);

    /**
     * 修改设备借出申请
     * 
     * @param tblBorrow 设备借出申请
     * @return 结果
     */
    public int updateTblBorrow(TblBorrow tblBorrow);

    /**
     * 删除设备借出申请
     * 
     * @param id 设备借出申请ID
     * @return 结果
     */
    public int deleteTblBorrowById(Long id);

    /**
     * 批量删除设备借出申请
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTblBorrowByIds(String[] ids);
}
