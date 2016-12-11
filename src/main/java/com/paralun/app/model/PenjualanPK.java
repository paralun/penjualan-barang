/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PenjualanPK implements Serializable {
    
    @Column(name = "no_jual", nullable = false)
    private String noJual;
    
    @Column(name = "kode_brg", nullable = false)
    private String kodeBrg;

    public PenjualanPK() {
    }

    public PenjualanPK(String noJual, String kodeBrg) {
        this.noJual = noJual;
        this.kodeBrg = kodeBrg;
    }

    public String getNoJual() {
        return noJual;
    }

    public void setNoJual(String noJual) {
        this.noJual = noJual;
    }

    public String getKodeBrg() {
        return kodeBrg;
    }

    public void setKodeBrg(String kodeBrg) {
        this.kodeBrg = kodeBrg;
    }
}
