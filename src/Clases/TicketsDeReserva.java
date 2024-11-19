package Clases;

import java.util.List;
import java.util.Objects;

public class TicketsDeReserva {
    //Atributos
    //ATRIBUTOS
    private String NumeroPasaporte;
    private int IdReserva;
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
    List<Escala> escalas;
    private String tipoVuelo;
    private String estadoVuelo;

    public TicketsDeReserva ()
    {

    }

    public TicketsDeReserva(int idReserva,String NumeroPasaporte ,int idVuelo, String origen, String destino, String horaSalida, String horaLlegada, String duracion, double precio, int cantidadDisponible, String aerolinea, String clase, String numeroVuelo, List<Escala> escalas, String tipoVuelo, String estadoVuelo) {
        this.NumeroPasaporte = NumeroPasaporte;
        IdReserva = idReserva;
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

    public String getNumeroPasaporte() {
        return NumeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        NumeroPasaporte = numeroPasaporte;
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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
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

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getEstadoVuelo() {
        return estadoVuelo;
    }

    public void setEstadoVuelo(String estadoVuelo) {
        this.estadoVuelo = estadoVuelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketsDeReserva that)) return false;
        return getIdVuelo() == that.getIdVuelo() && Double.compare(getPrecio(), that.getPrecio()) == 0 && getCantidadDisponible() == that.getCantidadDisponible() && Objects.equals(getOrigen(), that.getOrigen()) && Objects.equals(getDestino(), that.getDestino()) && Objects.equals(getHoraSalida(), that.getHoraSalida()) && Objects.equals(getHoraLlegada(), that.getHoraLlegada()) && Objects.equals(getDuracion(), that.getDuracion()) && Objects.equals(getAerolinea(), that.getAerolinea()) && Objects.equals(getClase(), that.getClase()) && Objects.equals(getNumeroVuelo(), that.getNumeroVuelo()) && Objects.equals(getEscalas(), that.getEscalas()) && Objects.equals(getTipoVuelo(), that.getTipoVuelo()) && Objects.equals(getEstadoVuelo(), that.getEstadoVuelo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVuelo(), getOrigen(), getDestino(), getHoraSalida(), getHoraLlegada(), getDuracion(), getPrecio(), getCantidadDisponible(), getAerolinea(), getClase(), getNumeroVuelo(), getEscalas(), getTipoVuelo(), getEstadoVuelo());
    }

    @Override
    public String toString() {
        return "TicketsDeReserva{" +
                "idVuelo=" + idVuelo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", duracion='" + duracion + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                ", aerolinea='" + aerolinea + '\'' +
                ", clase='" + clase + '\'' +
                ", numeroVuelo='" + numeroVuelo + '\'' +
                ", escalas=" + escalas +
                ", tipoVuelo='" + tipoVuelo + '\'' +
                ", estadoVuelo='" + estadoVuelo + '\'' +
                '}';
    }

}
