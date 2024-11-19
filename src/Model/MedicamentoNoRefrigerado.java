/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author Sofia Moreno
 */
public class MedicamentoNoRefrigerado extends Medicamento{
    private List<String> noAlmacenar;

    public MedicamentoNoRefrigerado(List<String> noAlmacenar, String codigoMedicamento, String nombreMedicamento, double costoMedicamento, double precioVenta, int unidadesVendidas, int unidadesExistentes, String fechaVencimiento, String numeroLote, String vigenciaMedicamento) {
        super(codigoMedicamento, nombreMedicamento, costoMedicamento, precioVenta, unidadesVendidas, unidadesExistentes, fechaVencimiento, numeroLote, vigenciaMedicamento);
        this.noAlmacenar = noAlmacenar;
    }
    
    public List<String> getNoAlmacenar() {
        return noAlmacenar;
    }

    public void setNoAlmacenar(List<String> noAlmacenar) {
        this.noAlmacenar = noAlmacenar;
    }
    
    
}
