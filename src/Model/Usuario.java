/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sofia Moreno
 */
public class Usuario {
    String nombre;
    String apellido;
    String usuario;
    String contraseña;

//    public static void main(String[] args){
//        Usuario us = new Usuario();
//        us.setNombre("Ricardo");
//        us.setApellido("Barrios");
//        us.setUsuario("rabarrios");
//        us.setContraseña("w4r5g");
//        us.imprimirUsuario();
//    }
    
    public Usuario(){
        nombre = "";
        apellido = "";
        usuario = "";
        contraseña="";
        System.out.println("Usuario creado con exito.");
    }

    public Usuario(String nombre, String apellido, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        System.out.println("Usuario creado con exito.");
    }
    
    public void imprimirUsuario(){
        System.out.println(usuario);
        System.out.println(contraseña);
        System.out.println(nombre);
        System.out.println(apellido);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}