package com.ruoyi.framework.web.service.impl;

import com.ruoyi.framework.web.domain.Server;
import com.ruoyi.framework.web.service.ServerService;
import org.springframework.stereotype.Service;


@Service
public class ServerServiceImpl implements ServerService {


    //    @Scheduled(cron = "*/6 * * * * ?")
    public void testServer() throws Exception {
//        System.out.println("=========================");
//        tblDeviceService.countDeviceSumByStatus();

        Server server = new Server();
        server.copyTo();

        double sys = server.getCpu().getSys();//系统使用率
        double used = server.getCpu().getUsed();//用户使用率
        double used1 = server.getMem().getUsed();

    }

}
