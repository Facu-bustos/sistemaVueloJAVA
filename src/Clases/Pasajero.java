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
    private TipoEstadoCheckIn estadoCheckIn;
    Scanner scanner;

    //CONSTRUCTOR

    public Pasajero(String email, String contrasenia) {
        super(email, contrasenia);
    }

    public Pasajero() {
        super();
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

    public TipoEstadoCheckIn getEstadoCheckIn() {
        return estadoCheckIn;
    }

    public void setEstadoCheckIn(TipoEstadoCheckIn estadoCheckIn) {
        this.estadoCheckIn = estadoCheckIn;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero pasajero)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(numPasaporte, pasajero.numPasaporte) && tipoPasajero == pasajero.tipoPasajero && estadoCheckIn == pasajero.estadoCheckIn && Objects.equals(scanner, pasajero.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPasaporte, tipoPasajero, estadoCheckIn, scanner);
    }

    public List<Vuelo> lecturaDeListaVuelo() throws JSONException
    {
        try {
        List<Vuelo>listaVuelo=GestionJSON.mapeoVuelo();
        System.out.print(listaVuelo);
            return listaVuelo;
        }catch (JSONException e)
        {
            throw new ReadFail("Lectura ERRONEA");
        }
    }


    @Override
    public String toString() {
        return "Pasajero{" +
                "numPasaporte='" + numPasaporte + '\'' +
                ", tipoPasajero=" + tipoPasajero +
                ", estadoCheckIn=" + estadoCheckIn +
                ", scanner=" + scanner +
                "} " + super.toString();
    }

    /*public static Integer compraDeVuelo(List<Vuelo>listaVuelo) throws JSONException {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Elija el ID del vuelo a comprar:");
        String id = scanner1.nextLine();
        Integer idBusqueda=null;
        // Verificamos si la entrada es un número
        if (!id.matches("\\d+")) {  // Verificamos que contenga solo dígitos
            System.out.println("Error: Debe ingresar un número válido.");
        } else {
            int idVuelo = Integer.parseInt(id);  // Convertir a número
            boolean encontrado = false;
            // buscamos el vuelo en la lista de vuelos , si hay coincidencia accedemos a persistir
            for (Vuelo v : listaVuelo) {
                if (v.getIdVuelo() == idVuelo) {
                    System.out.println("Vuelo encontrado:");
                    createJSON(idVuelo,listaVuelo);
                    System.out.println("Vuelo comprado:");
                    datosDelViajeAdquirido(idVuelo,listaVuelo);
                    encontrado = true;
                    idBusqueda=idVuelo;
                    break;
                }

            }
            if (!encontrado) {
                System.out.println("Error: No existe un vuelo con el ID " + idVuelo + ".");
            }
        }
        return idBusqueda;
    } */

}


