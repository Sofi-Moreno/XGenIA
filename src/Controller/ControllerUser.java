/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    JTextField nombre,apellido,pass;
    //lista usuarios
    private Map<String,Usuario> usuarios;
    private Usuario usuarioActual;
    //CONSTRUCTORES
    //iniciar sesion
    public ControllerUser(JFrame ventana, JTextField usuario, JTextField contraseña,Map<String,Usuario> usuarios, Usuario usuarioActual) {
        this.ventana = ventana;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.usuarios = usuarios;
        this.usuarioActual = usuarioActual;
    }
    //registrar usuario
    public ControllerUser(JFrame ventana, JTextField nombre, JTextField apellido, JTextField usuario,
            JTextField contraseña,Map<String,Usuario> usuarios, Usuario usuarioActual) {
        this.ventana = ventana;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.usuarios = usuarios;
        this.usuarioActual = usuarioActual;
    }

    public ControllerUser(JFrame ventana, JTextField usuario, JTextField contraseña, JTextField nombre, JTextField apellido,Usuario usuarioActual) {
        this.ventana = ventana;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuarioActual = usuarioActual;
    }
    

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
    
    //LISTA USUARIO
    public void listaUsuarios(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conex.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            while(rs.next()){
                Usuario user = new Usuario(rs.getString("nombre"),rs.getString("apellido"),rs.getString("usuario"),
                               rs.getString("contraseña"),rs.getInt("id"),rs.getBoolean("acceso"));
                usuarios.put(rs.getString("usuario"), user);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión.");
        }
        finally{
            try {
                if(stmt!=null) stmt.close();
                if(rs!=null) rs.close();
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión.");
            }
        }
    }
    //METODOS INICIAR SESION
    //iniciar sesion
    public boolean iniciarSesion(){
        boolean bol = true;
        usuarioActual = usuarios.get(usuario.getText());
        if(usuarioActual==null){
            bol=false;
            JOptionPane.showMessageDialog(null, "El usuario que desea ingresar no existe en nuestro sistema, ingreselo nuevamente.");
        }else if(usuarioActual.getContraseña() == null ? contraseña.getText() != null : !usuarioActual.getContraseña().equals(contraseña.getText())){
            bol=false;
            JOptionPane.showMessageDialog(null, "El pin ingresada no coincide con el usuario, ingresela nuevamente.");
        }
        return bol;
    }
    //METODOS PARA CREAR USUARIO
    //validar expresion regular
    public boolean patronLetras(String cadena, String patron){
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.matches();
    }
    //registrar usuario
    public boolean registrarUsuario(){
        boolean bol = true;
        if(!patronLetras(nombre.getText(),"^[a-zA-Z]{1,15}$")){
            JOptionPane.showMessageDialog(null, "El nombre ingresado no cumple con solo poseer letras o contener de 1-15 caracteres.");
            bol = false;
        }else {
            usuarioActual.setNombre(nombre.getText());
            if(!patronLetras(apellido.getText(),"^[a-zA-Z]{1,15}$")){
                JOptionPane.showMessageDialog(null, "El apellido ingresado no cumple con solo poseer letras o contener de 1-15 caracteres.");
                bol = false;
            }else{
                usuarioActual.setApellido(apellido.getText());
                Usuario us = usuarios.get(usuario.getText());
                if(us!=null){
                    JOptionPane.showMessageDialog(null, "El usuario ingresado ya existe, ingrese uno diferente.");
                    bol = false;
                }else if(!patronLetras(usuario.getText(),"^[^\\s]{1,10}$")){
                    JOptionPane.showMessageDialog(null, "El usuario ingresado no contiene de 1-10 caracteres, ingrese uno diferente.");
                    bol = false;
                }else{
                    usuarioActual.setUsuario(usuario.getText());
                    for(Map.Entry<String,Usuario> entrada:usuarios.entrySet()){
                        if(entrada.getValue().getContraseña() == null ? contraseña.getText() == null : entrada.getValue().getContraseña().equals(contraseña.getText())){
                            JOptionPane.showMessageDialog(null, "El pin ingresada ya existe, ingrese una diferente.");
                            return false;
                        }
                    }
                    if(!patronLetras(contraseña.getText(),"^\\d{4}$")){
                        JOptionPane.showMessageDialog(null, "El pin no cumple con poseer 4 caracteres y soo ser numeros, ingrese uno diferente.");
                        bol = false;
                    }else{
                        usuarioActual.setContraseña(contraseña.getText());
                    }
                }
            }
        }
        return bol;
    }
    //guardar en db
    public void guardarRegistroDB(int acces){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement stmt = null;
        try {
            stmt = conex.prepareStatement("INSERT INTO usuario (usuario, contraseña, nombre, apellido,acceso) VALUES (?,?,?,?,?)");
            stmt.setString(1,usuarioActual.getUsuario());
            stmt.setString(2,usuarioActual.getContraseña());
            stmt.setString(3,usuarioActual.getNombre());
            stmt.setString(4,usuarioActual.getApellido());
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
    }
    //validar modificacion
    public boolean validarModificacion(){
        boolean bol=true;
        if(!patronLetras(nombre.getText(),"^[a-zA-Z]{1,15}$")){
            JOptionPane.showMessageDialog(null, "El nombre ingresado no cumple con solo poseer letras o contener de 1-15 caracteres.");
            bol = false;
        }else {
            usuarioActual.setNombre(nombre.getText());
            if(!patronLetras(apellido.getText(),"^[a-zA-Z]{1,15}$")){
                JOptionPane.showMessageDialog(null, "El apellido ingresado no cumple con solo poseer letras o contener de 1-15 caracteres.");
                bol = false;
            }else{
                usuarioActual.setApellido(apellido.getText());
                Usuario us = usuarios.get(usuario.getText());
                if(us!=null & us.getIdUsuario()!=usuarioActual.getIdUsuario()){
                    JOptionPane.showMessageDialog(null, "El usuario ingresado ya existe, ingrese uno diferente.");
                    bol = false;
                }else if(!patronLetras(usuario.getText(),"^[^\\s]{1,10}$")){
                    JOptionPane.showMessageDialog(null, "El usuario ingresado no contiene de 1-10 caracteres, ingrese uno diferente.");
                    bol = false;
                }else{
                    usuarioActual.setUsuario(usuario.getText());
                    for(Map.Entry<String,Usuario> entrada:usuarios.entrySet()){
                        if(entrada.getValue().getContraseña() == null ? contraseña.getText() == null : entrada.getValue().getContraseña().equals(contraseña.getText()) 
                                & entrada.getValue().getIdUsuario()!=usuarioActual.getIdUsuario()){
                            JOptionPane.showMessageDialog(null, "El pin ingresada ya existe, ingrese una diferente.");
                            return false;
                        }
                    }
                    if(!patronLetras(contraseña.getText(),"^\\d{4}$")){
                        JOptionPane.showMessageDialog(null, "El pin no cumple con poseer 4 caracteres y solo ser numeros, ingrese uno diferente.");
                        bol = false;
                    }else{
                        usuarioActual.setContraseña(contraseña.getText());
                        bol = true;
                    }
                }
            }
        }
        return bol;
    }
    //guardar modificacion
    public void guardarModificacion(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement st = null;
        String sql = "UPDATE usuario SET usuario=?,contraseña=?,nombre=?,apellido=? WHERE id = ?";
        try{
            st = conex.prepareStatement(sql);
            st.setString(1,usuarioActual.getUsuario());
            st.setString(2,usuarioActual.getContraseña());
            st.setString(3,usuarioActual.getNombre());
            st.setString(4,usuarioActual.getApellido());
            st.setInt(5, usuarioActual.getIdUsuario());
            int rowsInserted = st.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conexión.");
        }
        finally{
            try {
                if(st!=null) st.close();
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión.");
            }
        }
    }
    //eliminar usuario
    public void eliminarUsuario(){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = conex.prepareStatement("DELETE FROM usuario WHERE id=?");
            stmt.setInt(1, usuarioActual.getIdUsuario());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión.");
        }
        finally{
            try {
                if(stmt!=null) stmt.close();
                if(rs!=null) rs.close();
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión.");
            }
        }
    }
    //
}
