/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Riarb
 */
public class Empleado extends Usuario{
    private String idTrabajo;

    public Empleado(String idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Empleado(String idTrabajo, String nombre, String apellido, String usuario, String contraseña, boolean acceso) {
        super(nombre, apellido, usuario, contraseña, acceso);
        this.idTrabajo = idTrabajo;
        this.acceso= true;
    }

    public String getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(String idTrabajo) {
        this.idTrabajo = idTrabajo;
    }
    
    
    

   
    
    
    
}
