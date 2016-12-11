/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_penjualan_detail")
public class PenjualanDetail implements Serializable {
    
    @Id
    private PenjualanPK noJual = new PenjualanPK();
    
    @Column(name = "jml_jual")
    private Integer jmlJual;
    
    @Column(name = "harga_jual")
    private Integer hargaJual;
    
    @ManyToOne
    @JoinColumn(name = "kode_brg", referencedColumnName = "kode_brg", nullable = false, insertable = false, updatable = false)
    private Barang barang;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "no_jual", referencedColumnName = "no_jual", nullable = false, insertable = false, updatable = false)
    private Penjualan penjualan;

    public PenjualanDetail() {
    }

    public PenjualanPK getNoJual() {
        return noJual;
    }

    public void setNoJual(PenjualanPK noJual) {
        this.noJual = noJual;
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
        this.noJual.setKodeBrg(barang.getKodeBrg());
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
        this.noJual.setNoJual(penjualan.getNoJual());
    }
    
}
