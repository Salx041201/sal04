package panel.dataBarang;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import method.dataForAllMethod;

public class modelBarang 
        extends dataForAllMethod {
    
    public void setTable(String query, JTable tabel) {
        
        DefaultTableModel tabelModel = new DefaultTableModel();
        tabelModel.addColumn("Kode");
        tabelModel.addColumn("Nama");
        tabelModel.addColumn("Jenis");
        tabelModel.addColumn("Jumlah");
        tabelModel.addColumn("Harga Beli");
        tabelModel.addColumn("Harga Jual");
        
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                tabelModel.addRow(new Object[]{
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("jenis"),
                    rs.getString("jumlah"),
                    rs.getString("pembelian"),
                    rs.getString("penjualan")
                });
            } // end while
            tabel.setModel(tabelModel);
            
            rs.close();
            stmt.close();
            conn.close();
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }

}