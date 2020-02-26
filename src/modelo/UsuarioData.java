/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author germa
 */
public class UsuarioData {
    
    public UsuarioData(Conexion conexion){
        con = conexion.getConexion();
        hd = new HuespedData(conexion);
    }
    
    public Usuarios usuarios;
    public HuespedData hd;
    
    private Connection con;
    
        public void agregarUsuarios(Usuarios usuario){
            this.usuarios = usuario; 
            try{
                String sql = "INSERT INTO usuarios (APELLIDO, NOMBRE, MAIL, IDHUESPED) VALUES (?, ?, ?, ?);";
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, usuarios.getApellido());
                ps.setString(2, usuarios.getNombre());
                ps.setString(3, usuarios.getMail());
                ps.setInt(4, usuarios.getHuesped().getIdHuesped());

                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();

                if(rs.next()){
                    usuarios.setId(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id del usuario");
                }

                ps.close();

            }
            catch(SQLException ex){
                System.out.println("Error al agregar usuario");
            }
        }
        
    public List<Usuarios> listarUsuarios(){
        List<Usuarios> usuarios1 = new ArrayList<Usuarios>();
        
        try{
            
        String sql = "SELECT * FROM usuarios";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Usuarios us;
        
        while (rs.next()){
            us = new Usuarios();
            us.setId(rs.getInt(1));
            us.setApellido(rs.getString(2));
            us.setNombre(rs.getString(3));
            us.setMail(rs.getString(4));
            us.setHuesped(hd.buscarHuespedID(rs.getInt(5)));
            
            usuarios1.add(us);

        }
        ps.close();
              
        }
        catch (SQLException e){
            System.out.println("Error al listar usuarios" + e);
        }
        return usuarios1;
    }    
    
    
    
}
