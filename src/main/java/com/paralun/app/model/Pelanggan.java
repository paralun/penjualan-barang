/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_pelanggan")
public class Pelanggan implements Serializable {
    
    @Id
    @Column(name = "kode_plg", nullable = false, length = 6)
    private String kodePlg;
    @Column(name = "nama_plg", length = 50)
    private String namaPlg;
    @Column(name = "alamat_plg", length = 100)
    private String alamatPlg;
    @Column(name = "tlp_plg", length = 12)
    private String teleponPlg;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_date")
    private Date updateDate;
    @OneToMany(mappedBy = "pelanggan")
    private List<Penjualan> penjualans;

    public Pelanggan() {
    }

    public String getKodePlg() {
        return kodePlg;
    }

    public void setKodePlg(String kodePlg) {
        this.kodePlg = kodePlg;
    }

    public String getNamaPlg() {
        return namaPlg;
    }

    public void setNamaPlg(String namaPlg) {
        this.namaPlg = namaPlg;
    }

    public String getAlamatPlg() {
        return alamatPlg;
    }

    public void setAlamatPlg(String alamatPlg) {
        this.alamatPlg = alamatPlg;
    }

    public String getTeleponPlg() {
        return teleponPlg;
    }

    public void setTeleponPlg(String teleponPlg) {
        this.teleponPlg = teleponPlg;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<Penjualan> getPenjualans() {
        return penjualans;
    }

    public void setPenjualans(List<Penjualan> penjualans) {
        this.penjualans = penjualans;
    }
    
}
