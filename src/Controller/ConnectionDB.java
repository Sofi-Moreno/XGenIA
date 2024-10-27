/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sofia Moreno
 */
public class ConnectionDB {
    Connection cx;
    String db = "x-genia";
    String url = "jdbc:mysql://localhost:3306/"+db;
    String user = "root";
    String pass = "23082018";
    
    
    public Connection conectarDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx=DriverManager.getConnection(url,user,pass);
            System.out.println("Se conecto la base de datos con exito.");
         } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto la base de datos.");
         }
        return cx;
        
    }
    
    public void desconectarDB(){
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo desconectar de la base de datos.");        }
    }
    
//    public static void main(String[] args){
//        ConnectionDB c=new ConnectionDB();
//        c.conectarDB();
//    }
}
