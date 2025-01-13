/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Medicamento;
import Model.MedicamentoNoRefrigerado;
import Model.MedicamentoRefrigerado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Moreno
 */
public class ControllerRefrigeratedMedicines {
    //ATRIBUTOS
    //crear medicamentos
    JTextField codigoTxt,nombreTxt,loteTxt,costoInicialTxt,unidExistentesTxt,unidVendidasTxt;
    JComboBox mesBox,añoBox,vigenciaBox;
    //crear regrigerado
    JTextField tiempoAbiertoTxt,tiempoExpuestoTxt;
    JComboBox temMaxBox,temMinBox;
    JTable tabla;
    private Map<String,MedicamentoRefrigerado> refrigerados;
    private MedicamentoRefrigerado medicamento;
    
    //CONSTRUCTORES
    public ControllerRefrigeratedMedicines(JTextField tiempoAbiertoTxt, JTextField tiempoExpuestoTxt, JComboBox temMaxBox, JComboBox temMinBox) {
        this.tiempoAbiertoTxt = tiempoAbiertoTxt;
        this.tiempoExpuestoTxt = tiempoExpuestoTxt;
        this.temMaxBox = temMaxBox;
        this.temMinBox = temMinBox;
    }

    public ControllerRefrigeratedMedicines(Map<String, MedicamentoRefrigerado> refrigerados) {
        this.refrigerados = refrigerados;
    }

    public ControllerRefrigeratedMedicines(JTable tabla, MedicamentoRefrigerado medicamento) {
        this.tabla = tabla;
        this.medicamento = medicamento;
    }
    
    
    //lista
    public void listaMedicamentos(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conex.prepareStatement("SELECT * FROM medicamentos_refrigerados");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                MedicamentoRefrigerado med = new MedicamentoRefrigerado(rs.getInt("tem_max_med"), rs.getInt("tem_min_med"),
                rs.getString("tiempo_abierto"),rs.getString("tiempo_Expuesto"),rs.getNString("codigo_med"),rs.getString("nombre_med"),
                rs.getDouble("costo_med"), rs.getDouble("venta_med"), rs.getInt("ud_vendidas"),rs.getInt("ud_existentes"),
                rs.getString("vencimiento_med"),rs.getString("lote_med"),rs.getString("vigencia_med"));
                refrigerados.put(rs.getNString("nombre_med"), med);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión.");
        }
        finally{
            try {
                if(stmt!=null) stmt.close();
                if(rs!=null) rs.close();
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión.");
            }
        }
    }
    
    //CREAR MEDICAMENTOS
    //calculo de costo total refrigerado
    public double precioAPagar(MedicamentoRefrigerado med){
        double costo;
        costo = (med.getCostoMedicamento()*20)/100 + med.getCostoMedicamento();
        costo = costo + (costo*25)/100;
        return costo;
    }
    //cambio refrigerado
    public void cambioObjeto(MedicamentoRefrigerado medi){
        medi.setCodigoMedicamento(codigoTxt.getText());
        medi.setNombreMedicamento(nombreTxt.getText());
        medi.setCostoMedicamento(Double.parseDouble(costoInicialTxt.getText()));
        medi.setPrecioVenta(precioAPagar(medi));
        medi.setUnidadesExistentes(Integer.parseInt(unidExistentesTxt.getText()));
        medi.setUnidadesVendidas(Integer.parseInt(unidVendidasTxt.getText()));
        medi.setFechaVencimiento(String.valueOf(mesBox.getSelectedItem())+"-"+String.valueOf(añoBox.getSelectedItem()));
        medi.setNumeroLote(loteTxt.getText());
        medi.setVigenciaMedicamento((String)vigenciaBox.getSelectedItem());
    }
    
    //llenar tabla
    public void llenarVista(){
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("ITEM"); modelo.addColumn("DATO");
        modelo.addRow(new Object[]{"Codigo",medicamento.getCodigoMedicamento()});
        modelo.addRow(new Object[]{"Lote",medicamento.getNumeroLote()});
        modelo.addRow(new Object[]{"Nombre",medicamento.getNombreMedicamento()});
        modelo.addRow(new Object[]{"Costo",medicamento.getCostoMedicamento()+"$"});
        modelo.addRow(new Object[]{"Precio de Venta",medicamento.getPrecioVenta()+"$"});
        modelo.addRow(new Object[]{"Existentes",medicamento.getUnidadesExistentes()});
        modelo.addRow(new Object[]{"Vendidos",medicamento.getUnidadesVendidas()});
        modelo.addRow(new Object[]{"Vigencia",medicamento.getVigenciaMedicamento()});
        modelo.addRow(new Object[]{"Vencimiento",medicamento.getFechaVencimiento()});
        modelo.addRow(new Object[]{"Temperatura Maxima",medicamento.getTemperaturaMaxima()});
        modelo.addRow(new Object[]{"Temperatura Minima",medicamento.getTemperaturaMinima()});
        modelo.addRow(new Object[]{"Tiempo Maximo Abierto",medicamento.getTiempoAbierto()});
        modelo.addRow(new Object[]{"Tiempo Maximo Expuesto",medicamento.getTiempoExpuesto()});
        tabla.setModel(modelo);
        
    }
    
    public void guardarEnDB(MedicamentoRefrigerado med){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        boolean bol = true;
        try {
            stmt = conex.prepareStatement("INSERT INTO medicamentos_refrigerados(codigo_med, nombre_med, lote_med, costo_med, venta_med, "
                    + "ud_existentes, ud_vendidas, vigencia_med, vencimiento_med, tem_max_med, tem_min_med, tiempo_abierto, "
                    + "tiempo_Expuesto)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            stmt.setString(1,med.getCodigoMedicamento());
            stmt.setString(3,med.getNumeroLote());
            stmt.setString(2,med.getNombreMedicamento());
            stmt.setDouble(4,med.getCostoMedicamento());
            stmt.setDouble(5,med.getPrecioVenta());
            stmt.setInt(6,med.getUnidadesExistentes());
            stmt.setInt(7,med.getUnidadesVendidas());
            stmt.setString(8,med.getVigenciaMedicamento());
            stmt.setString(9,med.getFechaVencimiento());
            stmt.setDouble(10,med.getTemperaturaMaxima());
            stmt.setDouble(11,med.getTemperaturaMinima());
            stmt.setString(12,med.getTiempoAbierto());
            stmt.setString(13,med.getTiempoExpuesto());
            int rowsInserted = stmt.executeUpdate();
            if(rowsInserted>0){
                bol = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerUnrefrigeratedMedicines.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(stmt!=null) stmt.close();
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión.");
            }
        }
    }
}
