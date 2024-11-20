package Menues;

import Clases.*;
import GestionDeMenues.*;
import GestionDeMenues.GestionAdministrador;
import GestionJSON.GestionJSON;
import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAdministrador {

    public void mostrarMenu() throws JSONException{

        GestionAdministrador gestorAdmin = new GestionAdministrador();
        Scanner scanner = new Scanner(System.in);
        Administrador a = new Administrador();
        // List<Vuelo> listaVuelos= GestionJSON.mapeoVuelo();
        // List<TicketsDeReserva> ticketsDeReservas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("=== Menú Administrador ===");
            System.out.println("1. Ver lista de vuelos");
            System.out.println("2. Eliminar un usuario");
            System.out.println("3. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1:
                    gestorAdmin.listarVuelos();
                    break;
                case 2:
                    System.out.println("Eliminando un usuario...");
                    break;
                case 3:
                    System.out.println("Volver al menu principal");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }
}
