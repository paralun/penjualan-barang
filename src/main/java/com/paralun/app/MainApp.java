/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import com.paralun.app.model.Barang;
import com.paralun.app.model.Pelanggan;
import com.paralun.app.service.MasterService;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        MasterService service = (MasterService) ctx.getBean("masterService");
        
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setKodePlg("P001");
        pelanggan.setNamaPlg("Jajang Nurjaman");
        pelanggan.setAlamatPlg("Bandung");
        pelanggan.setTeleponPlg("0987372772");
        pelanggan.setCreateDate(new Date());
        pelanggan.setUpdateDate(new Date());
        
        Barang barang = new Barang();
        barang.setKodeBrg("B001");
        barang.setNamaBrg("Indomie");
        barang.setSatuanBrg("Dus");
        barang.setHargaBrg(52000);
        barang.setStokBrg(100);
        barang.setCreateDate(new Date());
        barang.setUpdateDate(new Date());
        
        service.saveOrUpdate(pelanggan);
        service.saveOrUpdate(barang);
        
    }
    
}
