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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_pnjl", nullable = false)
    private Integer noPnjl;
    @Temporal(TemporalType.DATE)
    @Column(name = "tgl_pnjl")
    private Date tglPnjl;
    @Column(name = "total")
    private Integer total;
    @ManyToOne
    @JoinColumn(name = "kode_plg")
    private Pelanggan pelanggan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "penjualan")
    private List<PenjualanDetail> penjualanDetails;

    public Penjualan() {
    }

    public Integer getNoPnjl() {
        return noPnjl;
    }

    public void setNoPnjl(Integer noPnjl) {
        this.noPnjl = noPnjl;
    }

    public Date getTglPnjl() {
        return tglPnjl;
    }

    public void setTglPnjl(Date tglPnjl) {
        this.tglPnjl = tglPnjl;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
