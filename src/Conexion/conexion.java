/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author cadefihuilaltda (Delman Suarez)
 */
public class conexion {
    public Connection conex;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/oferta","root","");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No se pudo conectar la BD" + e.getMessage());
        }
        return conex;
    }
}
