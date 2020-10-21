package com.ruoyi.framework.web.service;

import java.util.List;
import com.ruoyi.system.domain.TblSysdata;
import com.ruoyi.system.domain.dto.SysDataDTO;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public interface ITblSysdataService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TblSysdata selectTblSysdataById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tblSysdata 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TblSysdata> selectTblSysdataList(TblSysdata tblSysdata);

    /**
     * 新增【请填写功能名称】
     * 
     * @param  【请填写功能名称】
     * @return 结果
     */
    public int insertTblSysdata() throws Exception;

    /**
     * 修改【请填写功能名称】
     * 
     * @param tblSysdata 【请填写功能名称】
     * @return 结果
     */
    public int updateTblSysdata(TblSysdata tblSysdata);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTblSysdataByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTblSysdataById(Long id);

    /**
     * 查询折线图数据
     * @return
     */
    public List<SysDataDTO> selectDataForPic();
}
