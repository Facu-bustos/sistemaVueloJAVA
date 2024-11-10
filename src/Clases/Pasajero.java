package Clases;

import Enumeradores.TipoEstadoCheckIn;
import Enumeradores.TipoPasajero;

import java.util.List;
import java.util.Objects;

public class Pasajero extends Usuario {

    //ATRIBUTOS

    private String numPasaporte;
    private TipoPasajero tipoPasajero;
    private TipoEstadoCheckIn estadoCheckIn;

    //CONSTRUCTOR

    public Pasajero(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, List<Vuelo> listaVuelos, String numPasaporte, TipoPasajero tipoPasajero, TipoEstadoCheckIn estadoCheckIn) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, email, contrasenia, listaVuelos);
        this.numPasaporte = numPasaporte;
        this.tipoPasajero = tipoPasajero;
        this.estadoCheckIn = estadoCheckIn;
    }

    // GETTER

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    public TipoEstadoCheckIn getEstadoCheckIn() {
        return estadoCheckIn;
    }

    // SETTER

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public void setTipoPasajero(TipoPasajero tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    public void setEstadoCheckIn(TipoEstadoCheckIn estadoCheckIn) {
        this.estadoCheckIn = estadoCheckIn;
    }

    // METODOS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero pasajero)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(numPasaporte, pasajero.numPasaporte) && tipoPasajero == pasajero.tipoPasajero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPasaporte, tipoPasajero);
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "numPasaporte='" + numPasaporte + '\'' +
                ", tipoPasajero=" + tipoPasajero +
                "} " + super.toString();
    }
}


