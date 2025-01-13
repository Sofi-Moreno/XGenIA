/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Medicamento;
import Model.MedicamentoNoRefrigerado;
import Model.MedicamentoRefrigerado;
import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Moreno
 */
public class ControllerMedicines {
    //ATRIBUTOS
    //crear medicamentos
    JTextField codigoTxt,nombreTxt,loteTxt,costoInicialTxt,unidExistentesTxt,unidVendidasTxt;
    JComboBox mesBox,añoBox,vigenciaBox;
    JTable tabla; JComboBox medicamento;
    private Map<String,MedicamentoNoRefrigerado> noRefrigerados;
    private Map<String,MedicamentoRefrigerado> refrigerados;
    //CONSTRUCTORES
    //crear medicamentos general
    public ControllerMedicines(JTextField codigoTxt, JTextField nombreTxt, JTextField loteTxt, JTextField costoInicialTxt, 
            JTextField unidExistentesTxt, JTextField unidVendidasTxt, JComboBox mesBox, JComboBox añoBox, JComboBox vigenciaBox,
            Map<String, MedicamentoNoRefrigerado> noRefrigerados, Map<String, MedicamentoRefrigerado> refrigerados) {
        this.codigoTxt = codigoTxt;
        this.nombreTxt = nombreTxt;
        this.loteTxt = loteTxt;
        this.costoInicialTxt = costoInicialTxt;
        this.unidExistentesTxt = unidExistentesTxt;
        this.unidVendidasTxt = unidVendidasTxt;
        this.mesBox = mesBox;
        this.añoBox = añoBox;
        this.vigenciaBox = vigenciaBox;
        this.noRefrigerados = noRefrigerados;
        this.refrigerados = refrigerados;
    }

    public ControllerMedicines(JTable tabla, JComboBox medicamento, Map<String, MedicamentoNoRefrigerado> noRefrigerados, Map<String, MedicamentoRefrigerado> refrigerados) {
        this.tabla = tabla;
        this.medicamento = medicamento;
        this.noRefrigerados = noRefrigerados;
        this.refrigerados = refrigerados;
    }

    //expresiones regulares
    public boolean validarExpresionesRegulares(String patron, String cadena){
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    //CREAR MEDICAMENTOS
    //validar codigo
    public int validarCodigo(){
        int val = 0;
        if(!validarExpresionesRegulares("^([A-Z]{3})(\\-)([0-9]{5})$",codigoTxt.getText())){
            val = 1;
        }
        for(MedicamentoNoRefrigerado med : noRefrigerados.values()){
            if(med.getCodigoMedicamento().equals(codigoTxt.getText())){
                val = 2;
            }
        }
        for(MedicamentoRefrigerado med : refrigerados.values()){
            if(med.getCodigoMedicamento().equals(codigoTxt.getText())){
                val = 2;
            }
        }
        return val;
    }
    //validar nombre
    public int validarNombre(){
        if(nombreTxt.getText().length()<1 || nombreTxt.getText().length()>45) return 1;
        return 0;
    }
    //validar lote
     public int validarLote(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int val = 0;
        try {
            if(!validarExpresionesRegulares("^([A-Z]{2})([0-9]{3})$",loteTxt.getText())){
                val = 1;
            }
            stmt = conex.prepareStatement("SELECT lote_med FROM medicamentos_no_refrigerados");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("lote_med").equals(loteTxt.getText())){
                    val = 2;
                }
            }
            stmt = conex.prepareStatement("SELECT lote_med FROM medicamentos_refrigerados");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("lote_med").equals(loteTxt.getText())){
                    val = 2;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión.");
        }finally{
            try {
                if(stmt!=null) stmt.close();
                if(rs!=null) rs.close();
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión.");
            }
        }
        return val;
    }
    //validar costo inicial
    public int validarCosto(){
        try{
            double costo = Double.parseDouble(costoInicialTxt.getText());
        }catch(NumberFormatException exception1){
            return 1;
        }
        return 0;
    }
    //validar unidades existentes
    public int validarUnidadesExistentes(){
        try{
            int existentes = Integer.parseInt(unidExistentesTxt.getText());
        }catch(NumberFormatException  exception1){
            return 1;
        }
        return 0;
    }
    //validar unidades vendidas
    public int validarUnidadesVendidas(){
        try{
            int vendidos = Integer.parseInt(unidVendidasTxt.getText());
        }catch(NumberFormatException  exception1){
            return 1;
        }
        if(Integer.parseInt(unidVendidasTxt.getText())>Integer.parseInt(unidExistentesTxt.getText())){
            return 2;
        }
        return 0;
    }
    //validar fecha
    public int validarFecha(){
        if(mesBox.getSelectedItem()=="---"){
            return 1;
        }else if(añoBox.getSelectedItem()=="---"){
            return 2;
        }
        return 0;
    }
    //validar vigencia
    public int validarVigencia(){
        if(vigenciaBox.getSelectedItem()=="---") return 1;
        return 0;
    }
    
    //eliminar medicamento
    public void sentenciaEliminar(String consulta,String codigo){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = conex.prepareStatement("DELETE FROM "+consulta+" WHERE codigo_med=?");
            stmt.setString(1,codigo);
            stmt.executeUpdate();
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
    public void eliminarMedicamento(){
        MedicamentoNoRefrigerado med1 = noRefrigerados.get(medicamento.getSelectedItem());
        MedicamentoRefrigerado med2 = refrigerados.get(medicamento.getSelectedItem());
        if(med1!=null){
            noRefrigerados.remove(med1.getNombreMedicamento());
            sentenciaEliminar("medicamentos_no_refrigerados",med1.getCodigoMedicamento());
        }else if(med2!=null){
            refrigerados.remove(med2.getNombreMedicamento());
            sentenciaEliminar("medicamentos_refrigerados",med2.getCodigoMedicamento());
        }
    }
    //llenar tabla
    public void llenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("CODIGO"); modelo.addColumn("NOMBRE");
        for(MedicamentoRefrigerado med1:refrigerados.values()){
            modelo.addRow(new Object[]{med1.getCodigoMedicamento(),med1.getNombreMedicamento()});
        }
        for(MedicamentoNoRefrigerado med2:noRefrigerados.values()){
            modelo.addRow(new Object[]{med2.getCodigoMedicamento(),med2.getNombreMedicamento()});
        }
        tabla.setModel(modelo);
    }
    //box
    public JComboBox box(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Selecciona el Medicamento");
        for(String clave:noRefrigerados.keySet()){
            nombres.add(clave);
        }
        for(String clave:refrigerados.keySet()){
            nombres.add(clave);
        }
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombres.toArray(new String[0]));
        medicamento.setModel(modelo);
        medicamento.setSelectedIndex(0);
        return medicamento;
    }
}
