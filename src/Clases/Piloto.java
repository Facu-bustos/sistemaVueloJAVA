package Clases;

import Enumeradores.TipoTripulante;

public class Piloto extends Tripulante{

    //ATRIBUTOS

    private int horasVuelosP;
    private String licenciaVuelosP;

    //CONSTRUCTOR

    public Piloto(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, TipoTripulante tipoTripulante, String cargo, float sueldo, String legajo, int horasVuelosP, String licenciaVuelosP) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, tipoTripulante, cargo, sueldo, legajo);
        this.horasVuelosP = horasVuelosP;
        this.licenciaVuelosP = licenciaVuelosP;
    }

    public Piloto(){

    }

    //GETTER

    public int getHorasVuelosP() {
        return horasVuelosP;
    }

    public String getLicenciaVuelosP() {
        return licenciaVuelosP;
    }

    //SETTER

    public void setHorasVuelosP(int horasVuelosP) {
        this.horasVuelosP = horasVuelosP;
    }

    public void setLicenciaVuelosP(String licenciaVuelosP) {
        this.licenciaVuelosP = licenciaVuelosP;
    }

    //METODOS

    @Override
    public String toString() {
        return "Piloto{" +
                "horasVuelosP=" + horasVuelosP +
                ", licenciaVuelosP='" + licenciaVuelosP  + super.toString() +
                '}';
    }
}
