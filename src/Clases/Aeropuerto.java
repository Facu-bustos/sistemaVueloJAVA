package Clases;

import java.util.Queue;

public class Aeropuerto {

    //ATRIBUTOS

    private String ciudad;
    private String pais;
    private String codigoAeropuerto;
    private int cantidadPistas;
    
    //CONSTRUCTOR

    public Aeropuerto(String ciudad, int cantidadPistas, String codigoAeropuerto, String pais) {
        this.ciudad = ciudad;
        this.cantidadPistas = cantidadPistas;
        this.codigoAeropuerto = codigoAeropuerto;
        this.pais = pais;
    }

    public Aeropuerto(){

    }

    //SETTER

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCantidadPistas(int cantidadPistas) {
        this.cantidadPistas = cantidadPistas;
    }

    public void setCodigoAeropuerto(String codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //GETTTER

    public String getCiudad() {
        return ciudad;
    }

    public int getCantidadPistas() {
        return cantidadPistas;
    }

    public String getCodigoAeropuerto() {
        return codigoAeropuerto;
    }

    public String getPais() {
        return pais;
    }

    //METODOS

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", codigoAeropuerto='" + codigoAeropuerto + '\'' +
                ", cantidadPistas=" + cantidadPistas +
                '}';
    }
}