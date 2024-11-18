/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
public class ConnectionDB {
    //datos de la conexion a la base de datos
    private static Connection connection;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://uwlxk33qyqkb9lex:yXQogSy5cQxR2T5lSMsj@bombw01hykhgrsrixnrd-mysql.services.clever-cloud.com:3306/bombw01hykhgrsrixnrd";
    private static final String user= "uwlxk33qyqkb9lex";
    private static final String pass= "yXQogSy5cQxR2T5lSMsj";
    
    
    public ConnectionDB(){
        connection = null;
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            if(connection!=null){
                //System.out.println("Conexion exitosa...");
            }
        }catch(ClassNotFoundException | SQLException e){
            //System.out.println("No se pudo conectar "+e);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection = null;
        if(connection==null){
            //System.out.println("Conexion cerrada...");
        }
    }
    
}
