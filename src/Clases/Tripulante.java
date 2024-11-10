package Clases;

import Enumeradores.TipoTripulante;

import java.lang.classfile.TypeAnnotation;

public class Tripulante extends Persona {

    //ATRIBUTOS

    private TipoTripulante tipoTripulante;
    private String cargo;
    private float sueldo;
    private String legajo;

    //CONSTRUCTOR

    public Tripulante(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre);
        this.tipoTripulante = tipoTripulante;
        this.cargo = cargo;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public Tripulante(TipoTripulante tipoTripulante, String cargo, String legajo, float sueldo) {
        this.tipoTripulante = tipoTripulante;
        this.cargo = cargo;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public Tripulante(){

    }

    //GETTER

    public TipoTripulante getTipoTripulante() {
        return tipoTripulante;
    }

    public String getLegajo() {
        return legajo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    //SETTER

    public void setTipoTripulante(TipoTripulante tipoTripulante) {
        this.tipoTripulante = tipoTripulante;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //METODOS

    @Override
    public String toString() {
        return "Tripulante{" +
                "tipoTripulante=" + tipoTripulante +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                ", legajo='" + legajo  + super.toString() +
                '}';
    }
}
