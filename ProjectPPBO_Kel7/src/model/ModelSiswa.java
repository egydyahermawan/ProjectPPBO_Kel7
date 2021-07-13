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
    JTable varTable[] =  new JTable[4];
    DefaultTableModel model1, model2, model3, model4;
    DefaultTableModel[] model = {
        model1, model2, model3, model4
    };
    
    public ModelSiswa(JTable tblTkj1, JTable tblTkj2, JTable tblTkj3, JTable tblRpl){
        this.varTable[0] = tblTkj1;
        this.varTable[1] = tblTkj2;
        this.varTable[2] = tblTkj3;
        this.varTable[3] = tblRpl;
    }
    
    public void tampilSiswa(String[] kelas){
        for (int i = 0; i < model.length; i++) {
            model[i] = new DefaultTableModel();
        }
        try{
            for (int i = 0; i < model.length; i++) {
                model[i].addColumn("NIS");
                model[i].addColumn("NAMA");
                model[i].addColumn("KELAS");
                String sql = "SELECT * FROM siswa WHERE kelas = '"+kelas[i]+"' ORDER BY nama";
                java.sql.Connection conn = (Connection) Konfig.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet rst = stm.executeQuery(sql);
                while(rst.next()){
                model[i].addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
                    });
                }
                varTable[i].setModel(model[i]);  
            }
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
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
