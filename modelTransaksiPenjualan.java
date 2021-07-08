package panel.transkasiPenjualan;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import method.dataForAllMethod;

public class modelTransaksiPenjualan
        extends dataForAllMethod {

    DefaultTableModel tabelModel = new DefaultTableModel();

    public void initTable(JTable tabel) {
        tabelModel.addColumn("Nota");
        tabelModel.addColumn("Kode");
        tabelModel.addColumn("Barang");
        tabelModel.addColumn("Jenis");
        tabelModel.addColumn("Harga");
        tabelModel.addColumn("Jumlah");
        tabelModel.addColumn("Potongan");
        tabelModel.addColumn("Total");
    }

    public void addTableValue(JTable tabel, dataPenjualan dataPenjualan) {
        tabelModel.addRow(new Object[]{
            dataPenjualan.getNota(),
            dataPenjualan.getKode(),
            dataPenjualan.getNamaBarang(),
            dataPenjualan.getJenisBarang(),
            dataPenjualan.getHarga(),
            dataPenjualan.getJumlahBeli(),
            dataPenjualan.getPotongan(),
            dataPenjualan.getTotal()
        });
        tabel.setModel(tabelModel);
    }
    
    public void removeTableValue(JTable tabel) {
        tabelModel.setRowCount(0);
    }

    public dataBarang getDataBarang(String kode) {
        dataBarang d = new dataBarang();
        
        try{
            
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            stmt = conn.createStatement();
            
            query = "SELECT * FROM DTBrg WHERE kode_barang = \""+ kode +"\"";
            rs = stmt.executeQuery(query);
            
            
            while (rs.next()) {
                d.setKode(rs.getString("kode_barang"));
                d.setNamaBarang(rs.getString("nama_barang"));
                d.setJenis(rs.getString("jenis"));
                d.setJumlah(rs.getInt("jumlah"));
                d.setHargabeli(rs.getInt("pembelian"));
                d.setHargaJual(rs.getInt("penjualan"));
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
        
        return d;
    }

    public void proses(String query) {
        try{
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);
            preparedStmt = conn.prepareStatement(query);
            
            preparedStmt.execute();
            
            preparedStmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }
}
