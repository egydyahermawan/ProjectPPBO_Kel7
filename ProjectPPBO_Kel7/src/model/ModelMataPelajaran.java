package model;

import java.sql.Connection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import koneksi.Konfig;

public class ModelMataPelajaran {
 JTable varTable;
    
    public ModelMataPelajaran(JTable varTable){
        this.varTable = varTable;
    }
    public void tampilMapel() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Kode");
            model.addColumn("Nama");
            model.addColumn("Jam");
            String sql = "SELECT * FROM mapel";
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
      public void inputSiswa(String kode, String nama, String jam){
        try{
            String sql = "INSERT INTO mapel VALUES('"+kode+"',"
                    +"'"+nama+"',"
                    +"'"+jam+"')";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan data baru berhasil!");
            tampilMapel();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    public void editMapel(String kode, String nama, String jam){
        try{
            String sql = "UPDATE mapel SET nama='"+nama+"',"
                    +"jam='"+jam+"'"
                    +"WHERE kode='"+kode+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Update data berhasil");
            tampilMapel();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void hapusSiswa(String kode){
        try{
            String sql = "DELETE FROM mapel WHERE kode='"+kode+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
            tampilMapel();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
