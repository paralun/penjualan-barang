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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_barang")
public class Barang implements Serializable{
    
    @Id
    @Column(name = "kode_brg", nullable = false, length = 6)
    private String kodeBrg;
    @Column(name = "nama_Brg", length = 50)
    private String namaBrg;
    @Column(name = "satusn_brg", length = 10)
    private String satuanBrg;
    @Column(name = "harga_brg")
    private Integer hargaBrg;
    @Column(name = "stok_brg")
    private Integer stokBrg;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_date")
    private Date updateDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "barang")
    private List<PenjualanDetail> penjualanDetails;

    public Barang() {
    }

    public Barang(String kodeBrg) {
        this.kodeBrg = kodeBrg;
    }

    public String getKodeBrg() {
        return kodeBrg;
    }

    public void setKodeBrg(String kodeBrg) {
        this.kodeBrg = kodeBrg;
    }

    public String getNamaBrg() {
        return namaBrg;
    }

    public void setNamaBrg(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public String getSatuanBrg() {
        return satuanBrg;
    }

    public void setSatuanBrg(String satuanBrg) {
        this.satuanBrg = satuanBrg;
    }

    public Integer getHargaBrg() {
        return hargaBrg;
    }

    public void setHargaBrg(Integer hargaBrg) {
        this.hargaBrg = hargaBrg;
    }

    public Integer getStokBrg() {
        return stokBrg;
    }

    public void setStokBrg(Integer stokBrg) {
        this.stokBrg = stokBrg;
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

    public List<PenjualanDetail> getPenjualanDetails() {
        return penjualanDetails;
    }

    public void setPenjualanDetails(List<PenjualanDetail> penjualanDetails) {
        this.penjualanDetails = penjualanDetails;
    }
    
}
