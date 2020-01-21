
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CamasData {
    
    private Connection con;
    
//Constructor
    
    public CamasData(Conexion conexion){
        con = conexion.getConexion();
    }
    
//Alta
    
    public void agregarCamas(Camas cama){
             
        try{
            String sql = "INSERT INTO camas (CANTIDAD, CAMA, CODIGOHABITACION) VALUES (?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cama.getCantidad());
            ps.setString(2, cama.getCama());
            ps.setInt(3, cama.getCodigoHabitacion());
                        
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                cama.setIdCamas(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id de la cama");
            }
            
            ps.close();

        }
        catch(SQLException ex){
            System.out.println("Error al agregar cama");
        }
    }
    
//Baja
    
    public void borrarCamas(int idCamas){
        try {
            String sql = "DELETE FROM camas WHERE IDCAMAS = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCamas);
            ps.executeUpdate();
            ps.close();
                           
        } catch (SQLException ex) {
            System.out.println("Error al borrar camas");
        }
            
    }

//Baja agrupada por tipo de habitacion
    
    public void borrarCamas(TipoHabitacion th){
        try {
            String sql = "DELETE FROM camas WHERE CODIGOHABITACION = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, th.getCodigoHabitacion());
            ps.executeUpdate();
            ps.close();
                           
        } catch (SQLException ex) {
            System.out.println("Error al borrar camas");
        }
            
    }

//Modificacion
    
    public void modificarCamas(Camas cama){
        try {
            String sql = "UPDATE cama SET CANTIDAD = ?, CAMA = ?, CODIGOHABITACION = ? WHERE IDCAMAS = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cama.getCantidad());
            ps.setString(2, cama.getCama());
            ps.setInt(3, cama.getCodigoHabitacion());
            ps.setInt(4, cama.getIdCamas());
            
            ps.executeUpdate();
            
            ps.close();            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar camas");
        }
           
    }    

//Buscar

    public Camas buscarCama(int idCamas){
        Camas cama = null;
                
        try {
            String sql = "SELECT * FROM camas WHERE IDCAMAS = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCamas);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                cama = new Camas();
                cama.setIdCamas(rs.getInt(1));
                cama.setCantidad(rs.getInt(2));
                cama.setCama(rs.getString(3));
                cama.setCodigoHabitacion(rs.getInt(4));
            }
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar cama");
        }
        
        return cama;
        
    }
    
//Buscar por tipo de habitacion

    public List<Camas> buscarCamas(TipoHabitacion tipoHabitacion){
        List<Camas> camas = new ArrayList<Camas>();
        
        try{
            
        String sql = "SELECT * FROM camas WHERE CODIGOHABITACION = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, tipoHabitacion.getCodigoHabitacion());
        ResultSet rs = ps.executeQuery();
        
        Camas cama;
        
        while (rs.next()){
            cama = new Camas();
            cama.setIdCamas(rs.getInt(1));
            cama.setCantidad(rs.getInt(2));
            cama.setCama(rs.getString(3));
            cama.setCodigoHabitacion(rs.getInt(4)); 
                       
            camas.add(cama);
        }
        ps.close();
              
        }
        catch (SQLException e){
            System.out.println("Error al buscar camas");
        }
        return camas;
    }    
    
//Listar    
    
    public List<Camas> listarCamas(){
        List<Camas> camas = new ArrayList<Camas>();
        
        try{
            
        String sql = "SELECT * FROM camas";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Camas cama;
        
        while (rs.next()){
            cama = new Camas();
            cama.setIdCamas(rs.getInt(1));
            cama.setCantidad(rs.getInt(2));
            cama.setCama(rs.getString(3));
            cama.setCodigoHabitacion(rs.getInt(4)); 
                       
            camas.add(cama);
        }
        ps.close();
              
        }
        catch (SQLException e){
            System.out.println("Error al listar camas");
        }
        return camas;
    }
    
}
