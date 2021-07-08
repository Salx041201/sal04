package panel.supplier;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import method.dataForAllPanel;
import method.databaseModel;

public class panelSupplier extends dataForAllPanel {

    modelSupplier modelSupplier = new modelSupplier();
    databaseModel databaseModel = new databaseModel();

    public panelSupplier() {
        initComponents();
        modelSupplier.setTable("SELECT * FROM dtsplr", tabelBarang);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKodeSupplier = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        txtNamaSupplier = new javax.swing.JTextField();
        dateTanggalPengirimanBarang = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        btnKeluar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1370, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Barang");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 1200, 37));

        jLabel3.setText("Kode Supplier");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel7.setText("Telp.");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 80, -1));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 80, -1));

        jLabel5.setText("Tanggal Pengiriman Barang");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 80, -1));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 80, -1));

        jLabel8.setText("Nama Supplier");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel11.setText("Alamat");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));
        add(txtKodeSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 200, -1));
        add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 200, -1));

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Kode Supplier", "Nama Supplier", "Telp.", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 550, 160));
        add(txtNamaSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 200, -1));
        add(dateTanggalPengirimanBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 210, -1));

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 370, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void reload() {
        dateTanggalPengirimanBarang.setDate(null);
        txtKodeSupplier.setText("");
        txtNamaSupplier.setText("");
        txtTelepon.setText("");
        txtAlamat.setText("");

        modelSupplier.setTable("SELECT * FROM dtsplr", tabelBarang);
    }

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        reload();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        if (confirm("Yakin ingin menyimpan \"" + txtKodeSupplier.getText() + "\"?") == JOptionPane.YES_OPTION) {

            String queryInsert = "INSERT INTO `dtsplr`\n"
                    + "(`kode_supplier`, `nama_supplier`, `telp`, `alamat`, `tanggal_pengiriman_barang`) VALUES \n"
                    + "(\"" + txtKodeSupplier.getText() + "\", \n"
                    + "	\"" + txtNamaSupplier.getText() + "\", \n"
                    + "	\"" + txtTelepon.getText() + "\", \n"
                    + "	\"" + txtAlamat.getText() + "\", \n"
                    + "	\"" + ((JTextField) dateTanggalPengirimanBarang.getDateEditor().getUiComponent()).getText() + "\");";

            databaseModel.proses(queryInsert, "dtsplr", "tambah");
            reload();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if (confirm("Yakin ingin mengubah \"" + txtKodeSupplier.getText() + "\"?") == JOptionPane.YES_OPTION) {

            String queryUpdate = "UPDATE `dtsplr` SET \n"
                    + "`nama_supplier`=\"" + txtNamaSupplier.getText() + "\",\n"
                    + "`telp`=\"" + txtTelepon.getText() + "\",\n"
                    + "`alamat`=\"" + txtAlamat.getText() + "\",\n"
                    + "`tanggal_pengiriman_barang`=\"" + ((JTextField) dateTanggalPengirimanBarang.getDateEditor().getUiComponent()).getText() + "\" \n"
                    + "WHERE `kode_supplier`=\"" + txtKodeSupplier.getText() + "\"";

            databaseModel.proses(queryUpdate, "dtsplr", "rubah");
            reload();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        if (confirm("Yakin ingin menghapus \"" + txtKodeSupplier.getText() + "\"?") == JOptionPane.YES_OPTION) {

            String queryDelete = "DELETE FROM `dtsplr`"
                    + "WHERE `kode_supplier`=\"" + txtKodeSupplier.getText() + "\"";

            databaseModel.proses(queryDelete, "dtsplr", "hapus");
            reload();
        }

    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        
    }//GEN-LAST:event_tabelBarangMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private com.toedter.calendar.JDateChooser dateTanggalPengirimanBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtKodeSupplier;
    private javax.swing.JTextField txtNamaSupplier;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    public int confirm(String pesan) {
        return (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }

}
