/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MedicamentoNoRefrigerado;
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
public class ControllerUnrefrigeratedMedicines {
    //ATRIBUTOS
    private Map<String,MedicamentoNoRefrigerado> noRefrigerados;
    //crear medicamentos
    JTextField codigoTxt,nombreTxt,loteTxt,costoInicialTxt,unidExistentesTxt,unidVendidasTxt;
    JComboBox mesBox,añoBox,vigenciaBox;
    JTable tabla;
    //crear no refrigerados
    JTextField noAlmacenar1,noAlmacenar2,noAlmacenar3;
    private MedicamentoNoRefrigerado medicamento;
    
    //CONSTRUCTORES
    public ControllerUnrefrigeratedMedicines(JTextField noAlmacenar1, JTextField noAlmacenar2, JTextField noAlmacenar3){    
        this.noAlmacenar1 = noAlmacenar1;
        this.noAlmacenar2 = noAlmacenar2;
        this.noAlmacenar3 = noAlmacenar3;
    }
    public ControllerUnrefrigeratedMedicines(Map<String, MedicamentoNoRefrigerado> noRefrigerados) {
        this.noRefrigerados = noRefrigerados;
    }
    public ControllerUnrefrigeratedMedicines(MedicamentoNoRefrigerado medicamento, JTable tabla) {
        this.medicamento = medicamento;
        this.tabla = tabla;
    }
    
    
    
    
    //lista medicamentos
    public void listaMedicamentos(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conex.prepareStatement("SELECT * FROM medicamentos_no_refrigerados");
            rs = stmt.executeQuery();
            while(rs.next()){
                List<String> list = new ArrayList<>();
                list.add(rs.getString("no_almacenar1"));
                list.add(rs.getString("no_almacenar2"));
                list.add(rs.getString("no_almacenar3"));
                MedicamentoNoRefrigerado med = new MedicamentoNoRefrigerado(list,rs.getString("codigo_med"),rs.getString("nombre_med"),
                rs.getDouble("costo_med"), rs.getDouble("venta_med"), rs.getInt("ud_vendidas"),rs.getInt("ud_existentes"),
                rs.getString("vencimiento_med"),rs.getString("lote_med"),rs.getString("vigencia_med"));
                noRefrigerados.put(rs.getNString("nombre_med"), med);
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
    //calculo de costo total
    public double precioAPagar(MedicamentoNoRefrigerado med){
        double costo;
        costo = (med.getCostoMedicamento()*20)/100 + med.getCostoMedicamento();
        return costo;
    }
    //validar lugares
    public boolean validarLugares(int num){
        JTextField text =null;
        boolean bol = false;
        switch(num){
            case 1:
                text = noAlmacenar1;
                break;
            case 2:
                text = noAlmacenar2;
                break;
            case 3:
                text = noAlmacenar3;
                break;
        }
        if(String.valueOf(text.getText()).length()>45 || String.valueOf(text.getText()).length()<1){
            bol = true;
        }
        return bol;
    }
    //guardar en db
    public boolean guardarEnDB(MedicamentoNoRefrigerado med){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        boolean bol = true;
        try {
            stmt = conex.prepareStatement("INSERT INTO medicamentos_no_refrigerados(codigo_med,lote_med,nombre_med,costo_med,venta_med,ud_existentes,"
                    + "ud_vendidas,vigencia_med,vencimiento_med,no_almacenar1,no_almacenar2,no_almacenar3) VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ");
            stmt.setString(1,med.getCodigoMedicamento());
            stmt.setString(2,med.getNumeroLote());
            stmt.setString(3,med.getNombreMedicamento());
            stmt.setDouble(4,med.getCostoMedicamento());
            stmt.setDouble(5,med.getPrecioVenta());
            stmt.setInt(6,med.getUnidadesExistentes());
            stmt.setInt(7,med.getUnidadesVendidas());
            stmt.setString(8,med.getVigenciaMedicamento());
            stmt.setString(9,med.getFechaVencimiento());
            stmt.setString(10,med.getNoAlmacenar().get(0));
            stmt.setString(11,med.getNoAlmacenar().get(1));
            stmt.setString(12,med.getNoAlmacenar().get(2));
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
        return bol;
    }
    //ver medicamento
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
        modelo.addRow(new Object[]{"No Almacenar",medicamento.getNoAlmacenar().get(0)});
        modelo.addRow(new Object[]{"No Almacenar",medicamento.getNoAlmacenar().get(1)});
        modelo.addRow(new Object[]{"No Almacenar",medicamento.getNoAlmacenar().get(2)});
        tabla.setModel(modelo);
    }
}
