
package modelo;

import java.util.ArrayList;
import java.util.List;


public class TipoHabitacion {

    private int codigoHabitacion, cantidadPersonas;
    private String nombre;
    private double precio;
    private List<Camas> camas;
       
//Constructor

    public TipoHabitacion(){
        camas = new ArrayList<Camas>();
    }
    
    public TipoHabitacion(int codigoHabitacion, int cantidadPersonas, String nombre, double precio){
        camas = new ArrayList<Camas>();
        this.codigoHabitacion = codigoHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public TipoHabitacion(int cantidadPersonas, String nombre, double precio){
        camas = new ArrayList<Camas>();
        this.cantidadPersonas = cantidadPersonas;
        this.nombre = nombre;
        this.precio = precio;   
    }
    
//Set

    public void setCodigoHabitacion(int codigoHabitacion){
        this.codigoHabitacion = codigoHabitacion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCantidadPersonas(int cantidadPersonas){
        this.cantidadPersonas = cantidadPersonas;
    }
    
    public void setCamas(List<Camas> camas){
        this.camas = camas;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
//Get
    
    public int getCodigoHabitacion(){
        return codigoHabitacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidadPersonas(){
        return cantidadPersonas;
    }
    
    public List<Camas> getCamas(){
        return camas;
    }
    
    public double getPrecio(){
        return precio;
    }
    
}
