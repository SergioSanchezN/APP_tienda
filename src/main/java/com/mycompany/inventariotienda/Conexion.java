/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariotienda;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author USUARIO
 */
public class Conexion {
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String bbdd="jdbc:mysql://localhost:3307/tienda";
    private static final String usuario ="root";
    private static final String clave="";
    
    
    public static Connection Conexion(){
        Connection conex = null;
        
        try {
            //Registrar el driver
            Class.forName(driver);
            //Creamos una conexión a la Base de Datos
            conex = DriverManager.getConnection(bbdd, usuario, clave);
            System.out.println("se ha conectado");
        // Si hay errores informamos al usuario. 
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos.\n"
                    + e.getMessage().toString());
        }
    // Devolvemos la conexión.
    return conex;
    }
    /*
    public void ver_factur(){
      try (PreparedStatement stmt = this.prepareStatement("SELECT country FROM country")) {
      ResultSet rs = stmt.executeQuery();

      while (rs.next())
        System.out.println (rs.getString("country"));

    } catch (SQLException sqle) { 
      System.out.println("Error en la ejecución:" 
        + sqle.getErrorCode() + " " + sqle.getMessage());    
    }
    }
    */
    
}
