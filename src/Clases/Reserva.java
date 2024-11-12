package Clases;

import java.util.Date;

public class Reserva {
    // ATRIBUTOS
    private int idReserva;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private Date fechaReserva;
    private String estadoReserva;
    private int cantidadAsientos;
    private double precioTotal;

    // CONSTRUCTOR
    public Reserva(int idReserva, Vuelo vuelo, Pasajero pasajero, Date fechaReserva,
                   String estadoReserva, int cantidadAsientos) throws Exception {
        this.idReserva = idReserva;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
        if (cantidadAsientos > vuelo.getCantidadDisponible()) {
            throw new Exception("No hay suficientes asientos disponibles.");
        }

        this.cantidadAsientos = cantidadAsientos;
        this.precioTotal = calcularPrecioTotal();

        // Actualizar la cantidad de asientos disponibles en el vuelo
        vuelo.setCantidadDisponible(vuelo.getCantidadDisponible() - cantidadAsientos);
    }


    //GETTER Y SETTER


    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public double calcularPrecioTotal() {
        return vuelo.getPrecio() * cantidadAsientos;
    }


    public void cancelarReserva() {
        this.estadoReserva = "cancelada";

        // Devolver los asientos al vuelo al cancelar la reserva
        vuelo.setCantidadDisponible(vuelo.getCantidadDisponible() + cantidadAsientos);
    }

    public void modificarReserva(int nuevaCantidadAsientos) throws Exception {
        if (nuevaCantidadAsientos > (vuelo.getCantidadDisponible() + this.cantidadAsientos)) {
            throw new Exception("No hay suficientes asientos disponibles para modificar la reserva.");
        }

        // Devolver los asientos actuales al vuelo antes de modificar
        vuelo.setCantidadDisponible(vuelo.getCantidadDisponible() + this.cantidadAsientos);

        // Actualizar la cantidad de asientos y el precio
        this.cantidadAsientos = nuevaCantidadAsientos;
        this.precioTotal = calcularPrecioTotal();

        // Reducir la nueva cantidad de asientos en el vuelo
        vuelo.setCantidadDisponible(vuelo.getCantidadDisponible() - nuevaCantidadAsientos);
    }

    public void mostrarDetallesReserva() {
        System.out.println("Reserva ID: " + idReserva);
        System.out.println("Vuelo: " + vuelo.getNumeroVuelo());
        System.out.println("Pasajero: " + pasajero.getNumPasaporte());
        System.out.println("Fecha de Reserva: " + fechaReserva);
        System.out.println("Estado: " + estadoReserva);
        System.out.println("Asientos Reservados: " + cantidadAsientos);
        System.out.println("Precio Total: " + precioTotal);
    }



}
