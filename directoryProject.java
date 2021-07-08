package method;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class directoryProject extends dataForAllMethod {
    
    private PrintWriter     _pw = null;  
    private final String namaFile = "dataDirectory.txt";
    
    public String getDirectoryProject() {
        BufferedReader br;
        String output = null;
        
        do {
            
            try {
                File file = new File(namaFile);
                if(file.exists()) {

                    br = new BufferedReader(new FileReader(new File(namaFile)));
                    output = br.readLine();
                    br.close();
                    // ref: https://stackoverflow.com/questions/15085032/how-to-add-a-string-after-a-particular-character-in-another-string-in-java
                    if(output == null)
                        setDirectoryProject(System.getProperty("user.dir").replace("\\", "/") +"/src/panel/manageTabungan/");
                } else {
                    file.createNewFile();
                }
                
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } while(output == null);
        
        return output;
    }
    
    public void setDirectoryProject(String directory) {
        String namaMethod = new   Throwable() 
                            .getStackTrace()[0] 
                            .getMethodName();
        
        String namaClass = this.getClass().getSimpleName();
        try {
            _pw = new PrintWriter(namaFile);
            _pw.write(directory);
            
            _pw.close();
        } catch (IOException e) {
            notifErrorTryCatch(e);
        }
    }
}
