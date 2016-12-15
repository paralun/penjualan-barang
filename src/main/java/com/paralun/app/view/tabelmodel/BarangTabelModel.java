/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.view.tabelmodel;

import com.paralun.app.model.Barang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BarangTabelModel extends AbstractTableModel {
    
    private List<Barang> list;
    
    private final String[] judul = {"Kode", "Nama Barang", "Satuan", "Harga", "Stok"};

    public BarangTabelModel() {
        list = new ArrayList<>();
    }

    public BarangTabelModel(List<Barang> list) {
        this.list = list;
    }

    public void setList(List<Barang> list) {
        this.list = list;
    }

    public List<Barang> getList() {
        return list;
    }

    @Override
    public String getColumnName(int column) {
        return judul[column];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 :
                return list.get(rowIndex).getKodeBrg();
            case 1 :
                return list.get(rowIndex).getNamaBrg();
            case 2 :
                return list.get(rowIndex).getSatuanBrg();
            case 3 :
                return list.get(rowIndex).getHargaBrg();
            case 4 :
                return list.get(rowIndex).getStokBrg();
            default:
                return null;
        }
    }
    
    
}
