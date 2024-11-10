package Clases;

import Enumeradores.TipoAvion;

public class Avion {

    //ATRIBUTOS

    private TipoAvion modelo;
    private int capacidad;
    private int anioFabricacion;
    private double kilometrosRecorridos;

    //CONSTRUCTOR

    public Avion(TipoAvion modelo, double kilometrosRecorridos, int anioFabricacion, int capacidad) {
        this.modelo = modelo;
        kilometrosRecorridos = kilometrosRecorridos;
        this.anioFabricacion = anioFabricacion;
        this.capacidad = capacidad;
    }

    public Avion(){

    }

    //GETTER

    public TipoAvion getModelo() {
        return modelo;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
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

    public void setKilometrosRecorridos(double kilometros) {
        kilometrosRecorridos = kilometrosRecorridos;
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
                ", Kilometros=" + kilometrosRecorridos +
                '}';
    }


}
