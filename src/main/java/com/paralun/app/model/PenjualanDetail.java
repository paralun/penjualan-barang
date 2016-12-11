/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_penjualan_detail")
public class PenjualanDetail implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail _id", nullable = false)
    private Integer id;
    @Column(name = "jml_jual")
    private Integer jmlJual;
    @Column(name = "harga_jual")
    private Integer hargaJual;
    @ManyToOne
    @JoinColumn(name = "kode_brg")
    private Barang barang;
    @ManyToOne
    @JoinColumn(name = "no_pnjl")
    private Penjualan penjualan;

    public PenjualanDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJmlJual() {
        return jmlJual;
    }

    public void setJmlJual(Integer jmlJual) {
        this.jmlJual = jmlJual;
    }

    public Integer getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(Integer hargaJual) {
        this.hargaJual = hargaJual;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }
    
}
