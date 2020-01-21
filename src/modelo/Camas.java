
package modelo;


public class Camas {
    
    private int idCamas, cantidad, codigoHabitacion;
    private String cama;
    
//Constructor
    
    public Camas(){
        
    }
    
    public Camas(int cantidad, String cama, int codigoHabitacion){
        this.cantidad = cantidad;
        this.cama = cama;
        this.codigoHabitacion = codigoHabitacion;
    }
    
    public Camas(int idCamas, int cantidad, String cama, int codigoHabitacion){
        this.idCamas = idCamas;
        this.cantidad = cantidad;
        this.cama = cama;
        this.codigoHabitacion = codigoHabitacion;
    }
    
//Set
    
    public void setIdCamas(int idCamas){
        this.idCamas = idCamas;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public void setCama(String cama){
        this.cama = cama;
    }
    
    public void setCodigoHabitacion(int codigoHabitacion){
        this.codigoHabitacion = codigoHabitacion;
    }
    
//Get
    
    public int getIdCamas(){
        return idCamas;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public String getCama(){
        return cama;
    }
    
    public int getCodigoHabitacion(){
        return codigoHabitacion;
    }
    
}
