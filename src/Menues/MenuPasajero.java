package Menues;

import Clases.Pasajero;
import Clases.Vuelo;
import Excepciones.ReadFail;
import org.json.JSONException;
import GestionJSON.*;
import java.util.List;
import java.util.Scanner;

public class MenuPasajero {

    public void switchPasajero() throws JSONException {
        List<Vuelo>listaVuelo=GestionJSON.mapeoVuelo();
        Pasajero pasajero = new Pasajero();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ELIGE UNA OPCION");
        System.out.println("1: Mira lista de vuelos disponibles ");
        System.out.println("2: Comprar vuelos disponibles");
        System.out.println("3: Modificar datos personales");
        System.out.println("4: Mostrar datos personales" );
        System.out.println("5: Cancelacion de vuelo adquirido");
        String opc=scanner.nextLine();
        switch (opc)
        {
            case "1":
               pasajero.lecturaDeListaVuelo();
                break;
            case "2":
                pasajero.compraDeVuelo(listaVuelo);
                break;
            case "3":
                pasajero.modifcarDatosPersonales();
                break;
            case "4":
                pasajero.mostrarDatosPersonales();
                break;
            case "5":
                pasajero.cancelacionDeVuelo();
                break;
            case "6":
                break;
            default:
                System.out.println("Opcion Incorrecta,INTENTE NUEVAMENTE");
                break;
        }
    }

}
