
package modelo;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.List;



public class HuespedData {
    
    private Connection con;
    
//Constructor
    
    public HuespedData(Conexion conexion){

            con = conexion.getConexion();

    }
    
//Alta
    
    public void agregarHuesped(Huesped huesped){
             
        try{
            String sql = "INSERT INTO huesped (NOMBRE, DNI, DOMICILIO, CORREO, CELULAR) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setInt(2, huesped.getDni());
            ps.setString(3, huesped.getDomicilio());
            ps.setString(4, huesped.getCorreo());
            ps.setString(5, huesped.getCelular());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                huesped.setIdHuesped(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id del huesped");
            }
            
            ps.close();

        }
        catch(SQLException ex){
            System.out.println("Error al agregar Huesped");
        }
    }
    
//Baja
    
    public void borrarHuesped(int idHuesped){
        try {
            String sql = "DELETE FROM huesped WHERE IDHUESPED = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.executeUpdate();
            ps.close();
                           
        } catch (SQLException ex) {
            System.out.println("Error al borrar huesped");
        }
            
    }

//Modificacion
    
    public void modificarHuesped(Huesped huesped){
        try {
            String sql = "UPDATE huesped SET NOMBRE = ?, DNI = ?, DOMICILIO = ?, CORREO = ?, CELULAR = ? WHERE IDHUESPED = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getNombre());
            ps.setInt(2, huesped.getDni());
            ps.setString(3, huesped.getDomicilio());
            ps.setString(4, huesped.getCorreo());
            ps.setString(5, huesped.getCelular());
            ps.setInt(6, huesped.getIdHuesped());
            
            ps.executeUpdate();
            
            ps.close();            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar huesped");
        }
           
    }
    
//Buscar
    
    public Huesped buscarHuesped(int idHuesped){
        Huesped huesped = null;
        
        try {
            String sql = "SELECT * FROM huesped WHERE IDHUESPED = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt(1));
                huesped.setNombre(rs.getString(2));
                huesped.setDni(rs.getInt(3));
                huesped.setDomicilio(rs.getString(4));
                huesped.setCorreo(rs.getString(5));
                huesped.setCelular(rs.getString(6));
            }
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar huesped");
        }
        
        return huesped;
        
    }
    
//Listar
    
    public List<Huesped> listarHuesped(){
        List<Huesped> huespedes = new ArrayList<Huesped>();
        
        try{
            
        String sql = "SELECT * FROM huesped";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Huesped huesped;
        
        while (rs.next()){
            huesped = new Huesped();
            huesped.setIdHuesped(rs.getInt(1));
            huesped.setNombre(rs.getString(2));
            huesped.setDni(rs.getInt(3));
            huesped.setDomicilio(rs.getString(4));
            huesped.setCorreo(rs.getString(5));
            huesped.setCelular(rs.getString(6));
            
            huespedes.add(huesped);
        }
        ps.close();
        
        
        }
        catch (SQLException e){
            System.out.println("Error al listar huesped");
        }
        return huespedes;
    }
    
}
