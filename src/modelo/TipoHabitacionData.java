
package modelo;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.List;

public class TipoHabitacionData {
    
        private Connection con;
    
//Constructor
    
    public TipoHabitacionData(Conexion conexion){

            con = conexion.getConexion();

    }

//Alta

    public void agregarTipoHabitacion(TipoHabitacion tipoHabitacion){
             
        try{
            String sql = "INSERT INTO tipohabitacion (CANTIDADPERSONAS, CANTIDADCAMAS, TIPOSCAMAS, PRECIO) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tipoHabitacion.getCantidadPersonas());
            ps.setInt(2, tipoHabitacion.getCantidadCamas());
            ps.setString(3, tipoHabitacion.getTiposCamas());
            ps.setDouble(4, tipoHabitacion.getPrecio());
                       
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                tipoHabitacion.setCodigoHabitacion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el codigo de tipo de habitacion");
            }
            
            ps.close();

        }
        catch(SQLException ex){
            System.out.println("Error al agregar tipo de habitacion");
        }
    }    
    
//Baja

    public void borrarTipoHabitacion(int codigoHabitacion){
        try {
            String sql = "DELETE FROM tipohabitacion WHERE CODIGOHABITACION = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoHabitacion);
            ps.executeUpdate();
            ps.close();
                           
        } catch (SQLException ex) {
            System.out.println("Error al borrar tipo de habitacion");
        }
            
    }
    
//Modificacion

    public void modificarTipoHabitacion(TipoHabitacion tipoHabitacion){
        try {
            String sql = "UPDATE tipohabitacion SET CANTIDADPERSONAS = ?, CANTIDADCAMAS = ?, TIPOSCAMAS = ?, PRECIO = ? WHERE CODIGOHABITACION = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tipoHabitacion.getCantidadPersonas());
            ps.setInt(2, tipoHabitacion.getCantidadCamas());
            ps.setString(3, tipoHabitacion.getTiposCamas());
            ps.setDouble(4, tipoHabitacion.getPrecio());
            ps.setInt(5, tipoHabitacion.getCodigoHabitacion());
            
            ps.executeUpdate();
            
            ps.close();            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar tipo de habitacion");
        }
           
    }    
   
//Buscar

    public TipoHabitacion buscarTipoHabitacion(int codigoHabitacion){
        TipoHabitacion tipoHabitacion = null;
        
        try {
            String sql = "SELECT * FROM tipohabitacion WHERE CODIGOHABITACION = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoHabitacion);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setCodigoHabitacion(rs.getInt(1));
                tipoHabitacion.setCantidadPersonas(rs.getInt(2));
                tipoHabitacion.setCantidadCamas(rs.getInt(3));
                tipoHabitacion.setTiposCamas(rs.getString(4));
                tipoHabitacion.setPrecio(rs.getDouble(5));
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar tipo de habitacion");
        }
        
        return tipoHabitacion;
        
    }    
    
//Listar    
    
    public List<TipoHabitacion> listarTipoHabitacion(){
        List<TipoHabitacion> tipoHabitaciones = new ArrayList<>();
        
        try{
            
        String sql = "SELECT * FROM tipohabitacion";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        TipoHabitacion tipoHabitacion;
        
        while (rs.next()){
            tipoHabitacion = new TipoHabitacion();
            tipoHabitacion.setCodigoHabitacion(rs.getInt(1));
            tipoHabitacion.setCantidadPersonas(rs.getInt(2));
            tipoHabitacion.setCantidadCamas(rs.getInt(3));
            tipoHabitacion.setTiposCamas(rs.getString(4));
            tipoHabitacion.setPrecio(rs.getDouble(5));            
            
            tipoHabitaciones.add(tipoHabitacion);
        }
        ps.close();
        
        
        }
        catch (SQLException e){
            System.out.println("Error al listar tipos de habitaciones");
        }
        return tipoHabitaciones;
    }
      
}
