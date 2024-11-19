/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Medicamento;
import Model.MedicamentoRefrigerado;
import javax.swing.*;

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
    
    //CONSTRUCTORES
    public ControllerRefrigeratedMedicines(JTextField tiempoAbiertoTxt, JTextField tiempoExpuestoTxt, JComboBox temMaxBox, JComboBox temMinBox) {
        this.tiempoAbiertoTxt = tiempoAbiertoTxt;
        this.tiempoExpuestoTxt = tiempoExpuestoTxt;
        this.temMaxBox = temMaxBox;
        this.temMinBox = temMinBox;
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
    
}
