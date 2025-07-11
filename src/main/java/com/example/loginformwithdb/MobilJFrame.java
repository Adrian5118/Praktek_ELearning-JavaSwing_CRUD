/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.loginformwithdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class MobilJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MobilJFrame
     */
    
    private Connection connector;
    private ResultSet results;
    private HashMap<String, Integer> carIndex;
    private HashMap<Integer, Mobil> carData;
    private Mobil selectedMobil = null;
    
    public MobilJFrame(Connection connector) {
        if(connector == null) return;
        this.connector = connector;
        this.carIndex = new HashMap<>();
        this.carData = new HashMap<>();
        
        initComponents();
        reloadList();
        
        // Hide add car panel
        this.jTabbedPane1.removeTabAt(2);
        this.tambahMobil.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarMobil = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dataMobil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        data_ID = new javax.swing.JLabel();
        data_Nama = new javax.swing.JLabel();
        data_Brand = new javax.swing.JLabel();
        data_Warna = new javax.swing.JLabel();
        data_Plat = new javax.swing.JLabel();
        editMobil = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        edit_ID = new javax.swing.JTextField();
        edit_Nama = new javax.swing.JTextField();
        edit_Brand = new javax.swing.JTextField();
        edit_Warna = new javax.swing.JTextField();
        edit_Plat = new javax.swing.JTextField();
        confirmEditButton = new javax.swing.JButton();
        restoreEditButton = new javax.swing.JButton();
        tambahMobil = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        add_ID = new javax.swing.JTextField();
        add_Nama = new javax.swing.JTextField();
        add_Brand = new javax.swing.JTextField();
        add_Warna = new javax.swing.JTextField();
        add_Plat = new javax.swing.JTextField();
        confirmAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Daftar Mobil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        daftarMobil.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        daftarMobil.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                daftarMobilValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(daftarMobil);

        addButton.setText("Tambahkan Mobil");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Hapus");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Data Mobil");

        jLabel3.setText("ID Mobil :");

        jLabel4.setText("Nama mobil :");

        jLabel5.setText("Merk mobil :");

        jLabel6.setText("Warna mobil:");

        jLabel7.setText("Plat mobil:");

        data_ID.setText("(ID)");

        data_Nama.setText("(nama)");

        data_Brand.setText("(merk)");

        data_Warna.setText("(warna)");

        data_Plat.setText("(plat)");

        javax.swing.GroupLayout dataMobilLayout = new javax.swing.GroupLayout(dataMobil);
        dataMobil.setLayout(dataMobilLayout);
        dataMobilLayout.setHorizontalGroup(
            dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(dataMobilLayout.createSequentialGroup()
                        .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(data_Plat)
                            .addComponent(data_Warna)
                            .addComponent(data_Brand)
                            .addComponent(data_Nama)
                            .addComponent(data_ID))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        dataMobilLayout.setVerticalGroup(
            dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(data_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(data_Nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(data_Brand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(data_Warna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(data_Plat))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data", dataMobil);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Edit Data Mobil");

        jLabel9.setText("ID Mobil :");

        jLabel10.setText("Nama mobil :");

        jLabel11.setText("Merk mobil :");

        jLabel12.setText("Warna mobil:");

        jLabel13.setText("Plat mobil:");

        edit_ID.setEditable(false);
        edit_ID.setText("(ID)");

        edit_Nama.setText("(Nama)");

        edit_Brand.setText("(Merk)");
        edit_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_BrandActionPerformed(evt);
            }
        });

        edit_Warna.setText("(Warna)");
        edit_Warna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_WarnaActionPerformed(evt);
            }
        });

        edit_Plat.setText("(Plat)");
        edit_Plat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_PlatActionPerformed(evt);
            }
        });

        confirmEditButton.setText("Rubah");
        confirmEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditButtonActionPerformed(evt);
            }
        });

        restoreEditButton.setText("Restore");
        restoreEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreEditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editMobilLayout = new javax.swing.GroupLayout(editMobil);
        editMobil.setLayout(editMobilLayout);
        editMobilLayout.setHorizontalGroup(
            editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editMobilLayout.createSequentialGroup()
                        .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(33, 33, 33)
                        .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_ID)
                            .addComponent(edit_Nama)
                            .addComponent(edit_Brand)
                            .addComponent(edit_Warna, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edit_Plat)))
                    .addGroup(editMobilLayout.createSequentialGroup()
                        .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(editMobilLayout.createSequentialGroup()
                                .addComponent(confirmEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(restoreEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editMobilLayout.setVerticalGroup(
            editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(edit_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(edit_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(edit_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(edit_Warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(edit_Plat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restoreEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit", editMobil);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Tambah Mobil");

        jLabel15.setText("ID Mobil :");

        jLabel16.setText("Nama mobil :");

        jLabel17.setText("Merk mobil :");

        jLabel18.setText("Warna mobil:");

        jLabel19.setText("Plat mobil:");

        add_ID.setEditable(false);
        add_ID.setText("(ID)");

        add_Nama.setText("(Nama)");

        add_Brand.setText("(Merk)");
        add_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_BrandActionPerformed(evt);
            }
        });

        add_Warna.setText("(Warna)");
        add_Warna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_WarnaActionPerformed(evt);
            }
        });

        add_Plat.setText("(Plat)");
        add_Plat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_PlatActionPerformed(evt);
            }
        });

        confirmAddButton.setText("Tambah");
        confirmAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tambahMobilLayout = new javax.swing.GroupLayout(tambahMobil);
        tambahMobil.setLayout(tambahMobilLayout);
        tambahMobilLayout.setHorizontalGroup(
            tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahMobilLayout.createSequentialGroup()
                        .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(33, 33, 33)
                        .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_ID)
                            .addComponent(add_Nama)
                            .addComponent(add_Brand)
                            .addComponent(add_Warna, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(add_Plat)))
                    .addGroup(tambahMobilLayout.createSequentialGroup()
                        .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(confirmAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 248, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tambahMobilLayout.setVerticalGroup(
            tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(add_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(add_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(add_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(add_Warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(add_Plat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah", tambahMobil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.addTab("Tambah", tambahMobil);
        tambahMobil.setVisible(true);
        jTabbedPane1.setSelectedIndex(2);
        add_ID.setText(carIndex.size() + "");
    }//GEN-LAST:event_addButtonActionPerformed

    private void daftarMobilValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_daftarMobilValueChanged
        // TODO add your handling code here:
        selectedMobil = carData.get(
                carIndex.get(
                        daftarMobil.getSelectedValue()
                )
        );
        
        try {
            updateShownData();
            updateShownEdit();
        } catch (NullPointerException npe) {
            System.out.println("Silahkan pilih mobil yang anda barusan edit untuk melihat tampilan data mobil yang diupdate.");
        }
    }//GEN-LAST:event_daftarMobilValueChanged

    private void edit_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_BrandActionPerformed

    private void edit_WarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_WarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_WarnaActionPerformed

    private void edit_PlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_PlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_PlatActionPerformed

    private void restoreEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreEditButtonActionPerformed
        // TODO add your handling code here:
        updateShownEdit();
    }//GEN-LAST:event_restoreEditButtonActionPerformed

    private void confirmEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditButtonActionPerformed
        // TODO add your handling code here:
        updateSelectedMobil(Integer.parseInt(edit_ID.getText()));
        selectedMobil = carData.get(Integer.parseInt(edit_ID.getText()));
        updateShownData();
        updateShownEdit();
    }//GEN-LAST:event_confirmEditButtonActionPerformed

    private void add_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_BrandActionPerformed

    private void add_WarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_WarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_WarnaActionPerformed

    private void add_PlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_PlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_PlatActionPerformed

    private void confirmAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddButtonActionPerformed
        // TODO add your handling code here:
        insertNewMobil(
                Integer.parseInt(add_ID.getText()),
                add_Nama.getText(),
                add_Brand.getText(),
                add_Plat.getText(),
                add_Warna.getText()
        );
    }//GEN-LAST:event_confirmAddButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        dropMobil(selectedMobil.id);
        reloadList();
        
    }//GEN-LAST:event_removeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MobilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MobilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MobilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MobilJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MobilJFrame(null).setVisible(true);
            }
        });
    }
    
    private void updateSelectedMobil(int id) {
        PreparedStatement statement;
        try {
            statement = connector.prepareStatement("UPDATE mobil SET nama = ?, brand = ?, warna = ?, plat = ? WHERE id = ?");
            statement.setString(1, edit_Nama.getText());
            statement.setString(2, edit_Brand.getText());
            statement.setString(3, edit_Warna.getText());
            statement.setString(4, edit_Plat.getText());
            statement.setInt(5, Integer.parseInt(edit_ID.getText()));
            
            statement.executeUpdate();
            statement.close();
            
            reloadList();
        } catch (SQLException sqle) {
            System.err.printf("Failed updating mobil data.\n\nReason: %s\n", sqle.getMessage());
        }
    }
    
    private void insertNewMobil(int id, String Nama, String Brand, String Warna, String Plat) {
        try {
            PreparedStatement statement = connector.prepareStatement("INSERT INTO mobil (id, nama, brand, warna, plat) VALUES (?, ?, ?, ?, ?);");
            statement.setInt(1, id);
            statement.setString(2, Nama);
            statement.setString(3, Brand);
            statement.setString(4, Warna);
            statement.setString(5, Plat);
            statement.executeUpdate();
            
            reloadList();
            statement.close();
            tambahMobil.setVisible(false);
            jTabbedPane1.removeTabAt(2);
        } catch (SQLException sqle) {
            System.err.printf("Unable to insert new mobil.\n\nReason: %s\n", sqle.getMessage());
        }
    }
    
    private void dropMobil(int id) {
        try {
            PreparedStatement statement = connector.prepareStatement("DELETE FROM mobil WHERE id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException sqle) {
            System.err.printf("Unable to delete selected mobil.\n\nReason: %s\n", sqle.getMessage());
        }
    }
    
    private void reloadList() {
        PreparedStatement statement;
        try {
            statement = connector.prepareStatement("SELECT * FROM mobil ORDER BY id;");
            results = statement.executeQuery();
            carIndex.clear();
            carData.clear();
            while(results.next()) {
                carIndex.put(results.getString("nama"), results.getInt("id"));
                carData.put(results.getInt("id"), new Mobil(
                        results.getInt("id"),
                        results.getString("nama"),
                        results.getString("brand"),
                        results.getString("warna"),
                        results.getString("plat")
                ));
            }
            statement.close();
        } catch (SQLException sqle) {
            System.err.printf("Failed (re)loading list.\nReason: %s\n", sqle.getMessage());
        }
        
        String[] strList = new String[carIndex.size()];
        daftarMobil.setListData(carIndex.keySet().toArray(strList));
    }
    
    private void updateShownData() {
        data_ID.setText(selectedMobil.id + "");
        data_Nama.setText(selectedMobil.nama);
        data_Brand.setText(selectedMobil.brand);
        data_Warna.setText(selectedMobil.warna);
        data_Plat.setText(selectedMobil.plat);
    }
    
    private void updateShownEdit() {
        edit_ID.setText(selectedMobil.id + "");
        edit_Nama.setText(selectedMobil.nama);
        edit_Brand.setText(selectedMobil.brand);
        edit_Warna.setText(selectedMobil.warna);
        edit_Plat.setText(selectedMobil.plat);
    }
    
    private class Mobil {
        int id;
        String nama;
        String brand;
        String warna;
        String plat;
        
        public Mobil(int id, String nama, String brand, String warna, String plat) {
            this.id = id;
            this.nama = nama;
            this.brand = brand;
            this.warna = warna;
            this.plat = plat;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField add_Brand;
    private javax.swing.JTextField add_ID;
    private javax.swing.JTextField add_Nama;
    private javax.swing.JTextField add_Plat;
    private javax.swing.JTextField add_Warna;
    private javax.swing.JButton confirmAddButton;
    private javax.swing.JButton confirmEditButton;
    private javax.swing.JList<String> daftarMobil;
    private javax.swing.JPanel dataMobil;
    private javax.swing.JLabel data_Brand;
    private javax.swing.JLabel data_ID;
    private javax.swing.JLabel data_Nama;
    private javax.swing.JLabel data_Plat;
    private javax.swing.JLabel data_Warna;
    private javax.swing.JPanel editMobil;
    private javax.swing.JTextField edit_Brand;
    private javax.swing.JTextField edit_ID;
    private javax.swing.JTextField edit_Nama;
    private javax.swing.JTextField edit_Plat;
    private javax.swing.JTextField edit_Warna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton restoreEditButton;
    private javax.swing.JPanel tambahMobil;
    // End of variables declaration//GEN-END:variables
}
