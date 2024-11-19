/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Medicamento;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author Sofia Moreno
 */
public class ControllerMedicines {
    //ATRIBUTOS
    //crear medicamentos
    JTextField codigoTxt,nombreTxt,loteTxt,costoInicialTxt,unidExistentesTxt,unidVendidasTxt;
    JComboBox mesBox,añoBox,vigenciaBox;

    //CONSTRUCTORES
    //crear medicamentos general
    public ControllerMedicines(JTextField codigoTxt, JTextField nombreTxt, JTextField loteTxt, JTextField costoInicialTxt, JTextField unidExistentesTxt, JTextField unidVendidasTxt, JComboBox mesBox, JComboBox añoBox, JComboBox vigenciaBox) {
        this.codigoTxt = codigoTxt;
        this.nombreTxt = nombreTxt;
        this.loteTxt = loteTxt;
        this.costoInicialTxt = costoInicialTxt;
        this.unidExistentesTxt = unidExistentesTxt;
        this.unidVendidasTxt = unidVendidasTxt;
        this.mesBox = mesBox;
        this.añoBox = añoBox;
        this.vigenciaBox = vigenciaBox;
    }

    public boolean validarExpresionesRegulares(String patron, String cadena){
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    
    //CREAR MEDICAMENTOS
    //validar codigo
    public int validarCodigo(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            if(!validarExpresionesRegulares("^([A-Z]{3})(\\-)([0-9]{5})$",codigoTxt.getText())){
                return 1;
            }
            stmt = conex.prepareStatement("SELECT codigo_med FROM medicamento_no_refrigerado");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("codigo_med").equals(codigoTxt.getText())){
                    return 2;
                }
            }
            stmt = conex.prepareStatement("SELECT codigo_med FROM medicamento_refrigerado");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("codigo_med").equals(codigoTxt.getText())){
                    return 3;
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
        return 0;
    }
    //validar lote
     public int validarLote(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            if(!validarExpresionesRegulares("^([A-Z]{2})([0-9]{3})$",loteTxt.getText())){
                return 1;
            }
            stmt = conex.prepareStatement("SELECT lote_med FROM medicamento_no_refrigerado");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("lote_med").equals(loteTxt.getText())){
                    return 2;
                }
            }
            stmt = conex.prepareStatement("SELECT lote_med FROM medicamento_refrigerado");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("lote_med").equals(loteTxt.getText())){
                    return 3;
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
        return 0;
    }
    //validar costo inicial
    public boolean validarCosto(Medicamento med){
        boolean bol = false;
        try{
            double costo = Double.parseDouble(costoInicialTxt.getText());
            med.setCostoMedicamento(costo);
        }catch(InputMismatchException exception1){
            bol = true;
        }
        return bol;
    }
    //validar unidades existentes
    public boolean validarUnidadesExistentes(){
        boolean bol = false;
        try{
            int existentes = Integer.parseInt(unidExistentesTxt.getText());
        }catch(InputMismatchException exception1){
            bol = true;
        }
        return bol;
    }
    //validar unidades vendidas
    public int validarUnidadesVendidas(){
        try{
            int vendidos = Integer.parseInt(unidVendidasTxt.getText());
        }catch(InputMismatchException exception1){
            return 1;
        }
        if(Integer.parseInt(unidVendidasTxt.getText())>Integer.parseInt(unidExistentesTxt.getText())){
            return 2;
        }
        return 0;
    }
    //validar fecha
    public int validarFecha(){
        
        return 0;
    }
    //validar vigencia
    public boolean validarVigencia(){
        boolean bol = false;
        
        return bol;
    }
}
