package Clases;
import Enumeradores.TipoEstadoCheckIn;
import Enumeradores.TipoPasajero;
import Excepciones.ReadFail;
import org.json.JSONException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import GestionJSON.*;

import static GestionJSON.GestionJSON.createJSON;

public class Pasajero extends Usuario {

    //ATRIBUTOS
    private String numPasaporte;
    private TipoPasajero tipoPasajero;
    TipoEstadoCheckIn estadoCheckIN ;

    public Pasajero(String email, String contrasenia, String numPasaporte, TipoPasajero tipoPasajero, TipoEstadoCheckIn estadoCheckIN) throws JSONException {
        super(email, contrasenia);
        this.numPasaporte = numPasaporte;
        this.tipoPasajero = tipoPasajero;
        this.estadoCheckIN = estadoCheckIN;
    }

    public Pasajero(String numPasaporte, TipoPasajero tipoPasajero, TipoEstadoCheckIn estadoCheckIN) {
        this.numPasaporte = numPasaporte;
        this.tipoPasajero = tipoPasajero;
        this.estadoCheckIN = TipoEstadoCheckIn.PENDIENTE;
    }

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(TipoPasajero tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    public TipoEstadoCheckIn getEstadoCheckIN() {
        return estadoCheckIN;
    }

    public void setEstadoCheckIN(TipoEstadoCheckIn estadoCheckIN) {
        this.estadoCheckIN = estadoCheckIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero pasajero)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getNumPasaporte(), pasajero.getNumPasaporte()) && getTipoPasajero() == pasajero.getTipoPasajero() && getEstadoCheckIN() == pasajero.getEstadoCheckIN();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumPasaporte(), getTipoPasajero(), getEstadoCheckIN());
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "numPasaporte='" + numPasaporte + '\'' +
                ", tipoPasajero=" + tipoPasajero +
                ", estadoCheckIN=" + estadoCheckIN +
                "} " + super.toString();
    }
}


