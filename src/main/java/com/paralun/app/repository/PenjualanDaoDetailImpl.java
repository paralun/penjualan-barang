/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.PenjualanDetail;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("penjualanDetail")
public class PenjualanDaoDetailImpl implements PenjualanDetailDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrUpdate(PenjualanDetail detail) {
        sessionFactory.getCurrentSession().saveOrUpdate(detail);
    }

    @Override
    public void delete(PenjualanDetail detail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PenjualanDetail> getPenjualanDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
