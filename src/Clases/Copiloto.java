package Clases;

import Enumeradores.TipoTripulante;

public class Copiloto extends Tripulante{

    //ATRIBUTOS

    private int horasVuelosCP;
    private String licenciaVuelosCP;

    //CONSTRUCTOR

    public Copiloto(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo, int horasVuelosCP, String licenciaVuelosCP) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre, tipoTripulante, cargo, legajo, sueldo);
        this.horasVuelosCP = horasVuelosCP;
        this.licenciaVuelosCP = licenciaVuelosCP;
    }

    public Copiloto(int horasVuelosCP, String licenciaVuelosCP) {
        this.horasVuelosCP = horasVuelosCP;
        this.licenciaVuelosCP = licenciaVuelosCP;
    }

    public Copiloto(TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo, int horasVuelosCP, String licenciaVuelosCP) {
        super(tipoTripulante, cargo, legajo, sueldo);
        this.horasVuelosCP = horasVuelosCP;
        this.licenciaVuelosCP = licenciaVuelosCP;
    }

    public Copiloto(){

    }

    //GETTER

    public int getHorasVuelosCP() {
        return horasVuelosCP;
    }

    public String getLicenciaVuelosCP() {
        return licenciaVuelosCP;
    }

    //SETTER

    public void setHorasVuelosCP(int horasVuelosCP) {
        this.horasVuelosCP = horasVuelosCP;
    }

    public void setLicenciaVuelosCP(String licenciaVuelosCP) {
        this.licenciaVuelosCP = licenciaVuelosCP;
    }

    //METODOS

    @Override
    public String toString() {
        return "Copiloto{" +
                "horasVuelosCP=" + horasVuelosCP +
                ", licenciaVuelosCP='" + licenciaVuelosCP  + super.toString() +
                '}';
    }
}
