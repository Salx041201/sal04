package login;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import method.dataForAllMethod;

public class loginModel extends dataForAllMethod{
    
    public boolean isUsernameAndPasswordEquals(String uname, String pass) {
        boolean status = false;
        try{
            
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
              
            query = "SELECT * FROM LOGIN";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                if(uname.equals(rs.getString("username")) && pass.equals(rs.getString("password"))) {
                    status = true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
            
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
        return status;
    }
}
