package model;

import java.sql.Connection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import koneksi.Konfig;

public class ModelMataPelajaran {

    public void tampilSiswa(JTable varTable) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Kode Mata Pelajaran");
            model.addColumn("Nama Mata Pelajaran");
            model.addColumn("Jam Mata Pelajaran");
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
}
