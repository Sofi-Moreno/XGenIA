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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Sofia Moreno
 */
public class ControllerUnrefrigeratedMedicines {
    //ATRIBUTOS
    //crear medicamentos
    JTextField codigoTxt,nombreTxt,loteTxt,costoInicialTxt,unidExistentesTxt,unidVendidasTxt;
    JComboBox mesBox,añoBox,vigenciaBox;
    //crear no refrigerados
    JTextField noAlmacenar1,noAlmacenar2,noAlmacenar3;
    
    //CONSTRUCTORES
    public ControllerUnrefrigeratedMedicines(JTextField noAlmacenar1, JTextField noAlmacenar2, JTextField noAlmacenar3){    
        this.noAlmacenar1 = noAlmacenar1;
        this.noAlmacenar2 = noAlmacenar2;
        this.noAlmacenar3 = noAlmacenar3;
    }

    //CREAR MEDICAMENTOS
    //calculo de costo total
    public double precioAPagar(MedicamentoNoRefrigerado med){
        double costo;
        costo = (med.getCostoMedicamento()*20)/100 + med.getCostoMedicamento();
        return costo;
    }
    //cambio a objeto no refrigerado
    public void cambioObjeto(MedicamentoNoRefrigerado medi) {
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
        List<String> noAlmacenar = med.getNoAlmacenar();
        try {
            stmt = conex.prepareStatement("INSERT INTO medicamentos_no_refrigerados(codigo_med,lote_med,nombre_med,costo_med,venta_med,ud_existentes,ud_vendidas,vigencia_med,vencimiento_med,no_almacenar1,no_almacenar2,no_almacenar3) VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ");
            stmt.setString(1,med.getCodigoMedicamento());
            stmt.setString(2,med.getNumeroLote());
            stmt.setString(3,med.getNombreMedicamento());
            stmt.setDouble(4,med.getCostoMedicamento());
            stmt.setDouble(5,med.getPrecioVenta());
            stmt.setInt(6,med.getUnidadesExistentes());
            stmt.setInt(7,med.getUnidadesVendidas());
            stmt.setString(8,med.getVigenciaMedicamento());
            stmt.setString(9,med.getFechaVencimiento());
            stmt.setString(10,noAlmacenar.get(0));
            stmt.setString(11,noAlmacenar.get(1));
            stmt.setString(12,noAlmacenar.get(2));
            int rowsInserted = stmt.executeUpdate();
            if(rowsInserted>0){
                bol = false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión.");
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
}
