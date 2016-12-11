/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import com.paralun.app.model.Barang;
import com.paralun.app.model.Pelanggan;
import com.paralun.app.model.Penjualan;
import com.paralun.app.model.PenjualanDetail;
import com.paralun.app.service.MasterService;
import com.paralun.app.service.PenjualanService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        MasterService service = (MasterService) ctx.getBean("masterService");
        PenjualanService ps = (PenjualanService) ctx.getBean("penjualanService");
        
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setKodePlg("P001");
        pelanggan.setNamaPlg("Jajang Nurjaman");
        pelanggan.setAlamatPlg("Bandung");
        pelanggan.setTeleponPlg("0987372772");
        pelanggan.setCreateDate(new Date());
        pelanggan.setUpdateDate(new Date());
        
        Barang barang1 = new Barang();
        barang1.setKodeBrg("B001");
        barang1.setNamaBrg("Indomie");
        barang1.setSatuanBrg("Dus");
        barang1.setHargaBrg(52000);
        barang1.setStokBrg(100);
        barang1.setCreateDate(new Date());
        barang1.setUpdateDate(new Date());
        
        Barang barang2 = new Barang();
        barang2.setKodeBrg("B002");
        barang2.setNamaBrg("Indomie");
        barang2.setSatuanBrg("Dus");
        barang2.setHargaBrg(52000);
        barang2.setStokBrg(100);
        barang2.setCreateDate(new Date());
        barang2.setUpdateDate(new Date());
        
        //service.saveOrUpdate(pelanggan);
        //service.saveOrUpdate(barang);
        
        Penjualan penjualan = new Penjualan();
        penjualan.setNoJual("J001");
        penjualan.setTglJual(new Date());
        penjualan.setTotalJual(104000);
        penjualan.setPelanggan(pelanggan);
        
        PenjualanDetail detail1 = new PenjualanDetail();
        detail1.setJmlJual(1);
        detail1.setHargaJual(52000);
        detail1.setBarang(barang1);
        detail1.setPenjualan(penjualan);
        
        PenjualanDetail detail2 = new PenjualanDetail();
        detail2.setJmlJual(1);
        detail2.setHargaJual(52000);
        detail2.setBarang(barang2);
        detail2.setPenjualan(penjualan);
        
        List<PenjualanDetail> list = new ArrayList<>();
        list.add(detail1);
        list.add(detail2);
        
        penjualan.setPenjualanDetails(list);
        
        ps.saveOrUpdate(penjualan);
        
    }
    
}
