package com.ruoyi.system.service.impl;

import java.util.*;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.dto.Agency;
import com.ruoyi.system.domain.dto.Category;
import com.ruoyi.system.domain.dto.Sum;
import com.ruoyi.system.utils.ExcludeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TblDeviceMapper;
import com.ruoyi.system.domain.TblDevice;
import com.ruoyi.system.service.ITblDeviceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备管理Service业务层处理
 * 
 * @author admin
 * @date 2020-10-18
 */
@Service
public class TblDeviceServiceImpl implements ITblDeviceService 
{
    @Autowired
    private TblDeviceMapper tblDeviceMapper;

    /**
     * 查询设备管理
     * 
     * @param id 设备管理ID
     * @return 设备管理
     */
    @Override
    public TblDevice selectTblDeviceById(Long id)
    {
        return tblDeviceMapper.selectTblDeviceById(id);
    }

    /**
     * 查询设备管理列表
     * 
     * @param tblDevice 设备管理
     * @return 设备管理
     */
    @Override
    public List<TblDevice> selectTblDeviceList(TblDevice tblDevice)
    {
        return tblDeviceMapper.selectTblDeviceList(tblDevice);
    }

    /**
     * 新增设备管理
     * 
     * @param tblDevice 设备管理
     * @return 结果
     */
    @Override
    public int insertTblDevice(TblDevice tblDevice)
    {
        tblDevice.setCreateTime(DateUtils.getNowDate());
        return tblDeviceMapper.insertTblDevice(tblDevice);
    }

    /**
     * 修改设备管理
     * 
     * @param tblDevice 设备管理
     * @return 结果
     */
    @Override
    public int updateTblDevice(TblDevice tblDevice)
    {
        tblDevice.setUpdateTime(DateUtils.getNowDate());
        return tblDeviceMapper.updateTblDevice(tblDevice);
    }

    /**
     * 删除设备管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTblDeviceByIds(String ids)
    {
        return tblDeviceMapper.deleteTblDeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备管理信息
     * 
     * @param id 设备管理ID
     * @return 结果
     */
    @Override
    public int deleteTblDeviceById(Long id)
    {
        return tblDeviceMapper.deleteTblDeviceById(id);
    }

    /**
     * 查询设备总数
     *
     * @return 设备总数
     */
    @Override
    public int countDeviceSum() {
        return tblDeviceMapper.countDeviceSum();
    }

    /**
     * 查询状态为运行的设备总数
     *
     * @return
     */
    @Override
    public int countDeviceSumByStatus() {
        return tblDeviceMapper.countDeviceSumByStatus();

    }

    /**
     * 查询设备的分类总数
     *
     * @return
     */
    @Override
    public int countCategorySum() {

        List<String> categoryList = tblDeviceMapper.countCategorySum();
        Set<String> set = new HashSet<String>(categoryList);
        ExcludeList exclude = new ExcludeList();
        categoryList.clear();
        for (String category : set) {
            if (!exclude.getExclude().contains(category)){
                categoryList.add(category);
            }
        }



        return categoryList.size();
    }

    /**
     * 查询设备借出数
     *
     * @return
     */
    @Override
    public int countDeviceSumByIsBorrow() {

        return tblDeviceMapper.countDeviceSumByIsBorrow();

    }

    /**
     * 查询使用部门及其数量
     *
     * @return
     */
    @Override
    public List<Agency> getAgency() {

        List<String> agencyList = tblDeviceMapper.countAgencySum();
        Set<String> set = new HashSet<String>(agencyList);
        agencyList.clear();
        agencyList.addAll(set);

        System.out.println(agencyList);

        List<Agency> agencyList1 = new ArrayList<Agency>();

        for (String agency : agencyList) {
            //System.out.println("=============================================");

            Agency agency1 = new Agency();
            agency1.setAgencyName(agency);
            agency1.setAgencyCount(tblDeviceMapper.countSumByAgency(agency));
            agencyList1.add(agency1);
        }

        agencyList1.sort((a,b) -> Integer.compare(b.getAgencyCount(),a.getAgencyCount()));
        for (int i = 0; i <agencyList1.size(); i++) {

            agencyList1.get(i).setAgencyMax(Math.pow(0.9,i+1));

        }
        System.out.println(agencyList1);
        return agencyList1;
    }

    /**
     * 查询设备分类及其数量
     *
     * @return
     */
    @Override
    public List<Category> getCategory() {


        List<String> categoryList = tblDeviceMapper.countCategorySum();
        Set<String> set = new HashSet<String>(categoryList);
        categoryList.clear();
        ExcludeList exclude = new ExcludeList();

        for (String category : set) {
            if (!exclude.getExclude().contains(category)){
                categoryList.add(category);
            }
        }

//        categoryList.addAll(set);

//        System.out.println(categoryList);

        List<Category> categoryList1 = new ArrayList<Category>();

        for (String category : categoryList) {
//            System.out.println("=============================================");
            Category category1 = new Category();
            category1.setCategoryName(category);
            category1.setCategoryNum(tblDeviceMapper.countSumByCategory(category));
//            System.out.println(category1);

            categoryList1.add(category1);

        }



        return categoryList1;
    }

    /**
     * 查询 运行数 借出数  监控数
     *
     * @return
     */
    @Override
    public Sum getSum() {

        Sum sum = new Sum();
        sum.setStatusNum(countDeviceSumByStatus());
        sum.setIsBorrow(countDeviceSumByIsBorrow());
        sum.setCountNum(countDeviceSum());
        return sum;
    }


}
