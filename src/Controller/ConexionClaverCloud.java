/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;

public class ConexionClaverCloud {
    public static void main(String[] args) {
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Crear la conexión
            String url = "jdbc:mysql://uuq8ibvppiscjmq9:1JmUFsE2SGaXVSOxOCSF@bawo7zlm1ztu7a3lplyi-mysql.services.clever-cloud.com:3306/bawo7zlm1ztu7a3lplyi";
            String user = "uuq8ibvppiscjmq9";
            String password = "1JmUFsE2SGaXVSOxOCSF";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Crear un statement para ejecutar consultas
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM empleados";
            ResultSet rs = stmt.executeQuery(sql);

            // Procesar los resultados
            while (rs.next()) {
                int id = rs.getInt("id_empleados");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String usuario = rs.getString("usuario");
                String clave = rs.getString("contraseña");
                System.out.println("Id: " + id + ", Apellido: " + apellido+ ", Nombre: " + nombre+ ", Usuario: " + usuario+ ", Contrasena: " + clave);
            }

            // Cerrar la conexión
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}