/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.Penjualan;
import java.util.List;

public interface PenjualanDao {
    
    public void saveOrUpdate(Penjualan penjualan);
    public void delete(Penjualan penjualan);
    public Penjualan getPenjualan(String nomor);
    public List<Penjualan> getPenjualans();
}
