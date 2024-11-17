package GestionDeMenues;

import Clases.Reserva;
import Clases.Vuelo;
import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestionReserva {

    private List<Reserva> reservas;

    public GestionReserva(List<Reserva> reservas) {
        this.reservas = new ArrayList<>();
    }
    private void reservarVuelo(Scanner scanner) throws JSONException {
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));
        JSONArray reservasArray = new JSONArray(JSONUtiles.leer("reservas.json"));


        System.out.print("Ingrese el ID del vuelo que desea reservar: ");
        int idVuelo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        JSONObject vueloJson = null;

        for (int i = 0; i < vuelosArray.length(); i++) {
            if (vuelosArray.getJSONObject(i).getInt("idVuelo") == idVuelo) {
                vueloJson = vuelosArray.getJSONObject(i);
                break;
            }
        }

        if (vueloJson == null) {
            System.out.println("Vuelo no encontrado.");
            return;
        }

        System.out.print("Ingrese la cantidad de asientos a reservar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        if (vueloJson.getInt("cantidadDisponible") < cantidad) {
            System.out.println("No hay suficientes asientos disponibles.");
            return;
        }

        vueloJson.put("cantidadDisponible", vueloJson.getInt("cantidadDisponible") - cantidad);

        JSONObject nuevaReserva = new JSONObject();
        nuevaReserva.put("idReserva", reservasArray.length() + 1);
        nuevaReserva.put("vuelo", vueloJson.getInt("idVuelo"));
        nuevaReserva.put("pasajero", usuarioActual.getEmail());
        nuevaReserva.put("fechaReserva", new Date().toString());
        nuevaReserva.put("estadoReserva", "Confirmada");
        nuevaReserva.put("cantidadAsientos", cantidad);
        nuevaReserva.put("precioTotal", cantidad * vueloJson.getDouble("precio"));

        reservasArray.put(nuevaReserva);
        JSONUtiles.grabarArray(reservasArray);
        JSONUtiles.grabarArray(vuelosArray);

        System.out.println("Reserva creada exitosamente.");
    }
}
