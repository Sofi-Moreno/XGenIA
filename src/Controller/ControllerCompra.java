/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Compra;
import Model.MedicamentoNoRefrigerado;
import Model.MedicamentoRefrigerado;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Moreno
 */
public class ControllerCompra {
    JFrame ventana;
    JComboBox medicamento;
    JSpinner cantidad;
    JTable tabla;
    JLabel precio;
    private Map<String,MedicamentoNoRefrigerado> noRefrigerados;
    private Map<String,MedicamentoRefrigerado> refrigerados;
    private Map<String,Compra> listaCompra;

    public ControllerCompra(JFrame ventana, JComboBox medicamento, JSpinner cantidad,JTable tabla, Map<String, MedicamentoNoRefrigerado> noRefrigerados, 
            Map<String, MedicamentoRefrigerado> refrigerados, Map<String, Compra> listaCompra) {
        this.ventana = ventana;
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.tabla = tabla;
        this.noRefrigerados = noRefrigerados;
        this.refrigerados = refrigerados;
        this.listaCompra = listaCompra;
    }

    public ControllerCompra(JFrame ventana,JLabel precio, JTable tabla, Map<String, MedicamentoNoRefrigerado> noRefrigerados, Map<String, MedicamentoRefrigerado> refrigerados, Map<String, Compra> listaCompra) {
        this.ventana = ventana;
        this.precio = precio;
        this.tabla = tabla;
        this.noRefrigerados = noRefrigerados;
        this.refrigerados = refrigerados;
        this.listaCompra = listaCompra;
    }
    
    
    //llenar box
    public JComboBox box(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Selecciona el Medicamento");
        for(String clave:noRefrigerados.keySet()){
            nombres.add(clave);
        }
        for(String clave:refrigerados.keySet()){
            nombres.add(clave);
        }
        System.out.println(nombres);
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(nombres.toArray(new String[0]));
        medicamento.setModel(modelo);
        medicamento.setSelectedIndex(0);
        return medicamento;
    }
    
    //buscar medicamento y asignarlo
    public void buscarMedicamento(){
        MedicamentoNoRefrigerado med1 = noRefrigerados.get(medicamento.getSelectedItem());
        MedicamentoRefrigerado med2 = refrigerados.get(medicamento.getSelectedItem());
        if(med1!=null){
            Compra compra = new Compra(med1.getCodigoMedicamento(),med1.getNombreMedicamento(),med1.getPrecioVenta(),(int)cantidad.getValue());
            listaCompra.put(med1.getNombreMedicamento(), compra);
        }else if(med2!=null){
            Compra compra = new Compra(med2.getCodigoMedicamento(),med2.getNombreMedicamento(),med2.getPrecioVenta(),(int)cantidad.getValue());
            listaCompra.put(med2.getNombreMedicamento(), compra);
        }
    }
    
    //llenar tabla menu
    public void tablaMenu(){
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("NOMBRE"); modelo.addColumn("PRECIO"); modelo.addColumn("CANTIDAD");
        for(MedicamentoRefrigerado med1:refrigerados.values()){
            modelo.addRow(new Object[]{med1.getNombreMedicamento(), med1.getPrecioVenta()+"$", med1.getUnidadesExistentes()});
        }
        for(MedicamentoNoRefrigerado med2:noRefrigerados.values()){
            modelo.addRow(new Object[]{med2.getNombreMedicamento(), med2.getPrecioVenta()+"$", med2.getUnidadesExistentes()});
        }
        tabla.setModel(modelo);
    }
    
    //llenar tabla compra
    public void tablaCompra(){
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("NOMBRE"); modelo.addColumn("PRECIO"); modelo.addColumn("CANTIDAD");
        for(Compra com : listaCompra.values()){
            modelo.addRow(new Object[]{com.getNombreMedicamento(), com.getPrecioVenta()+"$", com.getCantidad()});
        }
        tabla.setModel(modelo);
    }
    
    //calcular precio
    public void calcularPrecio(){
        double suma = 0;
        for(Compra com : listaCompra.values()){
            suma = suma + com.getPrecioVenta()*com.getCantidad();
        }
        precio.setText(String.valueOf(suma)+"$");
    }
    
    
}
