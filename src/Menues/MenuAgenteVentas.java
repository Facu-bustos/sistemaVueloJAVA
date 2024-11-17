package Menues;

import Clases.*;
import GestionDeMenues.GestionAgenteDeVentas;
import GestionDeMenues.GestionVuelo;
import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.Scanner;

public class MenuAgenteVentas {

    public void mostrarMenu() throws JSONException{

        GestionAgenteDeVentas GestorAdV = new GestionAgenteDeVentas();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("=== Menú Agente de Ventas ===");
            System.out.println("1. Ver vuelos disponibles");
            System.out.println("2. Realizar una reserva para un pasajero");
            System.out.println("3. Cancelar una reserva para un pasajero");
            System.out.println("4. Ver reservas de pasajeros");
            System.out.println("5. Buscar vuelo por origen o destino");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando vuelos disponibles...");
                    // Lógica para mostrar vuelos disponibles
                    break;
                case 2:
                    System.out.println("Realizando una reserva...");
                    // Lógica para realizar una reserva
                    break;
                case 3:
                    System.out.println("Cancelando una reserva...");
                    // Lógica para cancelar una reserva
                    break;
                case 4:
                    System.out.println("Mostrando reservas de pasajeros...");
                    // Lógica para ver reservas
                    break;
                case 5:
                System.out.println("Buscando vuelo...");
                // Lógica para buscar vuelos
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }

}

