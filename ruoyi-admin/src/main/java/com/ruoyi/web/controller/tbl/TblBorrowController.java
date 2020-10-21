package com.ruoyi.web.controller.tbl;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.domain.TblBorrow;
import com.ruoyi.system.domain.TblDevice;
import com.ruoyi.system.service.ITblBorrowService;
import com.ruoyi.system.service.ITblDeviceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 设备借出申请Controller
 * 
 * @author ruoyi
 * @date 2020-10-19
 */
@Controller
@RequestMapping("/system/borrow")
public class TblBorrowController extends BaseController
{
    private String prefix = "system/borrow";

    @Autowired
    private ITblBorrowService tblBorrowService;
    @Autowired
    private ITblDeviceService tblDeviceService;
    
    
    @RequiresPermissions("system:borrow:view")
    @GetMapping()
    public String borrow()
    {
        return prefix + "/borrow";
    }

    /**
     * 查询设备借出申请列表
     */
    @RequiresPermissions("system:borrow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TblBorrow tblBorrow)
    {
        startPage();
        List<TblBorrow> list = tblBorrowService.selectTblBorrowList(tblBorrow);
        return getDataTable(list);
    }

    /**
     * 导出设备借出申请列表
     */
    @RequiresPermissions("system:borrow:export")
    @Log(title = "设备借出申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TblBorrow tblBorrow)
    {
        List<TblBorrow> list = tblBorrowService.selectTblBorrowList(tblBorrow);
        ExcelUtil<TblBorrow> util = new ExcelUtil<TblBorrow>(TblBorrow.class);
        return util.exportExcel(list, "borrow");
    }

    /**
     * 新增设备借出申请
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }
    
    /**
     * editer：xu
     * 补充新的申请设备方法，用于配合设备管理功能进行设备的借出登记
     * 新增设备借出申请
     */
    @GetMapping("/add/{id}")
    public String add(@PathVariable("id") Long id, ModelMap mmap)
    {
        //TblBorrow tblBorrow = tblBorrowService.selectTblBorrowById(id);
    	TblBorrow tblBorrow = new TblBorrow();
    	TblDevice tblDevice = tblDeviceService.selectTblDeviceById(id);
        tblBorrow.setDeviceid(tblDevice.getId());
        //获取当前用户的信息
        SysUser currentUser = ShiroUtils.getSysUser();
        tblBorrow.setBorrowBy(currentUser.getUserName());
        
        mmap.put("tblBorrow", tblBorrow);
        return prefix + "/add";
    }

    /**
     * 新增保存设备借出申请
     */
    @RequiresPermissions("system:borrow:add")
    @Log(title = "设备借出申请", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TblBorrow tblBorrow)
    {
        return toAjax(tblBorrowService.insertTblBorrow(tblBorrow));
    }

    /**
     * 修改设备借出申请
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TblBorrow tblBorrow = tblBorrowService.selectTblBorrowById(id);

        mmap.put("tblBorrow", tblBorrow);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备借出申请
     */
    @RequiresPermissions("system:borrow:edit")
    @Log(title = "设备借出申请", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TblBorrow tblBorrow)
    {
        return toAjax(tblBorrowService.updateTblBorrow(tblBorrow));
    }

    /**
     * 删除设备借出申请
     */
    @RequiresPermissions("system:borrow:remove")
    @Log(title = "设备借出申请", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tblBorrowService.deleteTblBorrowByIds(ids));
    }
}
