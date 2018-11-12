package yazlab;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class YazLab {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DOMAIN_NAME = "localhost";
        static final String DB_NAME = "book-crossing";
        static final String DB_URL = "jdbc:mysql://localhost:3306/book-crossing";
        
        static final String USER = "root";
        static final String PASS = "";
        
        
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException, IOException, UnsupportedLookAndFeelException {
     
         Connection cnn = null;
         Statement stm = null;
         PreparedStatement psmt = null;
        
               
         
        Main_Screen ms = new Main_Screen();
        ms.setTitle("YazLab");
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (InstantiationException ex) {
                Logger.getLogger(YazLab.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(YazLab.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(YazLab.class.getName()).log(Level.SEVERE, null, ex);
            }
        ms.setVisible(true);
        
    
        
        
    }
        
    }
    

