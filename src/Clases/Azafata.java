package Clases;

import Enumeradores.TipoTripulante;

public class Azafata extends Tripulante{

    //ATRIBUTOS

    private int cantIdiomas;

    //CONSTRUCTOR

    public Azafata(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, TipoTripulante tipoTripulante, String cargo, float sueldo, String legajo, int cantIdiomas) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, tipoTripulante, cargo, sueldo, legajo);
        this.cantIdiomas = cantIdiomas;
    }

    public Azafata(){

    }

    //GETTER

    public int getCantIdiomas() {
        return cantIdiomas;
    }

    //SETTER

    public void setCantIdiomas(int cantIdiomas) {
        this.cantIdiomas = cantIdiomas;
    }

    //METODOS

    @Override
    public String toString() {
        return "Azafata{" +
                "cantIdiomas=" + cantIdiomas + super.toString() +
                '}';
    }
}