/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.service;

import com.paralun.app.model.Barang;
import com.paralun.app.model.Pelanggan;
import com.paralun.app.repository.BarangDao;
import com.paralun.app.repository.PelangganDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("masterService")
@Transactional(readOnly = true)
public class MasterServiceImpl implements MasterService {
    
    @Autowired
    private BarangDao barangDao;
    @Autowired
    private PelangganDao pelangganDao;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveOrUpdate(Barang barang) {
        barangDao.saveOrUpdate(barang);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void delete(Barang barang) {
        barangDao.delete(barang);
    }

    @Override
    public Barang getBarang(String kode) {
        return barangDao.getBarang(kode);
    }

    @Override
    public List<Barang> getBarangs() {
        return barangDao.getBarangs();
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveOrUpdate(Pelanggan pelanggan) {
        pelangganDao.saveOrUpdate(pelanggan);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void delete(Pelanggan pelanggan) {
        pelangganDao.delete(pelanggan);
    }

    @Override
    public Pelanggan getPelanggan(String kode) {
        return pelangganDao.getPelanggan(kode);
    }

    @Override
    public List<Pelanggan> getPelanggans() {
        return pelangganDao.getPelanggans();
    }
    
}
