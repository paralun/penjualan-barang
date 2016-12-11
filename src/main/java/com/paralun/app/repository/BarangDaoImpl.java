/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.Barang;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("barangDao")
public class BarangDaoImpl implements BarangDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrUpdate(Barang barang) {
        sessionFactory.getCurrentSession().saveOrUpdate(barang);
    }

    @Override
    public void delete(Barang barang) {
        sessionFactory.getCurrentSession().delete(barang);
    }

    @Override
    public Barang getBarang(String kode) {
        return (Barang) sessionFactory.getCurrentSession()
                .createQuery("from Barang where kodeBrg = :kode")
                .setParameter("kode", kode).uniqueResult();
    }

    @Override
    public List<Barang> getBarangs() {
        return sessionFactory.getCurrentSession()
                .createQuery("fromBarang")
                .list();
    }
}
