package com.ruoyi.web.controller.tbl;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.TblRfiddevice;
import com.ruoyi.system.service.ITblRfiddeviceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RFID设备管理Controller
 * 
 * @author admin
 * @date 2020-10-19
 */
@Controller
@RequestMapping("/system/rfiddevice")
public class TblRfiddeviceController extends BaseController
{
    private String prefix = "system/rfiddevice";

    @Autowired
    private ITblRfiddeviceService tblRfiddeviceService;

    @RequiresPermissions("system:rfiddevice:view")
    @GetMapping()
    public String rfiddevice()
    {
        return prefix + "/rfiddevice";
    }

    /**
     * 查询RFID设备管理列表
     */
    @RequiresPermissions("system:rfiddevice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TblRfiddevice tblRfiddevice)
    {
        startPage();
        List<TblRfiddevice> list = tblRfiddeviceService.selectTblRfiddeviceList(tblRfiddevice);
        return getDataTable(list);
    }

    /**
     * 导出RFID设备管理列表
     */
    @RequiresPermissions("system:rfiddevice:export")
    @Log(title = "RFID设备管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TblRfiddevice tblRfiddevice)
    {
        List<TblRfiddevice> list = tblRfiddeviceService.selectTblRfiddeviceList(tblRfiddevice);
        ExcelUtil<TblRfiddevice> util = new ExcelUtil<TblRfiddevice>(TblRfiddevice.class);
        return util.exportExcel(list, "rfiddevice");
    }

    /**
     * 新增RFID设备管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存RFID设备管理
     */
    @RequiresPermissions("system:rfiddevice:add")
    @Log(title = "RFID设备管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TblRfiddevice tblRfiddevice)
    {
        return toAjax(tblRfiddeviceService.insertTblRfiddevice(tblRfiddevice));
    }

    /**
     * 修改RFID设备管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TblRfiddevice tblRfiddevice = tblRfiddeviceService.selectTblRfiddeviceById(id);
        mmap.put("tblRfiddevice", tblRfiddevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存RFID设备管理
     */
    @RequiresPermissions("system:rfiddevice:edit")
    @Log(title = "RFID设备管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TblRfiddevice tblRfiddevice)
    {
        return toAjax(tblRfiddeviceService.updateTblRfiddevice(tblRfiddevice));
    }

    /**
     * 删除RFID设备管理
     */
    @RequiresPermissions("system:rfiddevice:remove")
    @Log(title = "RFID设备管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tblRfiddeviceService.deleteTblRfiddeviceByIds(ids));
    }
}
