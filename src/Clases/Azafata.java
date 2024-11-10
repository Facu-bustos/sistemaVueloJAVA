package Clases;

import Enumeradores.TipoTripulante;

public class Azafata extends Tripulante{

    //ATRIBUTOS

    private int cantIdiomas;

    //CONSTRUCTOR

    public Azafata(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo, int cantIdiomas) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre, tipoTripulante, cargo, legajo, sueldo);
        this.cantIdiomas = cantIdiomas;
    }

    public Azafata(int cantIdiomas) {
        this.cantIdiomas = cantIdiomas;
    }

    public Azafata(TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo, int cantIdiomas) {
        super(tipoTripulante, cargo, legajo, sueldo);
        this.cantIdiomas = cantIdiomas;
    }

    public Azafata(){

    }

    //SETTER

    public void setCantIdiomas(int cantIdiomas) {
        this.cantIdiomas = cantIdiomas;
    }

    //GETTER

    public int getCantIdiomas() {
        return cantIdiomas;
    }

    //METODOS

    @Override
    public String toString() {
        return "Azafata{" +
                "cantIdiomas=" + cantIdiomas + super.toString() +
                '}';
    }
}
