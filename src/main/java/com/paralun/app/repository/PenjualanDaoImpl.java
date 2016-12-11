/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.Penjualan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("penjualanDao")
public class PenjualanDaoImpl implements PenjualanDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrUpdate(Penjualan penjualan) {
        sessionFactory.getCurrentSession().saveOrUpdate(penjualan);
    }

    @Override
    public void delete(Penjualan penjualan) {
        sessionFactory.getCurrentSession().delete(penjualan);
    }

    @Override
    public Penjualan getPenjualan(int kode) {
        return (Penjualan) sessionFactory.getCurrentSession()
                .createQuery("from Penjualan where noJual = :kode")
                .setParameter("kode", kode)
                .uniqueResult();
    }

    @Override
    public List<Penjualan> getPenjualans() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Penjualan")
                .list();
    }
    
}
