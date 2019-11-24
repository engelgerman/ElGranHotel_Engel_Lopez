
package modelo;


public class Habitacion {

    private int numeroHabitacion, piso, estadoHabitacion, codigoHabitacion;
    private TipoHabitacion tipoHabitacion;
    
//Constructor

    public Habitacion(){
        
    }   
    
    public Habitacion(int numeroHabitacion, int piso, TipoHabitacion tipoHabitacion, int estadoHabitacion){
        this.numeroHabitacion = numeroHabitacion;
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
        this.codigoHabitacion = tipoHabitacion.getCodigoHabitacion();
        this.estadoHabitacion = estadoHabitacion;
    }
    
    public Habitacion(int piso, TipoHabitacion tipoHabitacion, int estadoHabitacion){
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
        this.codigoHabitacion = tipoHabitacion.getCodigoHabitacion();
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
        this.codigoHabitacion = tipoHabitacion.getCodigoHabitacion();
    }
    
    public void setTipoHabitacion(int codigoHabitacion){
        this.codigoHabitacion = codigoHabitacion;
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
    
    public int getTipoHabitacion(){
        return codigoHabitacion;
    }
    
    public int getEstadoHabitacion(){
        return estadoHabitacion;
    }
    
}
