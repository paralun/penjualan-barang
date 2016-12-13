/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import com.paralun.app.model.Barang;
import com.paralun.app.model.Penjualan;
import com.paralun.app.model.PenjualanDetail;
import com.paralun.app.service.MasterService;
import com.paralun.app.service.PenjualanService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        MasterService service = (MasterService) ctx.getBean("masterService");
        PenjualanService ps = (PenjualanService) ctx.getBean("penjualanService");
    }
}
