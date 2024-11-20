package Menues;

import Clases.*;
import GestionDeMenues.GestionPasajero;
import GestionJSON.GestionJSON;
import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import GestionDeMenues.*;

public class MenuPasajero {

    public void mostrarMenu() throws JSONException {
        Pasajero p = new Pasajero();
        Scanner scanner = new Scanner(System.in);
        GestionPasajero GP = new GestionPasajero();
        List<Vuelo>listaVuelos=GestionJSON.mapeoVuelo();
        List<TicketsDeReserva> tikectsDeReserva = new ArrayList<>();
        p.setReservasPasajero(tikectsDeReserva);
        int opcion;
        do {
            System.out.println("===== Menú Pasajero =====");
            System.out.println("1. Ver vuelos disponibles");
            System.out.println("2. Realizar una reserva");
            System.out.println("3. Ver mis reservas");
            System.out.println("4. Cancelar una reserva");
            System.out.println("5. Realizar CheckIN");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando lista de vuelos...");
                   /* GP.lecturaDeArraylistaVuelos(listaVuelos);*/
                    GP.lecturaVuelos(listaVuelos);
                    break;
                case 2:
                    System.out.println("Realizando reserva...");
                    List<TicketsDeReserva>reservas= GP.comprarVuelo(listaVuelos);
                    tikectsDeReserva.addAll(reservas);
                    break;
                case 3:
                    GP.mostrarReservas(tikectsDeReserva);
                    break;
                case 4:
                    GP.eliminarReserva(tikectsDeReserva);
                    break;
                case 5:
                    p.CheckIN(tikectsDeReserva);
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
        scanner.close();
    }

}

