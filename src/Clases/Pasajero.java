package Clases;
import Enumeradores.TipoEstadoCheckIn;
import GestionDeMenues.GestionPasajero;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pasajero extends Usuario {

    //ATRIBUTOS
    private String numPasaporte;
    TipoEstadoCheckIn estadoCheckIN ;
    List<TicketsDeReserva>reservasPasajero;

    public Pasajero(String email, String contrasenia, String numPasaporte, TipoEstadoCheckIn estadoCheckIN, List<TicketsDeReserva> reservasPasajero) throws JSONException {
        super(email, contrasenia);
        this.numPasaporte = numPasaporte;
        this.estadoCheckIN = estadoCheckIN;
        this.reservasPasajero = new ArrayList<>();
    }

    public Pasajero()
    {

    }

    public List<TicketsDeReserva> getReservasPasajero() {
        return reservasPasajero;
    }

    public void setReservasPasajero(List<TicketsDeReserva> reservasPasajero) {
        this.reservasPasajero = reservasPasajero;
    }

    public Pasajero(String numPasaporte, TipoEstadoCheckIn estadoCheckIN) {
        this.numPasaporte = numPasaporte;

        this.estadoCheckIN = TipoEstadoCheckIn.PENDIENTE;
    }

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
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
        return Objects.equals(getNumPasaporte(), pasajero.getNumPasaporte()) && getEstadoCheckIN() == pasajero.getEstadoCheckIN();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumPasaporte(), getEstadoCheckIN());
    }
}


