/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.service;

import com.paralun.app.model.Barang;
import com.paralun.app.model.Pelanggan;
import java.util.List;

public interface MasterService {
    
    public void saveOrUpdate(Barang barang);
    public void delete(Barang barang);
    public Barang getBarang(String kode);
    public List<Barang> getBarangs();
    
    public void saveOrUpdate(Pelanggan pelanggan);
    public void delete(Pelanggan pelanggan);
    public Pelanggan getPelanggan(String kode);
    public List<Pelanggan> getPelanggans();
}
