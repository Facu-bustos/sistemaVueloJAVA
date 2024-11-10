package Clases;

import Enumeradores.TipoEstadoVuelo;
import Enumeradores.TipoVuelo;

import java.util.List;
import java.util.Objects;

public class Vuelo {
    //ATRIBUTOS

    private int id_vuelo;
    private String origen;
    private String destino;
    private String hora_salida;
    private String hora_llegada;
    private String duracion;
    private double precio;
    private int cantidad_disponible;
    private String aerolinea;
    private String clase;
    private String numero_vuelo;
    List<Escala>escalas;
    private String tipo_vuelo;
    private String estado_vuelo;

    //CONSTRUCTOR
    public Vuelo(int id_vuelo, String origen, String destino, String hora_salida, String hora_llegada, String duracion, double precio, int cantidad_disponible, String aerolinea, String clase, String numero_vuelo, List<Escala> escalas, String tipo_vuelo, String estado_vuelo) {
        this.id_vuelo = id_vuelo;
        this.origen = origen;
        this.destino = destino;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.duracion = duracion;
        this.precio = precio;
        this.cantidad_disponible = cantidad_disponible;
        this.aerolinea = aerolinea;
        this.clase = clase;
        this.numero_vuelo = numero_vuelo;
        this.escalas = escalas;
        this.tipo_vuelo = tipo_vuelo;
        this.estado_vuelo = estado_vuelo;
    }

    public Vuelo() {

    }

    //GETTER AND SETTERS
    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
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

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(String numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }

    public String getTipo_vuelo() {
        return tipo_vuelo;
    }

    public void setTipo_vuelo(String tipo_vuelo) {
        this.tipo_vuelo = tipo_vuelo;
    }

    public String getEstado_vuelo() {
        return estado_vuelo;
    }

    public void setEstado_vuelo(String estado_vuelo) {
        this.estado_vuelo = estado_vuelo;
    }


    //METODOS EQUALS AND HASHCODE - TO STRING
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vuelo vuelo)) return false;
        return id_vuelo == vuelo.id_vuelo && Double.compare(precio, vuelo.precio) == 0 && cantidad_disponible == vuelo.cantidad_disponible && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(hora_salida, vuelo.hora_salida) && Objects.equals(hora_llegada, vuelo.hora_llegada) && Objects.equals(duracion, vuelo.duracion) && Objects.equals(aerolinea, vuelo.aerolinea) && Objects.equals(clase, vuelo.clase) && Objects.equals(numero_vuelo, vuelo.numero_vuelo) && Objects.equals(escalas, vuelo.escalas) && Objects.equals(tipo_vuelo, vuelo.tipo_vuelo) && Objects.equals(estado_vuelo, vuelo.estado_vuelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_vuelo, origen, destino, hora_salida, hora_llegada, duracion, precio, cantidad_disponible, aerolinea, clase, numero_vuelo, escalas, tipo_vuelo, estado_vuelo);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "id_vuelo=" + id_vuelo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", hora_salida='" + hora_salida + '\'' +
                ", hora_llegada='" + hora_llegada + '\'' +
                ", duracion='" + duracion + '\'' +
                ", precio=" + precio +
                ", cantidad_disponible=" + cantidad_disponible +
                ", aerolinea='" + aerolinea + '\'' +
                ", clase='" + clase + '\'' +
                ", numero_vuelo='" + numero_vuelo + '\'' +
                ", escalas=" + escalas +
                ", tipo_vuelo='" + tipo_vuelo + '\'' +
                ", estado_vuelo='" + estado_vuelo + '\'' +
                '}';
    }
}
