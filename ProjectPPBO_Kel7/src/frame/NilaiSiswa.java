/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.io.InputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import koneksi.Konfig;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LENOVO
 */
public class NilaiSiswa extends javax.swing.JFrame {
    
    public NilaiSiswa() {
        initComponents();
        tampilNamaSiswa();
        tampilSeluruhNilai();
        tfNis.setVisible(false);
        tfKodeMapel.setVisible(false);
        kosongForm();
    }
   
    public void kosongForm(){
        tfNama.setText("");
        cmMapel.setSelectedIndex(0);
        tfNilai.setText("");
        tfNis.setText("");
        tfKodeMapel.setText("");
    }
    
    public void tampilSeluruhNilai(){
        tampilNilaiMtkRpl();
        tampilNilaiBingRpl();
        tampilNilaiBindoRpl();
        tampilNilaiMtkTkj1();
        tampilNilaiBingTkj1();
        tampilNilaiBindoTkj1();
        tampilNilaiMtkTkj2();
        tampilNilaiBingTkj2();
        tampilNilaiBindoTkj2();
        tampilNilaiMtkTkj3();
        tampilNilaiBingTkj3();
        tampilNilaiBindoTkj3();
    }
    
    public void tampilNilaiMtkRpl(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 RPL') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Matematika')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblMtkRpl.setModel(model);
            tblMtkRpl.getColumn("NIS").setWidth(0);
            tblMtkRpl.getColumn("NIS").setMinWidth(0);
            tblMtkRpl.getColumn("NIS").setMaxWidth(0);
            tblMtkRpl.getColumn("NIS").setResizable(false);
            tblMtkRpl.getColumn("KODE").setWidth(0);
            tblMtkRpl.getColumn("KODE").setMinWidth(0);
            tblMtkRpl.getColumn("KODE").setMaxWidth(0);
            tblMtkRpl.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBingRpl(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 RPL') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Inggris')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblBingRpl.setModel(model);
            tblBingRpl.getColumn("NIS").setWidth(0);
            tblBingRpl.getColumn("NIS").setMinWidth(0);
            tblBingRpl.getColumn("NIS").setMaxWidth(0);
            tblBingRpl.getColumn("NIS").setResizable(false);
            tblBingRpl.getColumn("KODE").setWidth(0);
            tblBingRpl.getColumn("KODE").setMinWidth(0);
            tblBingRpl.getColumn("KODE").setMaxWidth(0);
            tblBingRpl.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBindoRpl(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 RPL') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Indonesia')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });     
            }
            tblBindoRpl.setModel(model);
            tblBindoRpl.getColumn("NIS").setWidth(0);
            tblBindoRpl.getColumn("NIS").setMinWidth(0);
            tblBindoRpl.getColumn("NIS").setMaxWidth(0);
            tblBindoRpl.getColumn("NIS").setResizable(false);
            tblBindoRpl.getColumn("KODE").setWidth(0);
            tblBindoRpl.getColumn("KODE").setMinWidth(0);
            tblBindoRpl.getColumn("KODE").setMaxWidth(0);
            tblBindoRpl.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiMtkTkj1(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas LIKE '12 TKJ 1') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Matematika')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblMtkTkj1.setModel(model);
            tblMtkTkj1.getColumn("NIS").setWidth(0);
            tblMtkTkj1.getColumn("NIS").setMinWidth(0);
            tblMtkTkj1.getColumn("NIS").setMaxWidth(0);
            tblMtkTkj1.getColumn("NIS").setResizable(false);
            tblMtkTkj1.getColumn("KODE").setWidth(0);
            tblMtkTkj1.getColumn("KODE").setMinWidth(0);
            tblMtkTkj1.getColumn("KODE").setMaxWidth(0);
            tblMtkTkj1.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBingTkj1(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 TKJ 1') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Inggris')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblBingTkj1.setModel(model);
            tblBingTkj1.getColumn("NIS").setWidth(0);
            tblBingTkj1.getColumn("NIS").setMinWidth(0);
            tblBingTkj1.getColumn("NIS").setMaxWidth(0);
            tblBingTkj1.getColumn("NIS").setResizable(false);
            tblBingTkj1.getColumn("KODE").setWidth(0);
            tblBingTkj1.getColumn("KODE").setMinWidth(0);
            tblBingTkj1.getColumn("KODE").setMaxWidth(0);
            tblBingTkj1.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBindoTkj1(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 TKJ 1') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Indonesia');";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });     
            }
            tblBindoTkj1.setModel(model);
            tblBindoTkj1.getColumn("NIS").setWidth(0);
            tblBindoTkj1.getColumn("NIS").setMinWidth(0);
            tblBindoTkj1.getColumn("NIS").setMaxWidth(0);
            tblBindoTkj1.getColumn("NIS").setResizable(false);
            tblBindoTkj1.getColumn("KODE").setWidth(0);
            tblBindoTkj1.getColumn("KODE").setMinWidth(0);
            tblBindoTkj1.getColumn("KODE").setMaxWidth(0);
            tblBindoTkj1.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiMtkTkj2(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas LIKE '12 TKJ 2') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Matematika')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });     
            }
            tblMtkTkj2.setModel(model);
            tblMtkTkj2.getColumn("NIS").setWidth(0);
            tblMtkTkj2.getColumn("NIS").setMinWidth(0);
            tblMtkTkj2.getColumn("NIS").setMaxWidth(0);
            tblMtkTkj2.getColumn("NIS").setResizable(false);
            tblMtkTkj2.getColumn("KODE").setWidth(0);
            tblMtkTkj2.getColumn("KODE").setMinWidth(0);
            tblMtkTkj2.getColumn("KODE").setMaxWidth(0);
            tblMtkTkj2.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBingTkj2(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 TKJ 2') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Inggris')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblBingTkj2.setModel(model);
            tblBingTkj2.getColumn("NIS").setWidth(0);
            tblBingTkj2.getColumn("NIS").setMinWidth(0);
            tblBingTkj2.getColumn("NIS").setMaxWidth(0);
            tblBingTkj2.getColumn("NIS").setResizable(false);
            tblBingTkj2.getColumn("KODE").setWidth(0);
            tblBingTkj2.getColumn("KODE").setMinWidth(0);
            tblBingTkj2.getColumn("KODE").setMaxWidth(0);
            tblBingTkj2.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBindoTkj2(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 TKJ 2') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Indonesia');";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblBindoTkj2.setModel(model);
            tblBindoTkj2.getColumn("NIS").setWidth(0);
            tblBindoTkj2.getColumn("NIS").setMinWidth(0);
            tblBindoTkj2.getColumn("NIS").setMaxWidth(0);
            tblBindoTkj2.getColumn("NIS").setResizable(false);
            tblBindoTkj2.getColumn("KODE").setWidth(0);
            tblBindoTkj2.getColumn("KODE").setMinWidth(0);
            tblBindoTkj2.getColumn("KODE").setMaxWidth(0);
            tblBindoTkj2.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiMtkTkj3(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas LIKE '12 TKJ 3') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Matematika')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblMtkTkj3.setModel(model);
            tblMtkTkj3.getColumn("NIS").setWidth(0);
            tblMtkTkj3.getColumn("NIS").setMinWidth(0);
            tblMtkTkj3.getColumn("NIS").setMaxWidth(0);
            tblMtkTkj3.getColumn("NIS").setResizable(false);
            tblMtkTkj3.getColumn("KODE").setWidth(0);
            tblMtkTkj3.getColumn("KODE").setMinWidth(0);
            tblMtkTkj3.getColumn("KODE").setMaxWidth(0);
            tblMtkTkj3.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBingTkj3(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 TKJ 3') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Inggris')";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });      
            }
            tblBingTkj3.setModel(model);
            tblBingTkj3.getColumn("NIS").setWidth(0);
            tblBingTkj3.getColumn("NIS").setMinWidth(0);
            tblBingTkj3.getColumn("NIS").setMaxWidth(0);
            tblBingTkj3.getColumn("NIS").setResizable(false);
            tblBingTkj3.getColumn("KODE").setWidth(0);
            tblBingTkj3.getColumn("KODE").setMinWidth(0);
            tblBingTkj3.getColumn("KODE").setMaxWidth(0);
            tblBingTkj3.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNilaiBindoTkj3(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KODE");
        model.addColumn("MAPEL");
        model.addColumn("NILAI");
        try{
            String sql = "SELECT s.nis, s.nama, m.kode_mapel, m.nama_mapel, n.nilai\n" +
                        "FROM siswa s, mapel m, nilai n\n" +
                        "WHERE s.nis = n.nis AND m.kode_mapel = n.kode_mapel AND\n" +
                        "n.nis IN (SELECT nis FROM siswa WHERE kelas = '12 TKJ 3') AND\n" +
                        "n.kode_mapel IN (SELECT kode_mapel FROM mapel WHERE nama_mapel = 'Bahasa Indonesia');";
            
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                model.addRow(new Object[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                });
                  
                  
            }
            tblBindoTkj3.setModel(model);
            tblBindoTkj3.getColumn("NIS").setWidth(0);
            tblBindoTkj3.getColumn("NIS").setMinWidth(0);
            tblBindoTkj3.getColumn("NIS").setMaxWidth(0);
            tblBindoTkj3.getColumn("NIS").setResizable(false);
            tblBindoTkj3.getColumn("KODE").setWidth(0);
            tblBindoTkj3.getColumn("KODE").setMinWidth(0);
            tblBindoTkj3.getColumn("KODE").setMaxWidth(0);
            tblBindoTkj3.getColumn("KODE").setResizable(false);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public void tampilNamaSiswa(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KELAS");
        try{
            String sql = "SELECT nis, nama, kelas FROM siswa ORDER BY kelas";
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
            tblNama.setModel(model);
            tblNama.getColumn("NIS").setMinWidth(0);
            tblNama.getColumn("NIS").setMaxWidth(0);
            tblNama.getColumn("NIS").setWidth(0);
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
    }
    
    public String getKodeMapel(){
        String kode_mapel = "";
        String check = cmMapel.getSelectedItem().toString();
        try{
            String sql = "SELECT kode_mapel, nama_mapel FROM mapel";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rst = stm.executeQuery(sql);
            while(rst.next()){
                if (check.equalsIgnoreCase(rst.getString(2))) {
                    kode_mapel = rst.getString(1);
                }
            }
        }catch(Exception e){
            System.out.println("Error message:" + e);
        }
        return kode_mapel;
    }
    
    public void simpanNilaiSiswa(){
        String tNis = tfNis.getText();
        String kode_mapel = getKodeMapel();;
        int nilai = Integer.parseInt(tfNilai.getText());
        try{
            String sql = "INSERT INTO nilai VALUES('"+tNis+"',"
                    +"'"+kode_mapel+"',"+nilai+")";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data nilai siswa berhasil ditambahkan!");
            tampilSeluruhNilai();
            kosongForm();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }

    public void hapusDataNilai(){
        String tNis = tfNis.getText();
        String kode_mapel = getKodeMapel();
        try{
            String sql = "DELETE FROM nilai WHERE nis = '"+ tNis +"' and kode_mapel = '"+kode_mapel+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data nilai berhasil di hapus");
            tampilSeluruhNilai();
            kosongForm();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:"+e);
        }
    }
    
    public void editDataNilai(){
        String tNis = tfNis.getText();
        String kode_mapel = tfKodeMapel.getText();
        int nilai = Integer.parseInt(tfNilai.getText());
        try{
            String sql = "UPDATE nilai SET nilai = "+nilai+" WHERE nis = '"+ tNis +"' and kode_mapel = '"+kode_mapel+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Nilai berhasil di edit");
            tampilSeluruhNilai();
            kosongForm();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:"+e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfNilai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNama = new javax.swing.JTable();
        cmMapel = new javax.swing.JComboBox<>();
        tfNis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfKodeMapel = new javax.swing.JTextField();
        tabKelas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tabMapelTkj1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMtkTkj1 = new javax.swing.JTable();
        btnCetakMtkTkj1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBingTkj1 = new javax.swing.JTable();
        btnBingTkj1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBindoTkj1 = new javax.swing.JTable();
        btnBindoTkj1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tabMapelTkj2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblMtkTkj2 = new javax.swing.JTable();
        btnMtkTkj2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblBingTkj2 = new javax.swing.JTable();
        btnBingTkj2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblBindoTkj2 = new javax.swing.JTable();
        btnBindoTkj2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tabMapelTkj3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblMtkTkj3 = new javax.swing.JTable();
        btnMtkTkj3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblBingTkj3 = new javax.swing.JTable();
        btnBingTkj3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblBindoTkj3 = new javax.swing.JTable();
        btnBindoTkj3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        tabMapelRpl = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblMtkRpl = new javax.swing.JTable();
        btnMtkRpl = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblBingRpl = new javax.swing.JTable();
        btnBingRpl = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblBindoRpl = new javax.swing.JTable();
        btnBindoRpl = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nilai Siswa");

        jLabel1.setText("Nama Siswa");

        jLabel3.setText("Kode Mata Pelajaran");

        jLabel4.setText("Nilai Siswa");

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoSmk2.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Kelola Data");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("for Admin");

        tblNama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NIS", "Nama"
            }
        ));
        tblNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNamaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNama);

        cmMapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematika", "Bahasa Inggris", "Bahasa Indonesia" }));

        jLabel9.setText("Pilih Siswa");

        tfKodeMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKodeMapelActionPerformed(evt);
            }
        });

        tblMtkTkj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMtkTkj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMtkTkj1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMtkTkj1);

        btnCetakMtkTkj1.setText("Cetak");
        btnCetakMtkTkj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakMtkTkj1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetakMtkTkj1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCetakMtkTkj1)
                .addContainerGap())
        );

        tabMapelTkj1.addTab("MTK", jPanel1);

        tblBingTkj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBingTkj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBingTkj1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblBingTkj1);

        btnBingTkj1.setText("Cetak");
        btnBingTkj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBingTkj1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBingTkj1)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnBingTkj1)
                .addContainerGap())
        );

        tabMapelTkj1.addTab("Bahasa Inggris", jPanel6);

        tblBindoTkj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBindoTkj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBindoTkj1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblBindoTkj1);

        btnBindoTkj1.setText("Cetak");
        btnBindoTkj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBindoTkj1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBindoTkj1)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnBindoTkj1)
                .addContainerGap())
        );

        tabMapelTkj1.addTab("Bahasa Indonesia", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelTkj1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelTkj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tabKelas.addTab("Kelas TKJ 1", jPanel2);

        tblMtkTkj2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMtkTkj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMtkTkj2MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblMtkTkj2);

        btnMtkTkj2.setText("Cetak");
        btnMtkTkj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMtkTkj2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMtkTkj2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnMtkTkj2)
                .addContainerGap())
        );

        tabMapelTkj2.addTab("MTK", jPanel8);

        tblBingTkj2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBingTkj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBingTkj2MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblBingTkj2);

        btnBingTkj2.setText("Catak");
        btnBingTkj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBingTkj2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBingTkj2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnBingTkj2)
                .addContainerGap())
        );

        tabMapelTkj2.addTab("Bahasa Inggris", jPanel9);

        tblBindoTkj2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBindoTkj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBindoTkj2MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblBindoTkj2);

        btnBindoTkj2.setText("Cetak");
        btnBindoTkj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBindoTkj2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBindoTkj2)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnBindoTkj2)
                .addContainerGap())
        );

        tabMapelTkj2.addTab("Bahasa Indonesia", jPanel10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelTkj2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelTkj2)
                .addContainerGap())
        );

        tabKelas.addTab("Kelas TKJ 2", jPanel3);

        tblMtkTkj3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMtkTkj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMtkTkj3MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblMtkTkj3);

        btnMtkTkj3.setText("Cetak");
        btnMtkTkj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMtkTkj3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMtkTkj3)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnMtkTkj3)
                .addContainerGap())
        );

        tabMapelTkj3.addTab("MTK", jPanel11);

        tblBingTkj3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBingTkj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBingTkj3MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblBingTkj3);

        btnBingTkj3.setText("Cetak");
        btnBingTkj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBingTkj3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBingTkj3)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnBingTkj3)
                .addContainerGap())
        );

        tabMapelTkj3.addTab("Bahasa Inggris", jPanel12);

        tblBindoTkj3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBindoTkj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBindoTkj3MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblBindoTkj3);

        btnBindoTkj3.setText("Cetak");
        btnBindoTkj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBindoTkj3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBindoTkj3)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnBindoTkj3))
        );

        tabMapelTkj3.addTab("Bahasa Indonesia", jPanel13);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelTkj3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelTkj3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabKelas.addTab("Kelas TKJ 3", jPanel4);

        tblMtkRpl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMtkRpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMtkRplMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblMtkRpl);

        btnMtkRpl.setText("Cetak");
        btnMtkRpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMtkRplActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMtkRpl)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnMtkRpl)
                .addContainerGap())
        );

        tabMapelRpl.addTab("MTK", jPanel14);

        tblBingRpl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBingRpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBingRplMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblBingRpl);

        btnBingRpl.setText("Cetak");
        btnBingRpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBingRplActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBingRpl)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnBingRpl)
                .addContainerGap())
        );

        tabMapelRpl.addTab("Bahasa Inggris", jPanel15);

        tblBindoRpl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBindoRpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBindoRplMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblBindoRpl);

        btnBindoRpl.setText("Cetak");
        btnBindoRpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBindoRplActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBindoRpl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnBindoRpl)
                .addContainerGap())
        );

        tabMapelRpl.addTab("Bahasa Indonesia", jPanel16);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelRpl)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMapelRpl, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabKelas.addTab("Kelas RPL", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 676, Short.MAX_VALUE)
                        .addComponent(btnKembali)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(cmMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(tfNilai, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(126, 126, 126)))))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(tfNis, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfKodeMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(tabKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(cmMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSimpan)
                                    .addComponent(btnHapus)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfKodeMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal)
                            .addComponent(btnEdit))
                        .addGap(18, 18, 18)
                        .addComponent(btnCetak))
                    .addComponent(tabKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosongForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tblNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNamaMouseClicked
        int row = tblNama.rowAtPoint(evt.getPoint());
        
        String tNis = tblNama.getValueAt(row, 0).toString();
        tfNis.setText(tNis);
        
        String nama = tblNama.getValueAt(row, 1).toString();
        tfNama.setText(nama);
    }//GEN-LAST:event_tblNamaMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        simpanNilaiSiswa();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusDataNilai();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        editDataNilai();
    }//GEN-LAST:event_btnEditActionPerformed

    public void clickedTable(JTable varTable, java.awt.event.MouseEvent evt){
        int row = varTable.rowAtPoint(evt.getPoint());
        
        String nis = varTable.getValueAt(row, 0).toString();
        tfNis.setText(nis);
        String nama = varTable.getValueAt(row, 1).toString();
        tfNama.setText(nama);
        String kode_mapel = varTable.getValueAt(row, 2).toString();
        tfKodeMapel.setText(kode_mapel);
        String mapel = varTable.getValueAt(row, 3).toString();
        cmMapel.setSelectedItem(mapel);
        String nilai = varTable.getValueAt(row, 4).toString();
        tfNilai.setText(nilai);
    }
    
    private void tblMtkRplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMtkRplMouseClicked
        clickedTable(tblMtkRpl, evt);
    }//GEN-LAST:event_tblMtkRplMouseClicked

    private void tblBingRplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBingRplMouseClicked
        clickedTable(tblBingRpl, evt);
    }//GEN-LAST:event_tblBingRplMouseClicked

    private void tblBindoRplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBindoRplMouseClicked
        clickedTable(tblBindoRpl, evt);
    }//GEN-LAST:event_tblBindoRplMouseClicked

    private void tblMtkTkj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMtkTkj3MouseClicked
        clickedTable(tblMtkTkj3, evt);
    }//GEN-LAST:event_tblMtkTkj3MouseClicked

    private void tblBingTkj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBingTkj3MouseClicked
        clickedTable(tblBingTkj3, evt);
    }//GEN-LAST:event_tblBingTkj3MouseClicked

    private void tblBindoTkj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBindoTkj3MouseClicked
        clickedTable(tblBindoTkj3, evt);
    }//GEN-LAST:event_tblBindoTkj3MouseClicked

    private void tblMtkTkj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMtkTkj2MouseClicked
        clickedTable(tblMtkTkj2, evt);
    }//GEN-LAST:event_tblMtkTkj2MouseClicked

    private void tblBingTkj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBingTkj2MouseClicked
        clickedTable(tblBingTkj2, evt);
    }//GEN-LAST:event_tblBingTkj2MouseClicked

    private void tblBindoTkj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBindoTkj2MouseClicked
        clickedTable(tblBindoTkj2, evt);
    }//GEN-LAST:event_tblBindoTkj2MouseClicked

    private void tblMtkTkj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMtkTkj1MouseClicked
        clickedTable(tblMtkTkj1, evt);
    }//GEN-LAST:event_tblMtkTkj1MouseClicked

    private void tblBingTkj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBingTkj1MouseClicked
        clickedTable(tblBingTkj1, evt);
    }//GEN-LAST:event_tblBingTkj1MouseClicked

    private void tblBindoTkj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBindoTkj1MouseClicked
        clickedTable(tblBindoTkj1, evt);
    }//GEN-LAST:event_tblBindoTkj1MouseClicked

    private void tfKodeMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKodeMapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKodeMapelActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new Menu2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    public void cetakLaporan(String url){
        try{
            InputStream is = NilaiSiswa.class.getResourceAsStream(url);
            JasperPrint jsPrint = JasperFillManager.fillReport(is, null, Konfig.configDB());
            JasperViewer.viewReport(jsPrint, false);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal mencetak laporan karena :"
            + e.getMessage(), "Cetak Laporan", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnMtkRplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMtkRplActionPerformed
        cetakLaporan("/report/laporanNilaiMtkRpl.jasper");
    }//GEN-LAST:event_btnMtkRplActionPerformed

    private void btnBingRplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBingRplActionPerformed
        cetakLaporan("/report/laporanNilaiBingRpl.jasper");
    }//GEN-LAST:event_btnBingRplActionPerformed

    private void btnBindoRplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBindoRplActionPerformed
        cetakLaporan("/report/laporanNilaiBindoRpl.jasper");
    }//GEN-LAST:event_btnBindoRplActionPerformed

    private void btnCetakMtkTkj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakMtkTkj1ActionPerformed
        cetakLaporan("/report/laporanNilaiMtkTkj1.jasper");
    }//GEN-LAST:event_btnCetakMtkTkj1ActionPerformed

    private void btnBingTkj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBingTkj1ActionPerformed
        cetakLaporan("/report/laporanNilaiBingTkj1.jasper");
    }//GEN-LAST:event_btnBingTkj1ActionPerformed

    private void btnBindoTkj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBindoTkj1ActionPerformed
        cetakLaporan("/report/laporanNilaiBindoTkj1.jasper");
    }//GEN-LAST:event_btnBindoTkj1ActionPerformed

    private void btnMtkTkj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMtkTkj2ActionPerformed
        cetakLaporan("/report/laporanNilaiMtkTkj2.jasper");
    }//GEN-LAST:event_btnMtkTkj2ActionPerformed

    private void btnBingTkj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBingTkj2ActionPerformed
        cetakLaporan("/report/laporanNilaiBingTkj2.jasper");
    }//GEN-LAST:event_btnBingTkj2ActionPerformed

    private void btnBindoTkj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBindoTkj2ActionPerformed
        cetakLaporan("/report/laporanNilaiBindoTkj2.jasper");
    }//GEN-LAST:event_btnBindoTkj2ActionPerformed

    private void btnMtkTkj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMtkTkj3ActionPerformed
        cetakLaporan("/report/laporanNilaiMtkTkj3.jasper");
    }//GEN-LAST:event_btnMtkTkj3ActionPerformed

    private void btnBingTkj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBingTkj3ActionPerformed
        cetakLaporan("/report/laporanNilaiBingTkj3.jasper");
    }//GEN-LAST:event_btnBingTkj3ActionPerformed

    private void btnBindoTkj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBindoTkj3ActionPerformed
        cetakLaporan("/report/laporanNilaiBindoTkj3.jasper");
    }//GEN-LAST:event_btnBindoTkj3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NilaiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NilaiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NilaiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NilaiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NilaiSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBindoRpl;
    private javax.swing.JButton btnBindoTkj1;
    private javax.swing.JButton btnBindoTkj2;
    private javax.swing.JButton btnBindoTkj3;
    private javax.swing.JButton btnBingRpl;
    private javax.swing.JButton btnBingTkj1;
    private javax.swing.JButton btnBingTkj2;
    private javax.swing.JButton btnBingTkj3;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnCetakMtkTkj1;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnMtkRpl;
    private javax.swing.JButton btnMtkTkj2;
    private javax.swing.JButton btnMtkTkj3;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmMapel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTabbedPane tabKelas;
    private javax.swing.JTabbedPane tabMapelRpl;
    private javax.swing.JTabbedPane tabMapelTkj1;
    private javax.swing.JTabbedPane tabMapelTkj2;
    private javax.swing.JTabbedPane tabMapelTkj3;
    private javax.swing.JTable tblBindoRpl;
    private javax.swing.JTable tblBindoTkj1;
    private javax.swing.JTable tblBindoTkj2;
    private javax.swing.JTable tblBindoTkj3;
    private javax.swing.JTable tblBingRpl;
    private javax.swing.JTable tblBingTkj1;
    private javax.swing.JTable tblBingTkj2;
    private javax.swing.JTable tblBingTkj3;
    private javax.swing.JTable tblMtkRpl;
    private javax.swing.JTable tblMtkTkj1;
    private javax.swing.JTable tblMtkTkj2;
    private javax.swing.JTable tblMtkTkj3;
    private javax.swing.JTable tblNama;
    private javax.swing.JTextField tfKodeMapel;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNilai;
    private javax.swing.JTextField tfNis;
    // End of variables declaration//GEN-END:variables
}
