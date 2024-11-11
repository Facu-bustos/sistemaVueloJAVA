package Clases;

import Enumeradores.TipoEstadoVuelo;
import Enumeradores.TipoVuelo;

import java.util.List;
import java.util.Objects;

public class Vuelo {
    //ATRIBUTOS

    private int idVuelo;
    private String origen;
    private String destino;
    private String horaSalida;
    private String horaLlegada;
    private String duracion;
    private double precio;
    private int cantidadDisponible;
    private String aerolinea;
    private String clase;
    private String numeroVuelo;
    List<Escala>escalas;
    private String tipoVuelo;
    private String estadoVuelo;

    //CONSTRUCTOR
    public Vuelo(int idVuelo, String origen, String destino, String horaSalida, String horaLlegada, String duracion, double precio, int cantidadDisponible, String aerolinea, String clase, String numeroVuelo, List<Escala> escalas, String tipoVuelo, String estadoVuelo) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.duracion = duracion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.aerolinea = aerolinea;
        this.clase = clase;
        this.numeroVuelo = numeroVuelo;
        this.escalas = escalas;
        this.tipoVuelo = tipoVuelo;
        this.estadoVuelo = estadoVuelo;
    }

    public Vuelo() {

    }

    // GETTER


    public int getIdVuelo() {
        return idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public String getDuracion() {
        return duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getClase() {
        return clase;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public String getEstadoVuelo() {
        return estadoVuelo;
    }

    // SETTER

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public void setEstadoVuelo(String estadoVuelo) {
        this.estadoVuelo = estadoVuelo;
    }

    //METODOS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return idVuelo == vuelo.idVuelo && Double.compare(precio, vuelo.precio) == 0 && cantidadDisponible == vuelo.cantidadDisponible && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(horaSalida, vuelo.horaSalida) && Objects.equals(horaLlegada, vuelo.horaLlegada) && Objects.equals(duracion, vuelo.duracion) && Objects.equals(aerolinea, vuelo.aerolinea) && Objects.equals(clase, vuelo.clase) && Objects.equals(numeroVuelo, vuelo.numeroVuelo) && Objects.equals(escalas, vuelo.escalas) && Objects.equals(tipoVuelo, vuelo.tipoVuelo) && Objects.equals(estadoVuelo, vuelo.estadoVuelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVuelo, origen, destino, horaSalida, horaLlegada, duracion, precio, cantidadDisponible, aerolinea, clase, numeroVuelo, escalas, tipoVuelo, estadoVuelo);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idVuelo=" + idVuelo + System.lineSeparator()+
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", duracion='" + duracion + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                ", aerolinea='" + aerolinea + '\'' +
                ", clase='" + clase + '\'' +
                ", numeroVuelo='" + numeroVuelo + '\''  +
                ", escalas=" + escalas +
                ", tipoVuelo='" + tipoVuelo + '\'' +
                ", estadoVuelo='" + estadoVuelo + '\''+  System.lineSeparator()+
                '}';
    }
}