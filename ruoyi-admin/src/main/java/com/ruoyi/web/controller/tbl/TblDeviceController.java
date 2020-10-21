package com.ruoyi.web.controller.tbl;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.service.ITblSysdataService;
import com.ruoyi.system.domain.TblDevice;
import com.ruoyi.system.domain.dto.Agency;
import com.ruoyi.system.domain.dto.Category;
import com.ruoyi.system.domain.dto.Sum;
import com.ruoyi.system.domain.dto.SysDataDTO;
import com.ruoyi.system.service.ITblDeviceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 设备管理Controller
 * 
 * @author admin
 * @date 2020-10-18
 */
@Controller
@RequestMapping("/system/device")
public class TblDeviceController extends BaseController
{
    private String prefix = "system/device";

    @Autowired
    private ITblDeviceService tblDeviceService;
    @Autowired
    private ITblSysdataService tblSysdataService;

    @RequiresPermissions("system:device:view")
    @GetMapping()
    public String device()
    {
        return prefix + "/device";
    }

    /**
     * 查询设备管理列表
     */
    @RequiresPermissions("system:device:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TblDevice tblDevice)
    {
        startPage();
        List<TblDevice> list = tblDeviceService.selectTblDeviceList(tblDevice);
        return getDataTable(list);
    }

    /**
     * 导出设备管理列表
     */
    @RequiresPermissions("system:device:export")
    @Log(title = "设备管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TblDevice tblDevice)
    {
        List<TblDevice> list = tblDeviceService.selectTblDeviceList(tblDevice);
        ExcelUtil<TblDevice> util = new ExcelUtil<TblDevice>(TblDevice.class);
        return util.exportExcel(list, "device");
    }

    /**
     * 新增设备管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备管理
     */
    @RequiresPermissions("system:device:add")
    @Log(title = "设备管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TblDevice tblDevice)
    {
        return toAjax(tblDeviceService.insertTblDevice(tblDevice));
    }

    /**
     * 修改设备管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TblDevice tblDevice = tblDeviceService.selectTblDeviceById(id);
        mmap.put("tblDevice", tblDevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备管理
     */
    @RequiresPermissions("system:device:edit")
    @Log(title = "设备管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TblDevice tblDevice)
    {
        return toAjax(tblDeviceService.updateTblDevice(tblDevice));
    }

    /**
     * 删除设备管理
     */
    @RequiresPermissions("system:device:remove")
    @Log(title = "设备管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tblDeviceService.deleteTblDeviceByIds(ids));
    }


    @RequiresPermissions("system:device:remove")
    @Log(title = "设备管理", businessType = BusinessType.DELETE)
    @GetMapping( "/index")
    @ResponseBody
    public Map<String, Object> index()
    {
        Sum sum = tblDeviceService.getSum();
        int categorySum = tblDeviceService.countCategorySum();
        List<Agency> agency = tblDeviceService.getAgency();
        List<Category> category = tblDeviceService.getCategory();
        List<SysDataDTO> sysDataDTOS = tblSysdataService.selectDataForPic();
        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("success",true);//返回成功与否
        resultMap.put("sum",sum);//返回运行总数\借出总数\监控总数
        resultMap.put("categorySum",categorySum);//返回分类总数
        resultMap.put("agency",agency);//返回雷达图数据
        resultMap.put("category",category);//返回饼状图数据
        resultMap.put("sysDataDTOS",sysDataDTOS);//返回饼状图数据
        resultMap.put("sysDataDTOSNum",sysDataDTOS.size());//返回饼状图数据


        return resultMap;


    }
}
