package Clases;

import Enumeradores.TipoAvion;

public class Avion {

    //ATRIBUTOS

    private TipoAvion modelo;
    private int capacidad;
    private int anioFabricacion;
    private double Kilometros;

    //CONSTRUCTOR

    public Avion(TipoAvion modelo, double kilometros, int anioFabricacion, int capacidad) {
        this.modelo = modelo;
        Kilometros = kilometros;
        this.anioFabricacion = anioFabricacion;
        this.capacidad = capacidad;
    }

    public Avion(){

    }

    //GETTER

    public TipoAvion getModelo() {
        return modelo;
    }

    public double getKilometros() {
        return Kilometros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    //SETTER

    public void setModelo(TipoAvion modelo) {
        this.modelo = modelo;
    }

    public void setKilometros(double kilometros) {
        Kilometros = kilometros;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //METODOS

    @Override
    public String toString() {
        return "Avion{" +
                "modelo=" + modelo +
                ", capacidad=" + capacidad +
                ", anioFabricacion=" + anioFabricacion +
                ", Kilometros=" + Kilometros +
                '}';
    }


}
