/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.service;

import com.paralun.app.model.Penjualan;
import com.paralun.app.model.PenjualanDetail;
import com.paralun.app.repository.PenjualanDao;
import com.paralun.app.repository.PenjualanDetailDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("penjualanService")
@Transactional(readOnly = true)
public class PenjualanServiceImpl implements PenjualanService {
    
    @Autowired
    private PenjualanDao penjualanDao;
    
    @Autowired
    private PenjualanDetailDao detailDao;

    @Override
    @Transactional(readOnly=false, propagation=Propagation.REQUIRED)
    public void saveOrUpdate(Penjualan penjualan) {
        penjualanDao.saveOrUpdate(penjualan);
    }

    @Override
    @Transactional(readOnly=false, propagation=Propagation.REQUIRED)
    public void delete(Penjualan penjualan) {
        penjualanDao.delete(penjualan);
    }

    @Override
    public Penjualan getPenjualan(String nomor) {
        return penjualanDao.getPenjualan(nomor);
    }

    @Override
    public List<Penjualan> getPenjualans() {
        return penjualanDao.getPenjualans();
    }

    @Override
    @Transactional(readOnly=false, propagation=Propagation.REQUIRED)
    public void saveOrUpdate(PenjualanDetail detail) {
        detailDao.saveOrUpdate(detail);
    }
    
    
}
