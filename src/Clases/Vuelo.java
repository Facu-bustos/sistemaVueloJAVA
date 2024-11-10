package Clases;

import Enumeradores.TipoEstadoVuelo;
import Enumeradores.TipoVuelo;

public class Vuelo {

    //ATRIBUTOS

    private TipoEstadoVuelo estadoVuelo;
    private String numumeroVuelo;
    private String fechaSalida;
    private String horaSalida;
    private String fechaLlegada;
    private String horaLlegada;
    private String codigoAeropuertoSalida;
    private String CodigoAeropuertoLlegada;
    private TipoVuelo tipoVuelo;

    //CONSTRUCTOR


    public Vuelo(TipoEstadoVuelo estadoVuelo, TipoVuelo tipoVuelo, String codigoAeropuertoLlegada, String horaLlegada, String codigoAeropuertoSalida, String fechaLlegada, String horaSalida, String fechaSalida, String numumeroVuelo) {
        this.estadoVuelo = estadoVuelo;
        this.tipoVuelo = tipoVuelo;
        CodigoAeropuertoLlegada = codigoAeropuertoLlegada;
        this.horaLlegada = horaLlegada;
        this.codigoAeropuertoSalida = codigoAeropuertoSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaSalida = horaSalida;
        this.fechaSalida = fechaSalida;
        this.numumeroVuelo = numumeroVuelo;
    }

    public Vuelo(){

    }

    //GETTER

    public TipoEstadoVuelo getEstadoVuelo() {
        return estadoVuelo;
    }

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public String getCodigoAeropuertoLlegada() {
        return CodigoAeropuertoLlegada;
    }

    public String getCodigoAeropuertoSalida() {
        return codigoAeropuertoSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getNumumeroVuelo() {
        return numumeroVuelo;
    }


    //SETTER

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public void setCodigoAeropuertoLlegada(String codigoAeropuertoLlegada) {
        CodigoAeropuertoLlegada = codigoAeropuertoLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setCodigoAeropuertoSalida(String codigoAeropuertoSalida) {
        this.codigoAeropuertoSalida = codigoAeropuertoSalida;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setNumumeroVuelo(String numumeroVuelo) {
        this.numumeroVuelo = numumeroVuelo;
    }

    public void setEstadoVuelo(TipoEstadoVuelo estadoVuelo) {
        this.estadoVuelo = estadoVuelo;
    }

    //METODOS

    @Override
    public String toString() {
        return "Vuelo{" +
                "estadoVuelo=" + estadoVuelo +
                ", numumeroVuelo='" + numumeroVuelo + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", fechaLlegada='" + fechaLlegada + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", codigoAeropuertoSalida='" + codigoAeropuertoSalida + '\'' +
                ", CodigoAeropuertoLlegada='" + CodigoAeropuertoLlegada + '\'' +
                ", tipoVuelo=" + tipoVuelo +
                '}';
    }
}
