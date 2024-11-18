package Menues;

import Clases.TicketsDeReserva;
import Clases.Vuelo;
import GestionDeMenues.GestionAgenteDeVentas;
import GestionJSON.GestionJSON;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAgenteVentas {

    public void mostrarMenu() throws JSONException{
        Scanner scanner = new Scanner(System.in);
        GestionAgenteDeVentas GestorAdV = new GestionAgenteDeVentas();
        List<Vuelo>listaVuelos=GestionJSON.mapeoVuelo();
        List<TicketsDeReserva> ticketsDeReservas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("=== Menú Agente de Ventas ===");
            System.out.println("1. Ver vuelos disponibles");
            System.out.println("2. Realizar una reserva para un pasajero");
            System.out.println("3. Cancelar una reserva para un pasajero");
            System.out.println("4. Ver reservas de pasajeros");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    GestorAdV.lecturaDeArraylistaVuelos(listaVuelos);
                    break;
                case 2:
                    List<TicketsDeReserva>reservas=GestorAdV.comprarVuelo(listaVuelos);
                    ticketsDeReservas.addAll(reservas);
                    break;
                case 3:
                    GestorAdV.eliminarReserva(ticketsDeReservas);
                    break;
                case 4:
                    GestorAdV.mostrarReservas(ticketsDeReservas);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}

