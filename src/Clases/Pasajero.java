package Clases;
import Enumeradores.TipoEstadoCheckIn;
import GestionDeMenues.GestionPasajero;
import GestionJSON.GestionJSON;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Pasajero extends Usuario {

    //ATRIBUTOS
    private String numPasaporte;
    TipoEstadoCheckIn estadoCheckIN ;
    List<TicketsDeReserva>reservasPasajero;

    public Pasajero(String email, String contrasenia, String rol, String numPasaporte, TipoEstadoCheckIn estadoCheckIN, List<TicketsDeReserva> reservasPasajero) {
        super(email, contrasenia, rol);
        this.numPasaporte = numPasaporte;
        this.estadoCheckIN = estadoCheckIN;
        this.reservasPasajero = reservasPasajero;
    }

    public Pasajero(String numPasaporte, TipoEstadoCheckIn estadoCheckIN, List<TicketsDeReserva> reservasPasajero) {
        this.numPasaporte = numPasaporte;
        this.estadoCheckIN = TipoEstadoCheckIn.PENDIENTE;
        this.reservasPasajero = reservasPasajero;
    }

    public Pasajero(String email, String contrasenia, String numPasaporte, TipoEstadoCheckIn estadoCheckIN, List<TicketsDeReserva> reservasPasajero) {
        super(email, contrasenia);
        this.numPasaporte = numPasaporte;
        this.estadoCheckIN = TipoEstadoCheckIn.PENDIENTE;
        this.reservasPasajero = reservasPasajero;
    }

    public Pasajero() {

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
    @Override
    public String toString() {
        return "Pasajero{" +
                "numPasaporte='" + numPasaporte + '\'' +
                ", estadoCheckIN=" + estadoCheckIN +
                ", reservasPasajero=" + reservasPasajero +
                "} " + super.toString();
    }

    public String CheckIN()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Número de Pasaporte:");
        String numeroPasaporte;
        while (true) {
            numeroPasaporte = sc.nextLine().trim();

            // Validamos que sean solo numeros,
            // es una expresion regular que valida que solo haya digitos del 0 a 9
            if (numeroPasaporte.matches("\\d+")) {
                this.numPasaporte=numeroPasaporte;
                break; // Salir del bucle si es válido
            } else {
                System.out.println("Error: El número de pasaporte debe contener solo números. Intente nuevamente:");
            }
        }

        //ACA HACEMOS UNA DOBLE VALIDACION
        //EL NUMERO DE PASAPORTE QUE ASIGNAMOS ES EL CORRECTO COMPARA
        //Y CAMBIAMOS EL ESTADO DEL CHECK IN A REALIZADO.
        if (this.numPasaporte.equals(numeroPasaporte)) {
            if (this.estadoCheckIN == TipoEstadoCheckIn.PENDIENTE) {
                this.estadoCheckIN = TipoEstadoCheckIn.REALIZADO;
                System.out.println("Check-in realizado con éxito.");
            } else {
                System.out.println("El check-in ya fue realizado.");
            }
        } else {
            System.out.println("Número de pasaporte incorrecto.");
        }
        return this.numPasaporte;
    }
}


