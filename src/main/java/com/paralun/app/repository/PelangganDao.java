/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.Pelanggan;
import java.util.List;


public interface PelangganDao {
    
    public void saveOrUpdate(Pelanggan pelanggan);
    public void delete(Pelanggan pelanggan);
    public Pelanggan getPelanggan(String kode);
    public List<Pelanggan> getPelanggans();
    
}
