
package modelo;

    import java.sql.Connection;
    import java.sql.Date;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.List;

public class ReservasData {
    
    private Connection con;
    
//Constructor
    
    public ReservasData(Conexion conexion){

            con = conexion.getConexion();
            con2 = new Conexion();
    }
    
    Conexion con2;
    
//Alta    
    
    public void agregarReserva(Reservas reserva){
             
        try{
            String sql = "INSERT INTO reservas (CANTIDADPERSONAS, FECHAENTRADA, FECHASALIDA, CANTIDADDIAS, ESTADORESERVA, IDHUESPED, NUMEROHABITACION) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getCantidadPersonas());
            ps.setDate(2, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(3, Date.valueOf(reserva.getFechaSalida()));
            ps.setDouble(4, reserva.getCantidadDias());
            ps.setInt(5, reserva.getEstadoReserva());
            ps.setInt(6, reserva.getHuesped().getIdHuesped());
            ps.setInt(7, reserva.getHabitacion().getNumeroHabitacion());
                       
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
            System.out.println("Error al agregar reserva"+ ex);
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
            String sql = "UPDATE reservas SET CANTIDADPERSONAS = ?, FECHAENTRADA = ?, FECHASALIDA = ?, CANTIDADDIAS = ?, ESTADORESERVA = ?, IDHUESPED = ?, NUMEROHABITACION = ? WHERE NUMERORESERVA = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getCantidadPersonas());
            ps.setDate(2, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(3, Date.valueOf(reserva.getFechaSalida()));
            ps.setDouble(4, reserva.getCantidadDias());
            ps.setInt(5, reserva.getEstadoReserva());
            ps.setInt(6, reserva.getHuesped().getIdHuesped());
            ps.setInt(7, reserva.getHabitacion().getNumeroHabitacion());
            ps.setInt(8, reserva.getNumeroReserva());
            
            ps.executeUpdate();
            
            ps.close();            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar reserva");
        }
        
    }
    
//Buscar por numero de reserva    
    
    public Reservas buscarPorNReserva(int numeroReserva){
        Reservas reserva = null;
        HuespedData huespedData = new HuespedData(con2);
        HabitacionData habitacionData = new HabitacionData(con2);
        
        try {
            String sql = "SELECT * FROM reservas WHERE NUMERORESERVA = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroReserva);
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()){
                reserva = new Reservas();
                
                reserva.setNumeroReserva(rs.getInt(1));
                reserva.setCantidadPersonas(rs.getInt(2));
                reserva.setFechaEntrada(rs.getDate(3).toLocalDate());
                reserva.setFechaSalida(rs.getDate(4).toLocalDate());
                reserva.setCantidadDias(rs.getInt(5));
                reserva.setEstadoReserva(rs.getInt(6));
                
                reserva.setHuesped(huespedData.buscarHuespedID(rs.getInt(7)));
                
                reserva.setHabitacion(habitacionData.buscarHabitacion(rs.getInt(8)));
                               
            }
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar reserva");
        }
        
        return reserva;
    }
    
//Buscar por IDHuesped
    
    public List<Reservas> buscarPorHuesped(int idHuesped){
        List<Reservas> reservas = new ArrayList<>();
        Reservas reserva = null;
        HuespedData huespedData = new HuespedData(con2);
        HabitacionData habitacionData = new HabitacionData(con2);
               
        try{
            String sql = "SELECT * FROM reservas WHERE IDHUESPED = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                reserva = new Reservas();
                
                reserva.setNumeroReserva(rs.getInt(1));
                reserva.setCantidadPersonas(rs.getInt(2));
                reserva.setFechaEntrada(rs.getDate(3).toLocalDate());
                reserva.setFechaSalida(rs.getDate(4).toLocalDate());
                reserva.setCantidadDias(rs.getInt(5));
                reserva.setEstadoReserva(rs.getInt(6));
                
                reserva.setHuesped(huespedData.buscarHuespedID(rs.getInt(7)));
                
                reserva.setHabitacion(habitacionData.buscarHabitacion(rs.getInt(8)));
                
                reservas.add(reserva);
            }
            
             ps.close();
                      
        }catch(SQLException e){
            System.out.println("Error al buscar reservas");
        }
        
        return reservas;
    }    
    
//Buscar por Estado
    
    public List<Reservas> buscarPorEstado(int estado){
        List<Reservas> reservas = new ArrayList<>();
        Reservas reserva = null;
        HuespedData huespedData = new HuespedData(con2);
        HabitacionData habitacionData = new HabitacionData(con2);
               
        try{
            String sql = "SELECT * FROM reservas WHERE ESTADORESERVA = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                reserva = new Reservas();
                
                reserva.setNumeroReserva(rs.getInt(1));
                reserva.setCantidadPersonas(rs.getInt(2));
                reserva.setFechaEntrada(rs.getDate(3).toLocalDate());
                reserva.setFechaSalida(rs.getDate(4).toLocalDate());
                reserva.setCantidadDias(rs.getInt(5));
                reserva.setEstadoReserva(rs.getInt(6));
                
                reserva.setHuesped(huespedData.buscarHuespedID(rs.getInt(7)));
                
                reserva.setHabitacion(habitacionData.buscarHabitacion(rs.getInt(8)));
                
                reservas.add(reserva);
            }
            
             ps.close();
                      
        }catch(SQLException e){
            System.out.println("Error al buscar reservas");
        }
        
        return reservas;
    }
    
//Buscar por fecha
    
    public List<Reservas> buscarPorFecha(LocalDate FEntrada, LocalDate FSalida){
        List<Reservas> reservas = new ArrayList<>();
        Reservas reserva = null;
        HuespedData huespedData = new HuespedData(con2);
        HabitacionData habitacionData = new HabitacionData(con2);
               
        try{
            String sql = "SELECT * FROM reservas WHERE (FECHAENTRADA BETWEEN ? AND ?) OR (FECHASALIDA BETWEEN ? AND ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(FEntrada));
            ps.setDate(2, Date.valueOf(FSalida));
            ps.setDate(3, Date.valueOf(FEntrada));
            ps.setDate(4, Date.valueOf(FSalida));
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                reserva = new Reservas();
                
                reserva.setNumeroReserva(rs.getInt(1));
                reserva.setCantidadPersonas(rs.getInt(2));
                reserva.setFechaEntrada(rs.getDate(3).toLocalDate());
                reserva.setFechaSalida(rs.getDate(4).toLocalDate());
                reserva.setCantidadDias(rs.getInt(5));
                reserva.setEstadoReserva(rs.getInt(6));
                
                reserva.setHuesped(huespedData.buscarHuespedID(rs.getInt(7)));
                
                reserva.setHabitacion(habitacionData.buscarHabitacion(rs.getInt(8)));
                
                reservas.add(reserva);
            }
            
             ps.close();
                      
        }catch(SQLException e){
            System.out.println("Error al buscar reservas");
        }
        
        return reservas;
    }

//Listar    
    
    public List<Reservas> listarReservas(){
        List<Reservas> reservas = new ArrayList<>();
        HuespedData huespedData = new HuespedData(con2);
        HabitacionData habitacionData = new HabitacionData(con2);
        try{
            
        String sql = "SELECT * FROM reservas";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Reservas reserva;
        
        while (rs.next()){
            reserva = new Reservas();
                reserva.setNumeroReserva(rs.getInt(1));
                reserva.setCantidadPersonas(rs.getInt(2));
                reserva.setFechaEntrada(rs.getDate(3).toLocalDate());
                reserva.setFechaSalida(rs.getDate(4).toLocalDate());
                reserva.setCantidadDias(rs.getInt(5));
                reserva.setEstadoReserva(rs.getInt(6));
                
                reserva.setHuesped(huespedData.buscarHuespedID(rs.getInt(7)));
                
                reserva.setHabitacion(habitacionData.buscarHabitacion(rs.getInt(8)));
            
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
