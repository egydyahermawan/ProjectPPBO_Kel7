/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.Konfig;

/**
 *
 * @author USER
 */
public class ModelSiswa {
    JTable varTable;
    
    public ModelSiswa(JTable varTable){
        this.varTable = varTable;
    }
    
    public void tampilSiswa(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KELAS");
        try{
            String sql = "SELECT * FROM siswa ORDER BY kelas";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
                });
            }
            varTable.setModel(model);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void inputSiswa(String nis, String nama, String kelas){
        try{
            String sql = "INSERT INTO siswa VALUES('"+nis+"',"
                    +"'"+nama+"',"
                    +"'"+kelas+"')";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan data baru berhasil!");
            tampilSiswa();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public void editSiswa(String nis, String nama, String kelas){
        try{
            String sql = "UPDATE siswa SET nama='"+nama+"',"
                    +"kelas='"+kelas+"'"
                    +"WHERE nis='"+nis+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Update data berhasil");
            tampilSiswa();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void hapusSiswa(String nis){
        try{
            String sql = "DELETE FROM siswa WHERE nis='"+nis+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
            tampilSiswa();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
