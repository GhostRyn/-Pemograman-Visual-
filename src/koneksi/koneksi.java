package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    
    private static Connection conn;
    
    public static Connection connect() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver berhasil dimuat");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver tidak ditemukan: " + ex.getMessage());
            return null;
        }
        
        String url = "jdbc:mysql://localhost/penjualan?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Berhasil koneksi ke database!");
        } catch (SQLException ex) {
            System.out.println("Gagal koneksi: " + ex.getMessage());
            return null;
        }
        
        return conn;
    }
}