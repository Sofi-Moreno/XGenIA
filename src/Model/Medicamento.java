/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sofia Moreno
 */
public class Medicamento {
    private String codigoMedicamento;
    private String nombreMedicamento;
    private double costoMedicamento;
    private double precioVenta;
    private int unidadesVendidas;
    private int unidadesExistentes;
    private String fechaVencimiento;
    private String numeroLote;
    private String vigenciaMedicamento;
    
    public Medicamento(){
        codigoMedicamento = "";
        nombreMedicamento = "";
        costoMedicamento = 0.0;
        precioVenta = 0.0;
        unidadesVendidas = 0;
        unidadesExistentes = 0;
        fechaVencimiento = "";
        numeroLote = "";
        vigenciaMedicamento = "";
    }

    public String getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public void setCodigoMedicamento(String codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public double getCostoMedicamento() {
        return costoMedicamento;
    }

    public void setCostoMedicamento(double costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public int getUnidadesExistentes() {
        return unidadesExistentes;
    }

    public void setUnidadesExistentes(int unidadesExistentes) {
        this.unidadesExistentes = unidadesExistentes;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getVigenciaMedicamento() {
        return vigenciaMedicamento;
    }

    public void setVigenciaMedicamento(String vigenciaMedicamento) {
        this.vigenciaMedicamento = vigenciaMedicamento;
    }
 
}
