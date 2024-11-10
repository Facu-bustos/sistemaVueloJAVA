package Clases;

import Enumeradores.TipoTripulante;

public class Piloto extends Tripulante{

    //ATRIBUTOS

    private int horasVuelosP;
    private String licenciaVuelosP;

    //CONSTRUCTOR


    public Piloto(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo, int horasVuelosP, String licenciaVuelosP) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre, tipoTripulante, cargo, legajo, sueldo);
        this.horasVuelosP = horasVuelosP;
        this.licenciaVuelosP = licenciaVuelosP;
    }

    public Piloto(int horasVuelosP, String licenciaVuelosP) {
        this.horasVuelosP = horasVuelosP;
        this.licenciaVuelosP = licenciaVuelosP;
    }

    public Piloto(TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo, int horasVuelosP, String licenciaVuelosP) {
        super(tipoTripulante, cargo, legajo, sueldo);
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
