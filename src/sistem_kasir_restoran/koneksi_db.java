package sistem_kasir_restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi_db {
    private String url="jdbc:mysql://localhost/db_kasir_restoran";
    private String username_xampp= "root";
    private String password_xampp= "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
    
    public Connection getCon() {
        return con;
    }
}
