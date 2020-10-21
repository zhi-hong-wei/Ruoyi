package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TblRfidtag;

/**
 * RFID标签管理Service接口
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
public interface ITblRfidtagService 
{
    /**
     * 查询RFID标签管理
     * 
     * @param id RFID标签管理ID
     * @return RFID标签管理
     */
    public TblRfidtag selectTblRfidtagById(Long id);

    /**
     * 查询RFID标签管理列表
     * 
     * @param tblRfidtag RFID标签管理
     * @return RFID标签管理集合
     */
    public List<TblRfidtag> selectTblRfidtagList(TblRfidtag tblRfidtag);

    /**
     * 新增RFID标签管理
     * 
     * @param tblRfidtag RFID标签管理
     * @return 结果
     */
    public int insertTblRfidtag(TblRfidtag tblRfidtag);

    /**
     * 修改RFID标签管理
     * 
     * @param tblRfidtag RFID标签管理
     * @return 结果
     */
    public int updateTblRfidtag(TblRfidtag tblRfidtag);

    /**
     * 批量删除RFID标签管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTblRfidtagByIds(String ids);

    /**
     * 删除RFID标签管理信息
     * 
     * @param id RFID标签管理ID
     * @return 结果
     */
    public int deleteTblRfidtagById(Long id);
}
