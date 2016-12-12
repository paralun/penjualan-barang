/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_penjualan")
public class Penjualan implements Serializable {
    
    @Id
    @Column(name = "no_jual", nullable = false)
    private String noJual;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "tgl_jual")
    private Date tglJual;
    
    @Column(name = "total_jual")
    private Integer totalJual;
    
    @ManyToOne
    @JoinColumn(name = "kode_plg", referencedColumnName = "kode_plg")
    private Pelanggan pelanggan;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "penjualan")
    private List<PenjualanDetail> penjualanDetails;

    public Penjualan() {
    }

    public String getNoJual() {
        return noJual;
    }

    public void setNoJual(String noJual) {
        this.noJual = noJual;
    }

    public Date getTglJual() {
        return tglJual;
    }

    public void setTglJual(Date tglJual) {
        this.tglJual = tglJual;
    }

    public Integer getTotalJual() {
        return totalJual;
    }

    public void setTotalJual(Integer totalJual) {
        this.totalJual = totalJual;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public List<PenjualanDetail> getPenjualanDetails() {
        return penjualanDetails;
    }

    public void setPenjualanDetails(List<PenjualanDetail> penjualanDetails) {
        this.penjualanDetails = penjualanDetails;
    }
    
}
