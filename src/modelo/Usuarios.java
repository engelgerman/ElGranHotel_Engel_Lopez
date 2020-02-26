
package modelo;


public class Usuarios {
    
    
    int idUsuario;
    String apellido, nombre, mail;
    Huesped huesped;

    
    public void setId(int id){
        this.idUsuario = id;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public void setHuesped(Huesped huesped){
        this.huesped = huesped;
    }    
    
    public int getID(){
        return idUsuario;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public String getMail(){
        return mail;
    }
    public Huesped getHuesped(){
        return huesped;
    }

    
}
