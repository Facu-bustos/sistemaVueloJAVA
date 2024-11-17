package GestionDeMenues;

import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.Scanner;

public class GestionVuelo {

    private Scanner scanner = new Scanner(System.in);

    // MOSTRADO DE INFORMACION DE UN VUELO

    public static void mostrarInformacionVuelo(JSONObject vuelo) throws JSONException {

        int idVuelo = vuelo.getInt("idVuelo");
        String origen = vuelo.getString("origen");
        String destino = vuelo.getString("destino");
        String horaSalida = vuelo.getString("horaSalida");
        String horaLlegada = vuelo.getString("horaLlegada");
        String duracion = vuelo.getString("duracion");
        double precio = vuelo.getDouble("precio");
        int cantidadDisponible = vuelo.getInt("cantidadDisponible");
        String aerolinea = vuelo.getString("aerolinea");
        String clase = vuelo.getString("clase");
        String numeroVuelo = vuelo.getString("numeroVuelo");
        JSONArray escalas = vuelo.getJSONArray("escalas");
        String tipoVuelo = vuelo.getString("tipoVuelo");
        String estadoVuelo = vuelo.getString("estadoVuelo");

        System.out.println("ID Vuelo: " + idVuelo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Hora de Salida: " + horaSalida);
        System.out.println("Hora de Llegada: " + horaLlegada);
        System.out.println("Duración: " + duracion);
        System.out.println("Precio: $" + precio);
        System.out.println("Asientos Disponibles: " + cantidadDisponible);
        System.out.println("Aerolínea: " + aerolinea);
        System.out.println("Clase: " + clase);
        System.out.println("Número de Vuelo: " + numeroVuelo);
        System.out.println("Tipo de Vuelo: " + tipoVuelo);
        System.out.println("Estado: " + estadoVuelo);

        if (escalas.length() > 0) {
            System.out.println("Escalas:");
            for (int i = 0; i < escalas.length(); i++) {
                JSONObject escala = escalas.getJSONObject(i);
                String ciudad = escala.getString("ciudad");
                String tiempoEscala = escala.getString("tiempoEscala");
                System.out.println(" - Ciudad: " + ciudad + ", Tiempo: " + tiempoEscala);
            }
        } else {
            System.out.println("Escalas: Sin escalas");
        }

        System.out.println("----------------------------");
    }

    // RESERVACION DE VUELO

    public void reservarVuelo() throws JSONException {
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));
        JSONArray reservasArray = new JSONArray(JSONUtiles.leer("reservas.json"));

        System.out.print("Ingrese el ID del vuelo que desea reservar: ");
        int idVuelo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        JSONObject vueloSeleccionado = null;
        for (int i = 0; i < vuelosArray.length(); i++) {
            JSONObject vuelo = vuelosArray.getJSONObject(i);
            if (vuelo.getInt("idVuelo") == idVuelo) {
                vueloSeleccionado = vuelo;
                break;
            }
        }

        if (vueloSeleccionado == null) {
            System.out.println("Vuelo no encontrado.");
            return;
        }

        System.out.print("Ingrese el email del pasajero: ");
        String emailPasajero = scanner.nextLine();

        System.out.print("Ingrese la cantidad de asientos a reservar: ");
        int cantidadAsientos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (cantidadAsientos > vueloSeleccionado.getInt("cantidadDisponible")) {
            System.out.println("No hay suficientes asientos disponibles.");
            return;
        }

        // Crear reserva
        JSONObject nuevaReserva = new JSONObject();
        nuevaReserva.put("idReserva", reservasArray.length() + 1);
        nuevaReserva.put("vuelo", vueloSeleccionado);
        nuevaReserva.put("pasajero", emailPasajero);
        nuevaReserva.put("fechaReserva", new Date().toString());
        nuevaReserva.put("estadoReserva", "CONFIRMADA");
        nuevaReserva.put("cantidadAsientos", cantidadAsientos);
        nuevaReserva.put("precioTotal", cantidadAsientos * vueloSeleccionado.getDouble("precio"));

        // Actualizar asientos disponibles
        vueloSeleccionado.put("cantidadDisponible",
                vueloSeleccionado.getInt("cantidadDisponible") - cantidadAsientos);

        // Guardar cambios
        reservasArray.put(nuevaReserva);
        JSONUtiles.grabarArray(vuelosArray); // Actualizar vuelos.json
        JSONUtiles.grabarArray(reservasArray); // Actualizar reservas.json

        System.out.println("Reserva creada exitosamente.");
    }

}
