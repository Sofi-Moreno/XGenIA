/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Sofia Moreno
 */
public class ControllerUser {
    //ATRIBUTOS
    JFrame ventana;
    //atributos para iniciar sesion
    JTextField usuario,contraseña;
    //atributos para crear usuario
    JTextField nombre,apellido,user,pass;
    //CONSTRUCTORES
    //iniciar sesion
    public ControllerUser(JFrame ventana, JTextField usuario, JTextField contraseña) {
        this.ventana = ventana;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    //registrar usuario

    public ControllerUser(JFrame ventana, JTextField nombre, JTextField apellido, JTextField user, JTextField pass) {
        this.ventana = ventana;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.pass = pass;
    }
    
    
    //METODOS INICIAR SESION
    //validar existencia del usuario
    public boolean validarUsuario(Usuario user){
        boolean bol = true;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = conex.prepareStatement("SELECT id,usuario FROM usuario");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(usuario.getText().equals(rs.getString("usuario"))){
                    user.setIdUsuario(rs.getInt("id"));
                    user.setUsuario(usuario.getText());
                    bol = false;
                }
            }
        }catch(SQLException ex){
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
        return bol;
    }
    //validar la contraseña
    public boolean validarcontraseña(Usuario user){
        boolean bol = true;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = conex.prepareStatement("SELECT contraseña FROM usuario WHERE id = ?");
            stmt.setInt(1, user.getIdUsuario());
            rs = stmt.executeQuery();
            if(rs.next() && contraseña.getText().equals(rs.getString("contraseña"))){
                user.setContraseña(contraseña.getText());
                bol = false;
            }
        }catch(SQLException ex){
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
        return bol;
    }
    //iniciar sesion
    public boolean iniciarSesion(Usuario user){
        boolean bol = true;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = conex.prepareStatement("SELECT * FROM usuario WHERE id = ?");
            stmt.setInt(1, user.getIdUsuario());
            rs = stmt.executeQuery();
            if(rs.next()){
                user.setApellido(rs.getString("apellido"));
                user.setNombre(rs.getString("nombre"));
                user.setAcceso(rs.getBoolean("acceso"));
            }
        }catch(SQLException ex){
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
        return bol;
    }
    
    //METODOS PARA CREAR USUARIO
    //validar nombre y apellido
    public int validarNombreApellidoRegistro(Usuario user,String tipoDato){
        int e = 0; //valor sin errores
        String patron= "^[A-Z][a-z]*$"; //Patron para ingresar una sola palabra con mayuscula al inicio.
        JTextField dato = null;
        if(tipoDato.equals("apellido")){
            dato = apellido;
        }else if(tipoDato.equals("nombre")){
            dato = nombre;
        }
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher((dato.getText()));
        if(!matcher.matches() && (dato.getText().length()>25 || dato.getText().length()<1)){
            e = 1;//no cumple el patron y no es del tamaño correcto
        }
        else if (!matcher.matches()){
            e = 2; //no cumple el patron
        }
        else if(dato.getText().length()>25 || dato.getText().length()<1){
            e = 3; //no tiene el tamaño correcto
        }
        else if(e==0 && tipoDato.equals("apellido")){
            user.setApellido(dato.getText()); //aqui asignamos apellido
        }else if(e==0 && tipoDato.equals("nombre")){
            user.setNombre(dato.getText()); //aqui asignamos nombre
        }
        return e;
    }
    //validar Usuario
    public int validarUsuarioRegistro(Usuario us){
        int val =0; //si no hay errores
        boolean bol = false;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!&$._*-]).*$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(user.getText());
        try {
            //aqui definimos si este usuario ya existe
            stmt = conex.prepareStatement("SELECT usuario FROM usuario");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(user.getText().equals(rs.getString("usuario"))){
                    bol = true;
                }
            }
            if(bol==true){
                val = 1; //error si este usuario ya existe
            }
            else if(!matcher.matches() && (user.getText().length()>15 || user.getText().length()<3)){
                val = 2; //si no cumple el patron y no tiene la longitud correcta
            }
            else if(!matcher.matches()){
                val = 3; //si no cumple el patron
            }
            else if(user.getText().length()>15 || user.getText().length()<3){
                val = 4; //error si no tiene el tamaño correcto
            }
            else{
                us.setUsuario(user.getText());
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
    //validar contraseña
    public int validarContraseña(Usuario user) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int val = 0; //valor sin errores
        boolean bol = false; //valor sin error
        String patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!$&¡*\\-_]).+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(pass.getText());
        try {
            stmt = conex.prepareStatement("SELECT contraseña FROM usuario");
            rs = stmt.executeQuery();
            while(rs.next()){
                if(pass.getText().equals(rs.getString("contraseña"))){
                    bol = true;//si ya se encuentra en la base de datos
                }
            }
            if(bol == true){
                val = 1; //si ya esta en la base de datos
            }
            if(!matcher.matches() && (pass.getText().length()>10 || pass.getText().length()<3)){
                val = 2; //si no cumple con ambas condiciones
            }
            else if(!matcher.matches()){
                val = 3; //si no cumple el patron
            }
            else if(pass.getText().length()>10 || pass.getText().length()<3){
                val = 4; //si no cumple la longitud
            }
            else{
                user.setContraseña(pass.getText());
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
    //guardar en db
    public boolean guardarRegistroDB(Usuario user, int acces){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement stmt = null;
        try {
            stmt = conex.prepareStatement("INSERT INTO usuario (usuario, contraseña, nombre, apellido,acceso) VALUES (?,?,?,?,?)");
            stmt.setString(1,user.getUsuario());
            stmt.setString(2,user.getContraseña());
            stmt.setString(3,user.getNombre());
            stmt.setString(4,user.getApellido());
            stmt.setInt(5,acces);
            int rowsInserted = stmt.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
        }catch (SQLException ex) {
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
