/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.InputMismatchException;


/**
 *
 * @author Sofia Moreno
 */
public class ConnectionDB {
    Connection cx;
    private String db = "x-genia";
    private String url = "jdbc:mysql://localhost:3306/"+db;
    private String user = "root";
    private String pass = "23082018";
    
    
    public ConnectionDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx=DriverManager.getConnection(url,user,pass);
            System.out.println("Se conecto la base de datos con exito.");
         } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto la base de datos.");
         }
    }
    public void desconectarDB(){
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo desconectar de la base de datos.");        
        }
    }
    public static void main(String[] args){
        ConnectionDB c=new ConnectionDB();
    }
}
