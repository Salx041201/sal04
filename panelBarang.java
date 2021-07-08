package panel.dataBarang;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import method.dataForAllPanel;
import method.databaseModel;

public class panelBarang extends dataForAllPanel {

    modelBarang modelBarang = new modelBarang();
    databaseModel databaseModel = new databaseModel();

    public panelBarang() {
        initComponents();

        modelBarang.setTable("SELECT * FROM DTBrg", tabelBarang);
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
        txtKodeBarang = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHargaBeli = new javax.swing.JTextField();
        txtHargaJual = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        comboBoxJenisBarang = new javax.swing.JComboBox<>();
        txtJumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        txtCariNamaBarang = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1370, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Barang");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 1200, 37));

        jLabel3.setText("Nama");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel7.setText("Jumlah");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 80, -1));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 80, -1));

        jLabel5.setText("Kode");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));
        add(txtKodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 200, -1));

        btnUbah.setText("Ubah");
        btnUbah.setEnabled(false);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 80, -1));

        btnHapus.setText("Hapus");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 80, -1));

        jLabel8.setText("Jenis");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jLabel11.setText("Harga Beli");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        jLabel12.setText("Harga Jual");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));
        add(txtHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 200, -1));
        add(txtHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 200, -1));
        add(txtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 200, -1));

        comboBoxJenisBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "Liter", "Buah" }));
        add(comboBoxJenisBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 200, -1));
        add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 200, -1));

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Jenis", "Jumlah", "Harga Beli", "Harga Jual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 1150, 210));

        txtCariNamaBarang.setText("cari nama barang");
        txtCariNamaBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCariNamaBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCariNamaBarangMouseExited(evt);
            }
        });
        txtCariNamaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariNamaBarangKeyPressed(evt);
            }
        });
        add(txtCariNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 230, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, -1, -1));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, -1));

        jLabel2.setText("Cari berdasarkan nama barang");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private static final DateFormat sdf = new SimpleDateFormat("MMM d yyyy");

    private void reload() {
        txtKodeBarang.setEditable(true);
        txtKodeBarang.setEnabled(true);

        txtKodeBarang.setText("");
        txtNamaBarang.setText("");
        
        txtJumlah.setText("");

        txtHargaBeli.setText("");
        txtHargaJual.setText("");

        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);

        btnSimpan.setEnabled(true);

        modelBarang.setTable("SELECT * FROM DTBrg", tabelBarang);
    }

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        reload();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        if (confirm("Yakin ingin menyimpan \"" + txtKodeBarang.getText() + "\"?") == JOptionPane.YES_OPTION) {

            String queryInsert = "INSERT INTO `dtbrg`\n"
                    + "(`kode_barang`, `nama_barang`, `jenis`, `jumlah`, `pembelian`, `penjualan`) VALUES \n"
                    + "(\"" + txtKodeBarang.getText() + "\",\n"
                    + "\"" + txtNamaBarang.getText() + "\", \n"
                    + "\"" + comboBoxJenisBarang.getSelectedItem().toString() + "\", \n"
                    + "" + txtJumlah.getText() + ", \n"
                    + "" + txtHargaBeli.getText() + ", \n"
                    + "" + txtHargaJual.getText() + ")";

            databaseModel.proses(queryInsert, "dtsplr", "tambah");
            reload();

        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed

        if (confirm("Yakin ingin mengubah \"" + txtKodeBarang.getText() + "\"?") == JOptionPane.YES_OPTION) {

            String queryUpdate = "UPDATE `dtbrg` SET \n"
                    + "`nama_barang`=\""+ txtNamaBarang.getText() +"\","
                    + "`jenis`=\""+ comboBoxJenisBarang.getSelectedItem().toString() +"\","
                    + "`jumlah`=\""+ txtJumlah.getText() +"\","
                    + "`pembelian`=\""+ txtHargaBeli.getText() +"\","
                    + "`penjualan`=\""+ txtHargaJual.getText() +"\" \n"
                    + "WHERE `kode_barang`=\""+ txtKodeBarang.getText() +"\"";
            
            databaseModel.proses(queryUpdate, "dtbrg", "rubah");
            reload();

        }

    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        if (confirm("Yakin ingin menghapus \"" + txtKodeBarang.getText() + "\"?") == JOptionPane.YES_OPTION) {
            String queryDelete = "DELETE FROM dtbrg\n"
                    + "WHERE `kode_barang`=\""+ txtKodeBarang.getText() +"\"";
            
            databaseModel.proses(queryDelete, "dtbrg", "hapus");
            reload();
        }

    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        int row = tabelBarang.getSelectedRow();
        if (row != -1) {
            String kodeBarang = tabelBarang.getValueAt(row, 0).toString();
            setFieldForEdit("SELECT * FROM DTBrg WHERE `kode_barang`=\""+ kodeBarang +"\"");

            txtKodeBarang.setEditable(false);
            txtKodeBarang.setEnabled(false);

            btnUbah.setEnabled(true);
            btnHapus.setEnabled(true);

            btnSimpan.setEnabled(false);

        }
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void txtCariNamaBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariNamaBarangKeyPressed
        modelBarang.setTable("SELECT * FROM DTBrg WHERE `nama_barang` LIKE '%" + txtCariNamaBarang.getText() + "%'", tabelBarang);
    }//GEN-LAST:event_txtCariNamaBarangKeyPressed

    private void txtCariNamaBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariNamaBarangMouseEntered
        if (txtCariNamaBarang.getText().equals("cari nama barang")) {
            txtCariNamaBarang.setText("");
        }
    }//GEN-LAST:event_txtCariNamaBarangMouseEntered

    private void txtCariNamaBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariNamaBarangMouseExited
        if (txtCariNamaBarang.getText().equals("") || !txtCariNamaBarang.isFocusOwner()) {
            txtCariNamaBarang.setText("cari nama barang");
        }
    }//GEN-LAST:event_txtCariNamaBarangMouseExited

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        if (confirm("Yakin ingin menyimpan \"" + txtKodeBarang.getText() + "\"?") == JOptionPane.YES_OPTION) {

            String queryInsert = "INSERT INTO `dtbrg`\n"
                    + "(`kode_barang`, `nama_barang`, `jenis`, `jumlah`, `pembelian`, `penjualan`) VALUES \n"
                    + "(\"" + txtKodeBarang.getText() + "\",\n"
                    + "\"" + txtNamaBarang.getText() + "\", \n"
                    + "\"" + comboBoxJenisBarang.getSelectedItem().toString() + "\", \n"
                    + "" + txtJumlah.getText() + ", \n"
                    + "" + txtHargaBeli.getText() + ", \n"
                    + "" + txtHargaJual.getText() + ")";

            databaseModel.proses(queryInsert, "dtsplr", "tambah");
            reload();

        }
    }//GEN-LAST:event_btnTambahActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> comboBoxJenisBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtCariNamaBarang;
    private javax.swing.JTextField txtHargaBeli;
    private javax.swing.JTextField txtHargaJual;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    // End of variables declaration//GEN-END:variables

    public void setFieldForEdit(String query) {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                txtKodeBarang.setText(rs.getString("kode_barang"));
                txtNamaBarang.setText(rs.getString("nama_barang"));
                comboBoxJenisBarang.setSelectedItem("jenis");
                txtJumlah.setText(rs.getString("jumlah"));
                txtHargaBeli.setText(rs.getString("pembelian"));
                txtHargaJual.setText(rs.getString("penjualan"));
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            notifErrorTryCatch(e);
        }
    }

    public int confirm(String pesan) {
        return (JOptionPane.showConfirmDialog(null, pesan, "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }

}
