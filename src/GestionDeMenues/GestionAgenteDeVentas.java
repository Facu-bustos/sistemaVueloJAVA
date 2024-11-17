package GestionDeMenues;

import JSONutiles.JSONUtiles;
import Menues.MenuAgenteVentas;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;
import java.util.Scanner;

public class GestionAgenteDeVentas {

    private Scanner scanner = new Scanner(System.in);

    // BUSCADOR DE VUELO POR DESTINO Y ORIGEN

    public static void buscarVueloPorDestinoUOrigen(Scanner scanner) throws JSONException {
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

        System.out.print("Ingrese el origen o destino del vuelo: ");
        String criterio = scanner.nextLine().toLowerCase();

        System.out.println("=== Resultados de Búsqueda ===");
        boolean encontrado = false;

        for (int i = 0; i < vuelosArray.length(); i++) {
            JSONObject vuelo = vuelosArray.getJSONObject(i);
            String origen = vuelo.getString("origen").toLowerCase();
            String destino = vuelo.getString("destino").toLowerCase();

            if (origen.contains(criterio) || destino.contains(criterio)) {
                GestionVuelo.mostrarInformacionVuelo(vuelo);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron vuelos que coincidan con el criterio.");
        }
    }

    // CANCELACION DE RESERVA

    public void cancelarReserva(Scanner scanner) throws JSONException {
        // Leer el archivo JSON de reservas y vuelos
        JSONArray reservasArray = new JSONArray(JSONUtiles.leer("reservas.json"));
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

        System.out.print("Ingrese el ID de la reserva a cancelar: ");
        int idReserva = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        JSONObject reservaCancelada = null;

        // Buscar y eliminar la reserva
        for (int i = 0; i < reservasArray.length(); i++) {
            JSONObject reserva = reservasArray.getJSONObject(i);
            if (reserva.getInt("idReserva") == idReserva) {
                reservaCancelada = reserva;
                reservasArray.remove(i); // Eliminar la reserva del JSON
                break;
            }
        }

        if (reservaCancelada == null) {
            System.out.println("Reserva no encontrada.");
            return;
        }

        // Actualizar asientos disponibles en el vuelo correspondiente
        int idVuelo = reservaCancelada.getJSONObject("vuelo").getInt("idVuelo");
        for (int i = 0; i < vuelosArray.length(); i++) {
            JSONObject vuelo = vuelosArray.getJSONObject(i);
            if (vuelo.getInt("idVuelo") == idVuelo) {
                int asientosDevueltos = reservaCancelada.getInt("cantidadAsientos");
                vuelo.put("cantidadDisponible", vuelo.getInt("cantidadDisponible") + asientosDevueltos);
                break;
            }
        }
        // Guardar los cambios en los archivos JSON
        JSONUtiles.grabarArray(reservasArray); // Actualizar reservas.json
        JSONUtiles.grabarArray(vuelosArray);  // Actualizar vuelos.json

        System.out.println("Reserva cancelada exitosamente.");
    }

    // LISTA DE RESERVAS

    public void verReservas() throws JSONException {
        JSONArray reservasArray = new JSONArray(JSONUtiles.leer("reservas.json"));

        if (reservasArray.length() == 0) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        System.out.println("=== Listado de Reservas ===");
        for (int i = 0; i < reservasArray.length(); i++) {
            JSONObject reserva = reservasArray.getJSONObject(i);

            int idReserva = reserva.getInt("idReserva");
            JSONObject pasajero = reserva.getJSONObject("pasajero");
            String nombrePasajero = pasajero.getString("nombre");
            JSONObject vuelo = reserva.getJSONObject("vuelo");
            String origen = vuelo.getString("origen");
            String destino = vuelo.getString("destino");
            String fechaReserva = reserva.getString("fechaReserva");
            String estadoReserva = reserva.getString("estadoReserva");
            int cantidadAsientos = reserva.getInt("cantidadAsientos");
            double precioTotal = reserva.getDouble("precioTotal");

            System.out.println("ID Reserva: " + idReserva);
            System.out.println("Pasajero: " + nombrePasajero);
            System.out.println("Origen: " + origen + " | Destino: " + destino);
            System.out.println("Fecha de Reserva: " + fechaReserva);
            System.out.println("Estado: " + estadoReserva);
            System.out.println("Cantidad de Asientos: " + cantidadAsientos);
            System.out.println("Precio Total: $" + precioTotal);
            System.out.println("----------------------------");
        }

    }

    // LLAMADO A AGENTE DE VENTAS PARA MOSTRAR MENU

    public void llamadoAgenteVentas() throws JSONException {
        MenuAgenteVentas MAdV = new MenuAgenteVentas();
        MAdV.mostrarMenu();
    }

}



