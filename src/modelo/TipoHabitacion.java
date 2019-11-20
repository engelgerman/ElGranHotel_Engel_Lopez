
package modelo;


public class TipoHabitacion {

    private int codigoHabitacion, cantidadPersonas, cantidadCamas;
    private String tiposCamas;
    private double precio;
    
//Constructor

    public TipoHabitacion(){
        
    }
    
    public TipoHabitacion(int cantidadPersonas, int cantidadCamas, String tiposCamas, double precio){
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
        this.tiposCamas = tiposCamas;
        this.precio = precio;
    }
    
//Set

    public void setCodigoHabitacion(int codigoHabitacion){
        this.codigoHabitacion = codigoHabitacion;
    }
    
    public void setCantidadPersonas(int cantidadPersonas){
        this.cantidadPersonas = cantidadPersonas;
    }
    
    public void setCantidadCamas(int cantidadCamas){
        this.cantidadCamas = cantidadCamas;
    }
    public void setTiposCamas(String tiposCamas){
        this.tiposCamas = tiposCamas;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
//Get
    
    public int getCodigoHabitacion(){
        return codigoHabitacion;
    }
    
    public int getCantidadPersonas(){
        return cantidadPersonas;
    }
    
    public int getCantidadCamas(){
        return cantidadCamas;
    }
    
    public String getTiposCamas(){
        return tiposCamas;
    }
    
    public double getPrecio(){
        return precio;
    }
    
}
