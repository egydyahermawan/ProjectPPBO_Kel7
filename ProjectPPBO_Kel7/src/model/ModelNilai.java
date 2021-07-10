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
public class ModelNilai {
    JTable varTable;
    
    public ModelNilai(JTable varTable){
        this.varTable = varTable;
    }
    public void tampilNilai() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("NIS");
            model.addColumn("Kode");
            model.addColumn("Niilai");
            String sql = "SELECT * FROM nilai";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);

            while (rst.next()) {
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                });
            }
            varTable.setModel(model);
        } catch (Exception e) {
            System.out.println("Error message:" + e);
        }
    }
      public void simpanMapel(String nis, String kode, String nilai){
        try{
            String sql = "INSERT INTO nilai VALUES('"+nis+"',"
                    +"'"+kode+"',"
                    +"'"+nilai+"')";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan data baru berhasil!");
            tampilNilai();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    public void editNilai(String nis, String kode, String nilai){
        try{
            String sql = "UPDATE mapel SET nilai='"+nilai+"',"
                    +"WHERE nis='"+nis+"' and kode_mapel='"+kode+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Update data berhasil");
            tampilNilai();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void hapusNilai(String nis,String kode){
        try{
            String sql = "DELETE FROM nilai WHERE nis='"+nis+"' and kode_mapel='"+kode+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
            tampilNilai();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
