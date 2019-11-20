
package modelo;

    import java.util.Date;
    
public class Reservas {
    
    int numeroReserva, cantidadDias, estadoReserva;
    Date fechaEntrada, fechaSalida;
    double importe;
    Habitacion habitacion;
    Huesped huesped;

//Constructor    
    
    public Reservas(){
        
    }
    
    public Reservas(int cantidadDias, Date fechaEntrada, Date fechaSalida, double importe, int estadoReserva, Habitacion habitacion, Huesped huesped){
        this.cantidadDias = cantidadDias;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importe = importe;
        this.estadoReserva = estadoReserva;
        this.habitacion = habitacion;
        this.huesped = huesped;
    }

//Set
    
    public void setNumeroReserva(int numeroReserva){
        this.numeroReserva = numeroReserva;
    }
    
    public void setCantidadDias(int cantidadDias){
        this.cantidadDias = cantidadDias;
    }
    
    public void setFechaEntrada(Date fechaEntrada){
        this.fechaEntrada = fechaEntrada;
    }
    
    public void setFechaSalida(Date fechaSalida){
        this.fechaSalida = fechaSalida;
    }
    
    public void setImporte(double importe){
        this.importe = importe;
    }
    
    public void setEstadoReserva(int estadoReserva){
        this.estadoReserva = estadoReserva;
    }
    
    public void setHabitacion(Habitacion habitacion){
        this.habitacion = habitacion;
    }
    
    public void setHuesped(Huesped huesped){
        this.huesped = huesped;
    }
    
//Get
    
    public int getNumeroReserva(){
        return numeroReserva;
    }
    
    public int getCantidadDias(){
        return cantidadDias;
    }
    
    public Date getFechaEntrada(){
        return fechaEntrada;
    }
    
    public Date getFechaSalida(){
        return fechaSalida;
    }
    
    public double getImporte(){
        return importe;
    }
    
    public int getEstadoReserva(){
        return estadoReserva;
    }
    
    public Habitacion getHabitacion(){
        return habitacion;
    }
    
    public Huesped getHuesped(){
        return huesped;
    }
    
}
