package com.ruoyi.system.utils;

import java.util.Arrays;
import java.util.List;

/**
 * 临时
 *
 * 不接受的数据列表
 *
 */
public class ExcludeList {

    private List<String> exclude;


    public ExcludeList() {

        this.exclude = Arrays.asList("企业级信息系统", "KVM设备", "非企业级信息系统", "防火墙", "UPS", "机房空调", "防病毒软件",
                "桌面微机", "扫描仪", "打印机", "机房综合监控设备", "IDS/IPS", "磁盘阵列", "虚拟化软件", "显示器", "操作系统",
                "智能移动终端", "机房动力环境监控设备", "物理磁带库", "上网行为审计设备", "蓄电池", "机房门禁设备", "虚拟磁带库",
                "机柜");

    }

    public List<String> getExclude() {
        return exclude;
    }
}
