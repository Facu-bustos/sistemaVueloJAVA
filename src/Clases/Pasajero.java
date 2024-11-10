package Clases;

import Enumeradores.TipoPasajero;

public class Pasajero extends Usuario {

    //ATRIBUTOS

    private String numPasaporte;
    private TipoPasajero tipoPasajero;

    //CONSTRUCTOR

    public Pasajero(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, String email, String contrasenia, String numPasaporte, TipoPasajero tipoPasajero) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre, email, contrasenia);
        this.numPasaporte = numPasaporte;
        this.tipoPasajero = tipoPasajero;
    }

    public Pasajero(String email, String contrasenia, String numPasaporte, TipoPasajero tipoPasajero) {
        super(email, contrasenia);
        this.numPasaporte = numPasaporte;
        this.tipoPasajero = tipoPasajero;
    }

    public Pasajero(String numPasaporte, TipoPasajero tipoPasajero) {
        this.numPasaporte = numPasaporte;
        this.tipoPasajero = tipoPasajero;
    }

    public Pasajero(){

    }

    //GETTER

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    //SETTER

    public void setTipoPasajero(TipoPasajero tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    //METODOS

    @Override
    public String toString() {
        return "Pasajero{" +
                "numPasaporte='" + numPasaporte + '\'' +
                ", tipoPasajero=" + tipoPasajero  + super.toString() +
                '}';
    }


}


