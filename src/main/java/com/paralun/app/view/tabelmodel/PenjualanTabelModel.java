/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.view.tabelmodel;

import com.paralun.app.model.PenjualanDetail;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PenjualanTabelModel extends AbstractTableModel {
    
    private List<PenjualanDetail> list;
    private final String[] judul = {"Kode Barang", "Nama Barang", "Satuan", "Harga", "Qty", "Total"};

    public PenjualanTabelModel() {
        list = new ArrayList<>();
    }

    public PenjualanTabelModel(List<PenjualanDetail> list) {
        this.list = list;
    }

    public List<PenjualanDetail> getList() {
        return list;
    }

    public void setList(List<PenjualanDetail> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 :
                return list.get(rowIndex).getBarang().getKodeBrg();
            case 1 :
                return list.get(rowIndex).getBarang().getNamaBrg();
            case 2 :
                return list.get(rowIndex).getBarang().getSatuanBrg();
            case 3 :
                return list.get(rowIndex).getHargaJual();
            case 4 :
                return list.get(rowIndex).getJmlJual();
            case 5 :
                return list.get(rowIndex).getTotal();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return judul[column];
    }

    public PenjualanDetail get(int index) {
        return list.get(index);
    }

    public boolean add(PenjualanDetail e) {
        try {
            return list.add(e);
        }finally{
            fireTableRowsInserted(getRowCount() - 1, getRowCount() -1);
        }
    }

    public PenjualanDetail remove(int index) {
        try {
            return list.remove(index);
        }finally{
            fireTableRowsInserted(getRowCount() - 1, getRowCount() -1);
        }
    }
}
