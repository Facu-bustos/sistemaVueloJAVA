package Clases;

import java.util.Objects;

public class TicketsDeReserva {
    //Atributos
    private int IdReserva;
    private int idVuelo;
    private String origen;
    private String destino;
    private double precio;
    private String numeroVuelo;
    private String aerolinea;
    private String duracion;
    private String horaSalida;
    private String horaLlegada;

    public TicketsDeReserva(int idReserva, int idVuelo, String origen, String destino, double precio, String numeroVuelo, String aerolinea, String duracion, String horaSalida, String horaLlegada) {
        IdReserva = idReserva;
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.duracion = duracion;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public TicketsDeReserva() {

    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int idReserva) {
        IdReserva = idReserva;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public String toString() {
        return "TicketsDeReserva{" +
                "IdReserva=" + IdReserva +
                ", idVuelo=" + idVuelo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", numeroVuelo='" + numeroVuelo + '\'' +
                ", aerolinea='" + aerolinea + '\'' +
                ", duracion='" + duracion + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketsDeReserva that)) return false;
        return IdReserva == that.IdReserva && idVuelo == that.idVuelo && Double.compare(precio, that.precio) == 0 && Objects.equals(origen, that.origen) && Objects.equals(destino, that.destino) && Objects.equals(numeroVuelo, that.numeroVuelo) && Objects.equals(aerolinea, that.aerolinea) && Objects.equals(duracion, that.duracion) && Objects.equals(horaSalida, that.horaSalida) && Objects.equals(horaLlegada, that.horaLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdReserva, idVuelo, origen, destino, precio, numeroVuelo, aerolinea, duracion, horaSalida, horaLlegada);
    }
}
