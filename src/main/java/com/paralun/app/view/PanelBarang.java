/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.view;

import com.paralun.app.model.Barang;
import com.paralun.app.service.MasterService;
import com.paralun.app.view.tabelmodel.BarangTabelModel;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.springframework.context.ApplicationContext;

public class PanelBarang extends javax.swing.JPanel implements ListSelectionListener {

    private BarangTabelModel tabelModel;
    private final MasterService service;
    private Barang barang;
    private FormMain main;

    public PanelBarang(FormMain main, ApplicationContext context) {
        initComponents();
        this.main = main;
        service = (MasterService) context.getBean("masterService");
        tabelBarang.getSelectionModel().addListSelectionListener(this);
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textKodeBrg = new javax.swing.JTextField();
        textNamaBrg = new javax.swing.JTextField();
        textSatuanBrg = new javax.swing.JTextField();
        textHargaBrg = new javax.swing.JTextField();
        textStokBrg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        buttonClose = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Daftar Barang");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Kode Barang :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nama Barang :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Satuan Barang :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Harga Barang :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Stok Barang :");

        textHargaBrg.setText("0");

        textStokBrg.setText("0");

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelBarang);

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textKodeBrg)
                                    .addComponent(textNamaBrg)
                                    .addComponent(textSatuanBrg)
                                    .addComponent(textHargaBrg)
                                    .addComponent(textStokBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textKodeBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textSatuanBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textHargaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textStokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClose)
                    .addComponent(buttonClear)
                    .addComponent(buttonDelete)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonSave))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        // TODO add your handling code here:
        main.addPanelUtama();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void loadData() {
        List<Barang> list = service.getBarangs();
        tabelModel = new BarangTabelModel();
        tabelModel.setList(list);
        tabelBarang.setModel(tabelModel);
    }

    private boolean validation() {
        return textKodeBrg.getText().trim().isEmpty()
                || textNamaBrg.getText().trim().isEmpty()
                || textSatuanBrg.getText().trim().isEmpty()
                || textHargaBrg.getText().trim().isEmpty()
                || textStokBrg.getText().trim().isEmpty();
    }

    private void save() {
        if (validation()) {
            JOptionPane.showMessageDialog(this, "Data harus di isi semua");
        } else {
            barang = new Barang();
            barang.setKodeBrg(textKodeBrg.getText());
            barang.setNamaBrg(textNamaBrg.getText());
            barang.setSatuanBrg(textSatuanBrg.getText());
            barang.setHargaBrg(Integer.parseInt(textHargaBrg.getText()));
            barang.setStokBrg(Integer.parseInt(textStokBrg.getText()));
            barang.setCreateDate(new Date());
            barang.setUpdateDate(new Date());

            try {
                service.saveOrUpdate(barang);
                JOptionPane.showMessageDialog(this, "Data berhasil di simpan");
                clear();
                loadData();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Data gagal di simpan");
            }
        }
    }

    private void update() {
        if (tabelBarang.getSelectedRow() != -1) {
            if (validation()) {
                JOptionPane.showMessageDialog(this, "Data harus di isi semua");
            } else {
                barang.setKodeBrg(textKodeBrg.getText());
                barang.setNamaBrg(textNamaBrg.getText());
                barang.setSatuanBrg(textSatuanBrg.getText());
                barang.setHargaBrg(Integer.parseInt(textHargaBrg.getText()));
                barang.setStokBrg(Integer.parseInt(textStokBrg.getText()));
                barang.setUpdateDate(new Date());

                try {
                    service.saveOrUpdate(barang);
                    JOptionPane.showMessageDialog(this, "Data berhasil di Update");
                    clear();
                    loadData();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Data gagal di Update");
                }
            }
        }
    }
    
    private void delete() {
        if(tabelBarang.getSelectedRow() != -1) {
            try {
                if(JOptionPane.showConfirmDialog(this, 
                        "Anda yakin Ingin Menghapus Data Barang", "Konfirmasi", 
                        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
                    service.delete(barang);
                    clear();
                    loadData();
                }
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Gagal Delete Data");
            }
        }
    }

    private void clear() {
        textKodeBrg.setText("");
        textNamaBrg.setText("");
        textSatuanBrg.setText("");
        textHargaBrg.setText("0");
        textStokBrg.setText("0");
        tabelBarang.clearSelection();
        barang = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField textHargaBrg;
    private javax.swing.JTextField textKodeBrg;
    private javax.swing.JTextField textNamaBrg;
    private javax.swing.JTextField textSatuanBrg;
    private javax.swing.JTextField textStokBrg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            barang = tabelModel.get(tabelBarang.convertRowIndexToModel(tabelBarang.getSelectedRow()));
            textKodeBrg.setText(barang.getKodeBrg());
            textNamaBrg.setText(barang.getNamaBrg());
            textSatuanBrg.setText(barang.getSatuanBrg());
            textHargaBrg.setText(barang.getHargaBrg() + "");
            textStokBrg.setText(barang.getStokBrg() + "");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
        }
    }
}
