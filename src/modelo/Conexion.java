
package modelo;

    import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
 
    private final String url = "jdbc:mysql://localhost:3306/elgranhotel";
    private final String user = "root";
    private final String pass = "";
    private Connection con;
    
    public Connection getConexion () {
     try{

         try {
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
             System.out.println("Error driver coneccion");
         }

        
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Conexion exitosa!!!");
        
     }
     catch(SQLException e){
        System.out.println("Error de coneccion");
        JOptionPane.showMessageDialog(null, "Error de coneccion", "Coneccion", JOptionPane.ERROR_MESSAGE);
    }
     
     return con;
    }

    PreparedStatement prepareStatement(String sql, int RETURN_GENERATED_KEYS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}