/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

    import java.sql.*;

/**
 *
 * @author Engel
 */
public class Conexion {
 
    private final String url = "jdbc:mysql://localhost:3306/elgranhotel";
    private final String user = "root";
    private final String pass = "";
    private Connection con;
    
    public Connection getConnection (){
     try{
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Conexion exitosa!!!");
        
     }
     catch(SQLException e){
        System.out.println(e);
    }
     
     return con;
    }
    
}