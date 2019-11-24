
package modelo;

    import java.sql.Connection;
import java.sql.Date;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.List;

public class ReservasData {
    
    private Connection con;
    
//Constructor
    
    public ReservasData(Conexion conexion){

            con = conexion.getConexion();

    }
    
//Alta    
    
    public void agregarReserva(Reservas reserva){
             
        try{
            String sql = "INSERT INTO reservas (CANTIDADDIAS, FECHAENTRADA, FECHASALIDA, IMPORTE, ESTADORESERVA, NUMEROHABITACION, IDHUESPED) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getCantidadDias());
            ps.setDate(2, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(3, Date.valueOf(reserva.getFechaSalida()));
            ps.setDouble(4, reserva.getImporte());
            ps.setInt(5, reserva.getEstadoReserva());
            ps.setInt(6, reserva.getHabitacion());
            ps.setInt(7, reserva.getHuesped());
                       
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                reserva.setNumeroReserva(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el numero de reserva");
            }
            
            ps.close();

        }
        catch(SQLException ex){
            System.out.println("Error al agregar reserva");
        }
    }
    
//Baja

    public void borrarReserva(int numeroReserva){
        try {
            String sql = "DELETE FROM reservas WHERE NUMERORESERVA = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroReserva);
            ps.executeUpdate();
            ps.close();
                           
        } catch (SQLException ex) {
            System.out.println("Error al borrar reserva");
        }
            
    }    
    
//Modificacion

    public void modificarReserva(Reservas reserva){
        try {
            String sql = "UPDATE reservas SET CANTIDADDIAS = ?, FECHAENTRADA = ?, FECHASALIDA = ?, IMPORTE = ?, ESTADORESERVA = ?, NUMEROHABITACION = ?, IDHUESPED = ? WHERE NUMERORESERVA = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getCantidadDias());
            ps.setDate(2, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(3, Date.valueOf(reserva.getFechaSalida()));
            ps.setDouble(4, reserva.getImporte());
            ps.setInt(5, reserva.getEstadoReserva());
            ps.setInt(6, reserva.getHabitacion());
            ps.setInt(7, reserva.getHuesped());
            ps.setInt(8, reserva.getNumeroReserva());
            
            ps.executeUpdate();
            
            ps.close();            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar reserva");
        }
        
    }
    
//Buscar    
    
    public Reservas buscarReserva(int numeroReserva){
        Reservas reserva = null;
        
        try {
            String sql = "SELECT * FROM reservas WHERE NUMERORESERVA = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroReserva);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                reserva = new Reservas();
                reserva.setNumeroReserva(rs.getInt(1));
                reserva.setCantidadDias(rs.getInt(2));
                reserva.setFechaEntrada(rs.getDate(3).toLocalDate());
                reserva.setFechaSalida(rs.getDate(4).toLocalDate());
                reserva.setImporte(rs.getDouble(5));
                reserva.setEstadoReserva(rs.getInt(6));
                reserva.setHabitacion(rs.getInt(7));
                reserva.setHuesped(rs.getInt(8));
                               
            }
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar reserva");
        }
        
        return reserva;
    }
    
//Listar    
    
    public List<Reservas> listarReservas(){
        List<Reservas> reservas = new ArrayList<>();
        
        try{
            
        String sql = "SELECT * FROM reservas";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Reservas reserva;
        
        while (rs.next()){
            reserva = new Reservas();
            reserva.setNumeroReserva(rs.getInt(1));
            reserva.setCantidadDias(rs.getInt(2));
            reserva.setFechaEntrada(rs.getDate(3).toLocalDate());
            reserva.setFechaSalida(rs.getDate(4).toLocalDate());
            reserva.setImporte(rs.getDouble(5));
            reserva.setEstadoReserva(rs.getInt(6));
            reserva.setHabitacion(rs.getInt(7));
            reserva.setHuesped(rs.getInt(8));
            
            reservas.add(reserva);
            
        }
        ps.close();
           
        }
        catch (SQLException e){
            System.out.println("Error al listar reservas");
        }
        return reservas;
    }    
          
}
