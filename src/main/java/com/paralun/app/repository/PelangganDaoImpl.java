/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.Pelanggan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("pelangganDao")
public class PelangganDaoImpl implements PelangganDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrUpdate(Pelanggan pelanggan) {
        sessionFactory.getCurrentSession().saveOrUpdate(pelanggan);
    }

    @Override
    public void delete(Pelanggan pelanggan) {
        sessionFactory.getCurrentSession().delete(pelanggan);
    }

    @Override
    public Pelanggan getPelanggan(String kode) {
        return (Pelanggan) sessionFactory.getCurrentSession()
                .createQuery("from Pelanggan where kodePlg = :kode")
                .setParameter("kode", kode)
                .uniqueResult();
    }

    @Override
    public List<Pelanggan> getPelanggans() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Pelanggan")
                .list();
    }
    
}
