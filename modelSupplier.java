package panel.supplier;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import method.dataForAllMethod;

public class modelSupplier 
        extends dataForAllMethod {
    
    public void setTable(String query, JTable tabel) {
        
        DefaultTableModel tabelModel = new DefaultTableModel();
        tabelModel.addColumn("Tanggal");
        tabelModel.addColumn("Kode Supplier");
        tabelModel.addColumn("Nama Supplier");
        tabelModel.addColumn("Telp.");
        tabelModel.addColumn("ALamat");
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                tabelModel.addRow(new Object[]{
                    rs.getString("tanggal_pengiriman_barang"),
                    rs.getString("kode_supplier"),
                    rs.getString("nama_supplier"),
                    rs.getString("telp"),
                    rs.getString("alamat")
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