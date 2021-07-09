
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konfig {
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3309/projectppbo"; //url database
            String user="root"; //user database
            String pass=""; //password database
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig=DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return MySQLConfig;
    }
}