package com.ruoyi.framework.web.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.ruoyi.framework.web.domain.Server;
import com.ruoyi.framework.web.service.ITblSysdataService;
import com.ruoyi.system.domain.dto.SysDataDTO;
import com.ruoyi.system.mapper.TblSysdataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.ruoyi.system.domain.TblSysdata;

import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
@Service
public class TblSysdataServiceImpl implements ITblSysdataService
{
    @Autowired
    private TblSysdataMapper tblSysdataMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TblSysdata selectTblSysdataById(Long id)
    {
        return tblSysdataMapper.selectTblSysdataById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tblSysdata 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TblSysdata> selectTblSysdataList(TblSysdata tblSysdata)
    {
        return tblSysdataMapper.selectTblSysdataList(tblSysdata);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param  【请填写功能名称】
     * @return 结果
     */
    @Override
//    @Scheduled(cron = "*/6 * * * * ?")
    public int insertTblSysdata() throws Exception {
        TblSysdata tblSysdata = getTblSysdata();



        return tblSysdataMapper.insertTblSysdata(tblSysdata);
    }

    /**
     * 获取设备参数信息
     * @return
     */
    private TblSysdata getTblSysdata() throws Exception {

        Server server = new Server();
        server.copyTo();

        TblSysdata tblSysdata = new TblSysdata();
        //TODO 设置其他的设备
        tblSysdata.setUnitid(20201020L);
        tblSysdata.setCpunum(BigDecimal.valueOf(server.getCpu().getCpuNum()));//cpu核心数
        tblSysdata.setCpuused(BigDecimal.valueOf(server.getCpu().getUsed()));//cpu用户使用率
        tblSysdata.setCpusys(BigDecimal.valueOf(server.getCpu().getSys()));//cpu系统使用率
        tblSysdata.setCpufree(BigDecimal.valueOf(server.getCpu().getFree()));//cpu当前空闲率
        tblSysdata.setMemtotal(BigDecimal.valueOf(server.getMem().getTotal()));//内存总量
        tblSysdata.setMemused(BigDecimal.valueOf(server.getMem().getUsed()));//已使用大小
        tblSysdata.setMemfree(BigDecimal.valueOf(server.getMem().getFree()));//未使用大小
        tblSysdata.setMemusage(BigDecimal.valueOf(server.getMem().getUsage()));//使用率
        tblSysdata.setSysdirname(server.getSysFiles().get(0).getDirName());//磁盘大小
        tblSysdata.setSystypename(server.getSysFiles().get(0).getTypeName());//磁盘类型
        tblSysdata.setSystotal(server.getSysFiles().get(0).getTotal());//磁盘大小
        tblSysdata.setSysfree(server.getSysFiles().get(0).getFree());//磁盘空闲
        tblSysdata.setSysused(server.getSysFiles().get(0).getUsed());//磁盘使用量
        tblSysdata.setSysusage(BigDecimal.valueOf(server.getSysFiles().get(0).getUsage()));//磁盘使用率
        tblSysdata.setCollactiontime(new Date());


        return tblSysdata;

    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tblSysdata 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTblSysdata(TblSysdata tblSysdata)
    {
        return tblSysdataMapper.updateTblSysdata(tblSysdata);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTblSysdataByIds(String ids)
    {
        return tblSysdataMapper.deleteTblSysdataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTblSysdataById(Long id)
    {
        return tblSysdataMapper.deleteTblSysdataById(id);
    }

    /**
     * 查询折线图数据
     *
     * @return
     */
    @Override
    public List<SysDataDTO> selectDataForPic() {

        List<SysDataDTO> sysDataDTOS = tblSysdataMapper.selectDataForPic();
        return sysDataDTOS;
    }
}
