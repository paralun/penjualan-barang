/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.service;

import com.paralun.app.model.Penjualan;
import com.paralun.app.model.PenjualanDetail;
import java.util.List;

public interface PenjualanService {
    
    public void saveOrUpdate(Penjualan penjualan);
    public void delete(Penjualan penjualan);
    public Penjualan getPenjualan(String nomor);
    public List<Penjualan> getPenjualans();
    
    public void saveOrUpdate(PenjualanDetail detail);
}
