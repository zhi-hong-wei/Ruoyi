package com.ruoyi.web.controller.tbl;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.TblRfidtag;
import com.ruoyi.system.service.ITblRfidtagService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RFID标签管理Controller
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
@Controller
@RequestMapping("/system/rfidtag")
public class TblRfidtagController extends BaseController
{
    private String prefix = "system/rfidtag";

    @Autowired
    private ITblRfidtagService tblRfidtagService;

    @RequiresPermissions("system:rfidtag:view")
    @GetMapping()
    public String rfidtag()
    {
        return prefix + "/rfidtag";
    }

    /**
     * 查询RFID标签管理列表
     */
    @RequiresPermissions("system:rfidtag:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TblRfidtag tblRfidtag)
    {
        startPage();
        List<TblRfidtag> list = tblRfidtagService.selectTblRfidtagList(tblRfidtag);
        return getDataTable(list);
    }

    /**
     * 导出RFID标签管理列表
     */
    @RequiresPermissions("system:rfidtag:export")
    @Log(title = "RFID标签管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TblRfidtag tblRfidtag)
    {
        List<TblRfidtag> list = tblRfidtagService.selectTblRfidtagList(tblRfidtag);
        ExcelUtil<TblRfidtag> util = new ExcelUtil<TblRfidtag>(TblRfidtag.class);
        return util.exportExcel(list, "rfidtag");
    }

    /**
     * 新增RFID标签管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存RFID标签管理
     */
    @RequiresPermissions("system:rfidtag:add")
    @Log(title = "RFID标签管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TblRfidtag tblRfidtag)
    {
        return toAjax(tblRfidtagService.insertTblRfidtag(tblRfidtag));
    }

    /**
     * 修改RFID标签管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TblRfidtag tblRfidtag = tblRfidtagService.selectTblRfidtagById(id);
        mmap.put("tblRfidtag", tblRfidtag);
        return prefix + "/edit";
    }

    /**
     * 修改保存RFID标签管理
     */
    @RequiresPermissions("system:rfidtag:edit")
    @Log(title = "RFID标签管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TblRfidtag tblRfidtag)
    {
        return toAjax(tblRfidtagService.updateTblRfidtag(tblRfidtag));
    }

    /**
     * 删除RFID标签管理
     */
    @RequiresPermissions("system:rfidtag:remove")
    @Log(title = "RFID标签管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tblRfidtagService.deleteTblRfidtagByIds(ids));
    }
}
