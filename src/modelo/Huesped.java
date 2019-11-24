
package modelo;


public class Huesped {
    
    private String nombre, domicilio, correo, celular;
    private int idHuesped, dni;
    
//Constructor

    public Huesped(){
        
    }
    
    public Huesped(int idHuesped, String nombre, int dni, String domicilio, String correo, String celular){
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }
    
    public Huesped(String nombre, int dni, String domicilio, String correo, String celular){
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }
    
//Set
    
    public void setIdHuesped(int idHuesped){
        this.idHuesped = idHuesped;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDni (int dni){
        this.dni = dni;
    }
    
    public void setDomicilio (String domicilio){
        this.domicilio = domicilio;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    }
    
//Get    
    
    public int getIdHuesped(){
        return idHuesped;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDni(){
        return dni;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getCelular(){
        return celular;
    }
    
}
