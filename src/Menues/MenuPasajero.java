package Menues;

import Clases.Vuelo;
import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Scanner;

import static GestionDeMenues.GestionVuelo.mostrarInformacionVuelo;

public class MenuPasajero {

    public static void mostrarMenu() throws JSONException {

        List<Vuelo> listaVuelo = GestionJSON.mapeoVuelo();
        Pasajero pasajero = new Pasajero();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        int opcionCase5;

        do {
            System.out.println("=== Menú Pasajero ===");
            System.out.println("1. Ver vuelos disponibles");
            System.out.println("2. Realizar una reserva");
            System.out.println("3. Realizar Check-In");
            System.out.println("4. Ver estado Check-In");
            System.out.println("5. Cancelar una reserva");
            System.out.println("6. Ver mis reservas");
            System.out.println("7. Ver mi historial de vuelos");
            System.out.println("8. Ver Mi Perfil");
            System.out.println("9. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    pasajero.lecturaDeListaVuelo();
                    break;
                case 2:
                    pasajero.compraDeVuelo(listaVuelo);
                    break;
                case 3:
                    System.out.println("Realizando Check-In...");
                    break;
                case 4:
                    System.out.println("Mostrando estado Check-In...");
                    break;
                case 5:
                    System.out.println("Cancelando una reserva...");
                    // Lógica para cancelar una reserva
                    break;
                case 6:
                    System.out.println("Mostrando mis reservas...");
                    // Lógica para ver reservas del pasajero
                    break;
                case 7:
                    System.out.println("Mostrando historial de vuelos...");
                    break;
                case 8:
                    do {
                        System.out.println("=== Menu Mi Perfil ===");
                        System.out.println("1. Ver informacion personal");
                        System.out.println("2. Modificar informacion personal");
                        System.out.println("3. Modificar informacion de seguridad (password)");

                        opcionCase5 = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        switch (opcionCase5) {
                            case 1:
                                System.out.println("Mostrando info personal...");
                            case 2:
                                System.out.println("Modificando info personal...");
                            case 3:
                                System.out.println("Modificando informacion de seguridad...");
                        }
                    } while (opcionCase5 != 3);
                case 9:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }
        /*public static void verVuelosDisponibles() throws JSONException {
            JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

            if (vuelosArray.length() == 0) {
                System.out.println("No hay vuelos disponibles en este momento.");
                return;
            }

            System.out.println("=== Vuelos Disponibles ===");
            for (int i = 0; i < vuelosArray.length(); i++) {
                JSONObject vuelo = vuelosArray.getJSONObject(i);
                if (vuelo.getInt("cantidadDisponible") > 0) { // Solo mostrar vuelos con asientos disponibles
                    mostrarInformacionVuelo(vuelo);
                }
            }
        }*/

   /* public static void mostrarMenu(Scanner scanner) throws JSONException {
        int opcion;

        do {
            System.out.println("=== Menú Pasajero ===");
            System.out.println("1. Ver vuelos disponibles");
            System.out.println("2. Realizar una reserva");
            System.out.println("3. Cancelar una reserva");
            System.out.println("4. Ver mis reservas");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando vuelos disponibles...");
                    verVuelosDisponibles ();
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
                    System.out.println("Mostrando mis reservas...");
                    // Lógica para ver reservas del pasajero
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    public static void verVuelosDisponibles() throws JSONException {
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

        if (vuelosArray.length() == 0) {
            System.out.println("No hay vuelos disponibles en este momento.");
            return;
        }

        System.out.println("=== Vuelos Disponibles ===");
        for (int i = 0; i < vuelosArray.length(); i++) {
            JSONObject vuelo = vuelosArray.getJSONObject(i);
            if (vuelo.getInt("cantidadDisponible") > 0) { // Solo mostrar vuelos con asientos disponibles
                mostrarInformacionVuelo(vuelo);
            }
        }
    }


    */
}

