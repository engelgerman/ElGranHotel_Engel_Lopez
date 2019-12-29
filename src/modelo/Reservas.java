
package modelo;

    import java.time.LocalDate;

    
public class Reservas {
    
    int numeroReserva, cantidadPersonas, cantidadDias, estadoReserva;
    LocalDate fechaEntrada, fechaSalida;
    Habitacion habitacion;
    Huesped huesped;

//Constructor    
    
    public Reservas(){
        
    }
    
    public Reservas(int numeroReserva,int cantidadPersonas, int cantidadDias, LocalDate fechaEntrada, LocalDate fechaSalida, int estadoReserva, Habitacion habitacion, Huesped huesped){
        this.numeroReserva = numeroReserva;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadDias = cantidadDias;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estadoReserva = estadoReserva;
        this.habitacion = habitacion;
        this.huesped = huesped;
    }
    
    public Reservas(int cantidadPersonas, int cantidadDias, LocalDate fechaEntrada, LocalDate fechaSalida, int estadoReserva, Habitacion habitacion, Huesped huesped){
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadDias = cantidadDias;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estadoReserva = estadoReserva;
        this.habitacion = habitacion;
        this.huesped = huesped;
     }
    
//Set
    
    public void setNumeroReserva(int numeroReserva){
        this.numeroReserva = numeroReserva;
    }
    
    public void setCantidadPersonas(int cantidadPersonas){
        this.cantidadPersonas = cantidadPersonas;
    }
    
    public void setCantidadDias(int cantidadDias){
        this.cantidadDias = cantidadDias;
    }
    
    public void setFechaEntrada(LocalDate fechaEntrada){
        this.fechaEntrada = fechaEntrada;
    }
    
    public void setFechaSalida(LocalDate fechaSalida){
        this.fechaSalida = fechaSalida;
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
    
    public int getCantidadPersonas(){
        return cantidadPersonas;
    }
    
    public int getCantidadDias(){
        return cantidadDias;
    }
    
    public LocalDate getFechaEntrada(){
        return fechaEntrada;
    }
    
    public LocalDate getFechaSalida(){
        return fechaSalida;
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
