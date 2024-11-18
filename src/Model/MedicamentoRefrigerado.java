/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sofia Moreno
 */
public class MedicamentoRefrigerado extends Medicamento{
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private int tiempoAbierto;
    private int tiempoExpuesto;
    private double recargo;
    
    public MedicamentoRefrigerado(){
        super();
        temperaturaMaxima = 0;
        temperaturaMinima = 0;
        tiempoAbierto = 0;
        tiempoExpuesto = 0;
        recargo = 0;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTiempoAbierto() {
        return tiempoAbierto;
    }

    public void setTiempoAbierto(int tiempoAbierto) {
        this.tiempoAbierto = tiempoAbierto;
    }

    public int getTiempoExpuesto() {
        return tiempoExpuesto;
    }

    public void setTiempoExpuesto(int tiempoExpuesto) {
        this.tiempoExpuesto = tiempoExpuesto;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
    
    
}
