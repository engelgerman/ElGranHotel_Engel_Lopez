
package modelo;

    import java.time.LocalDate;

    
public class Reservas {
    
    int numeroReserva, cantidadDias, estadoReserva, numeroHabitacion, idHuesped;
    LocalDate fechaEntrada, fechaSalida;
    double importe;
    Habitacion habitacion;
    Huesped huesped;

//Constructor    
    
    public Reservas(){
        
    }
    
    public Reservas(int numeroReserva, int cantidadDias, LocalDate fechaEntrada, LocalDate fechaSalida, double importe, int estadoReserva, Habitacion habitacion, Huesped huesped){
        this.numeroReserva = numeroReserva;
        this.cantidadDias = cantidadDias;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importe = importe;
        this.estadoReserva = estadoReserva;
        this.habitacion = habitacion;
        this.numeroHabitacion = habitacion.getNumeroHabitacion();
        this.huesped = huesped;
        this.idHuesped = huesped.getIdHuesped();
    }
    
    public Reservas(int cantidadDias, LocalDate fechaEntrada, LocalDate fechaSalida, double importe, int estadoReserva, Habitacion habitacion, Huesped huesped){
        this.cantidadDias = cantidadDias;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importe = importe;
        this.estadoReserva = estadoReserva;
        this.habitacion = habitacion;
        this.numeroHabitacion = habitacion.getNumeroHabitacion();
        this.huesped = huesped;
        this.idHuesped = huesped.getIdHuesped();
    }
    
    public Reservas(int numeroReserva, int cantidadDias, LocalDate fechaEntrada, LocalDate fechaSalida, double importe, int estadoReserva, int numeroHabitacion, int idHuesped){
        this.numeroReserva = numeroReserva;
        this.cantidadDias = cantidadDias;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importe = importe;
        this.estadoReserva = estadoReserva;
        this.numeroHabitacion = numeroHabitacion;
        this.idHuesped = idHuesped;
    }

//Set
    
    public void setNumeroReserva(int numeroReserva){
        this.numeroReserva = numeroReserva;
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
    
    public void setImporte(double importe){
        this.importe = importe;
    }
    
    public void setEstadoReserva(int estadoReserva){
        this.estadoReserva = estadoReserva;
    }
    
    public void setHabitacion(Habitacion habitacion){
        this.habitacion = habitacion;
        this.numeroHabitacion = habitacion.getNumeroHabitacion();
    }
    
    public void setHabitacion(int numeroHabitacion){
        this.numeroHabitacion = numeroHabitacion;
    }
    
    public void setHuesped(Huesped huesped){
        this.huesped = huesped;
        this.idHuesped = huesped.getIdHuesped();
    }

    public void setHuesped(int idHuesped){
        this.idHuesped = idHuesped;
    }
    
//Get
    
    public int getNumeroReserva(){
        return numeroReserva;
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
    
    public double getImporte(){
        return importe;
    }
    
    public int getEstadoReserva(){
        return estadoReserva;
    }
    
    public int getHabitacion(){
        return numeroHabitacion;
    }
    
    public int getHuesped(){
        return idHuesped;
    }
    
}
