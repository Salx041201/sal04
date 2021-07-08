package method;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class databaseModel extends dataForAllMethod {
    
    protected void notifTabel(boolean hasil, String namaTabel, String operasi) {
        if(!hasil) {
            JOptionPane.showMessageDialog(  null, 
                                            namaTabel +" Berhasil Di"+ operasi +"kan", 
                                            "Success!", 
                                            JOptionPane.INFORMATION_MESSAGE, 
                                            null
            );
        } else {
            JOptionPane.showMessageDialog(  null, 
                                            namaTabel +" Gagal Di"+ operasi +"kan", 
                                            "Failure!", 
                                            JOptionPane.ERROR_MESSAGE, 
                                            null
            );
        }
    }
    
    public void proses(String query, String namaTabel, String operasi) {
        try{
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);
            preparedStmt = conn.prepareStatement(query);
            
            notifTabel(preparedStmt.execute(), namaTabel, operasi);
            
            preparedStmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }

}
