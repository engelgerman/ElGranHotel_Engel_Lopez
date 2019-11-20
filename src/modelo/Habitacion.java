
package modelo;


public class Habitacion {

    private int numeroHabitacion, piso, estadoHabitacion;
    private TipoHabitacion tipoHabitacion;
    
//Constructor

    public Habitacion(){
        
    }   
    
    public Habitacion(int piso, TipoHabitacion tipoHabitacion, int estadoHabitacion){
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
        this.estadoHabitacion = estadoHabitacion;
    }
    
//Set
    
    public void setNumeroHabitacion(int numeroHabitacion){
        this.numeroHabitacion = numeroHabitacion;
    }
    
    public void setPiso(int piso){
        this.piso = piso;
    }
    
    public void setTipoHabitacion(TipoHabitacion tipohabitacion){
        this.tipoHabitacion = tipohabitacion;
    }
    
    public void setEstadoHabitacion(int estadoHabitacion){
        this.estadoHabitacion = estadoHabitacion;
    }
    
//Get
    
    public int getNumeroHabitacion(){
        return numeroHabitacion;
    }
    
    public int getPiso(){
        return piso;
    }
    
    public TipoHabitacion getTipoHabitacion(){
        return tipoHabitacion;
    }
    
    public int getEstadoHabitacion(){
        return estadoHabitacion;
    }
    
}
