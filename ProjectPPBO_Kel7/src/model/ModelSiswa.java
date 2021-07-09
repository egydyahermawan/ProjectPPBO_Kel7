/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import koneksi.Konfig;

/**
 *
 * @author USER
 */
public class ModelSiswa {
    public void tampilSiswa(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("NIS");
            model.addColumn("NAMA");
            model.addColumn("KELAS");
            String sql = "SELECT * FROM siswa";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
}
