
package modelo;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.List;

public class HabitacionData {
    
  private Connection con;
  private Conexion conexion;
    
//Constructor
    
    public HabitacionData(Conexion conexion){

        con = conexion.getConexion();
        this.conexion = conexion;      
    }
    
//Alta 
    
    public void agregarHabitacion(Habitacion habitacion){
             
        try{
            String sql = "INSERT INTO habitacion (NUMEROHABITACION, PISO, CODIGOHABITACION, ESTADOHABITACION) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getNumeroHabitacion());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getTipoHabitacion().getCodigoHabitacion());
            ps.setInt(4, habitacion.getEstadoHabitacion());

            
            ps.executeUpdate();
            ps.close();

        }
        catch(SQLException ex){
            System.out.println("Error al agregar habitacion");
        }
    }
    
//Baja    
    
    public void borrarHabitacion(int numeroHabitacion){
        try {
            String sql = "DELETE FROM habitacion WHERE NUMEROHABITACION = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroHabitacion);
            ps.executeUpdate();
            ps.close();
                           
        } catch (SQLException ex) {
            System.out.println("Error al borrar habitacion");
        }
            
    }    

//Modificacion
    
    public void modificarHabitacion(Habitacion habitacion){
        try {
            String sql = "UPDATE habitacion SET PISO = ?, CODIGOHABITACION = ?, ESTADOHABITACION = ? WHERE NUMEROHABITACION = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getPiso());
            ps.setInt(2, habitacion.getTipoHabitacion().getCodigoHabitacion());
            ps.setInt(3, habitacion.getEstadoHabitacion());
            ps.setInt(4, habitacion.getNumeroHabitacion());
            ps.executeUpdate();
            
            ps.close();            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar habitacion");
        }
           
    }    

//Buscar

public Habitacion buscarHabitacion(int numeroHabitacion){
        Habitacion habitacion = null;
        
        try {
            String sql = "SELECT * FROM habitacion WHERE NUMEROHABITACION = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroHabitacion);
            ResultSet rs = ps.executeQuery();

            TipoHabitacionData thd = new TipoHabitacionData(conexion);
                
            while (rs.next()){
                habitacion = new Habitacion();
                habitacion.setNumeroHabitacion(rs.getInt(1));
                habitacion.setPiso(rs.getInt(2));
                habitacion.setEstadoHabitacion(rs.getInt(3));

                habitacion.setTipoHabitacion(thd.buscarTipoHabitacion(rs.getInt(4)));
            }
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar habitacion");
        }
        
        return habitacion;
        
    }    

//Listar

public List<Habitacion> listarHabitacion(){
        List<Habitacion> habitaciones = new ArrayList<Habitacion>();
        
        try{
            
        String sql = "SELECT * FROM habitacion";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Habitacion habitacion;
        TipoHabitacionData thd = new TipoHabitacionData(conexion);
            
        while (rs.next()){
            habitacion = new Habitacion();
            habitacion.setNumeroHabitacion(rs.getInt(1));
            habitacion.setPiso(rs.getInt(2));
            habitacion.setEstadoHabitacion(rs.getInt(3));

            habitacion.setTipoHabitacion(thd.buscarTipoHabitacion(rs.getInt(4)));
           
            habitaciones.add(habitacion);
        }
        ps.close();
        
        
        }
        catch (SQLException e){
            System.out.println("Error al listar habitaciones");
        }
        return habitaciones;
    }

//Buscar por tipo de habitacion

public List<Habitacion> buscarPorTH(TipoHabitacion tipoHabitacion){
        List<Habitacion> habitaciones = new ArrayList<Habitacion>();
        
        try{
            
        String sql = "SELECT * FROM habitacion WHERE CODIGOHABITACION = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, tipoHabitacion.getCodigoHabitacion());
        ResultSet rs = ps.executeQuery();
        
        Habitacion habitacion;
        TipoHabitacionData thd = new TipoHabitacionData(conexion);
            
        while (rs.next()){
            habitacion = new Habitacion();
            habitacion.setNumeroHabitacion(rs.getInt(1));
            habitacion.setPiso(rs.getInt(2));
            habitacion.setEstadoHabitacion(rs.getInt(3));

            habitacion.setTipoHabitacion(thd.buscarTipoHabitacion(rs.getInt(4)));
           
            habitaciones.add(habitacion);
        }
        ps.close();
        
        
        }
        catch (SQLException e){
            System.out.println("Error al listar habitaciones");
        }
        return habitaciones;
    }
   
}
