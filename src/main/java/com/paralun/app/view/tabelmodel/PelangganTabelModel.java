/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.view.tabelmodel;

import com.paralun.app.model.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PelangganTabelModel extends AbstractTableModel {
    
    private final String[] judul = {"Kode", "Nama Pelanggan", "Alamat", "Telepon"};
    private List<Pelanggan> list;

    public PelangganTabelModel() {
        list = new ArrayList<>();
    }

    public PelangganTabelModel(List<Pelanggan> list) {
        this.list = list;
    }

    public List<Pelanggan> getList() {
        return list;
    }

    public void setList(List<Pelanggan> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 :
                return list.get(rowIndex).getKodePlg();
            case 1 :
                return list.get(rowIndex).getNamaPlg();
            case 2 :
                return list.get(rowIndex).getAlamatPlg();
            case 3 :
                return list.get(rowIndex).getTeleponPlg();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return judul[column];
    }

    public Pelanggan get(int index) {
        return list.get(index);
    }
}
