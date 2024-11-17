package GestionDeMenues;

import Clases.Vuelo;
import JSONutiles.JSONUtiles;
import Menues.MenuAdministrador;
import Menues.MenuAgenteVentas;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAdministrador {

    private Scanner scanner = new Scanner(System.in);

    // LISTA DE VUELOS

    public void listarVuelos() throws JSONException {

        System.out.println("=== Lista de Vuelos ===");

        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

        for (int i = 0; i < vuelosArray.length(); i++) {
            JSONObject vueloJson = vuelosArray.getJSONObject(i);

            Vuelo vuelo = new Vuelo(
                    vueloJson.getInt("idVuelo"),
                    vueloJson.getString("origen"),
                    vueloJson.getString("destino"),
                    vueloJson.getString("horaSalida"),
                    vueloJson.getString("horaLlegada"),
                    vueloJson.getString("duracion"),
                    vueloJson.getDouble("precio"),
                    vueloJson.getInt("cantidadDisponible"),
                    vueloJson.getString("aerolinea"),
                    vueloJson.getString("clase"),
                    vueloJson.getString("numeroVuelo"),
                    new ArrayList<>(), // Por ahora vacía, puedes adaptar para leer las escalas
                    vueloJson.getString("tipoVuelo"),
                    vueloJson.getString("estadoVuelo")
            );

            System.out.println(vuelo);
        }
    }

    // AGREGADO DE VUELO

    public void agregarVuelo() throws JSONException {
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

        System.out.print("Ingrese el origen: ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese el destino: ");
        String destino = scanner.nextLine();
        System.out.print("Ingrese la hora de salida: ");
        String horaSalida = scanner.nextLine();
        System.out.print("Ingrese la hora de llegada: ");
        String horaLlegada = scanner.nextLine();
        System.out.print("Ingrese la duración: ");
        String duracion = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la aerolínea: ");
        String aerolinea = scanner.nextLine();

        // Crear un nuevo objeto JSON para el vuelo
        JSONObject nuevoVuelo = new JSONObject();
        nuevoVuelo.put("idVuelo", vuelosArray.length() + 1); // ID basado en el tamaño actual
        nuevoVuelo.put("origen", origen);
        nuevoVuelo.put("destino", destino);
        nuevoVuelo.put("horaSalida", horaSalida);
        nuevoVuelo.put("horaLlegada", horaLlegada);
        nuevoVuelo.put("duracion", duracion);
        nuevoVuelo.put("precio", precio);
        nuevoVuelo.put("cantidadDisponible", 100); // Por defecto
        nuevoVuelo.put("aerolinea", aerolinea);
        nuevoVuelo.put("clase", "Económica");
        nuevoVuelo.put("numeroVuelo", "V-" + (vuelosArray.length() + 1));
        nuevoVuelo.put("escalas", new JSONArray());
        nuevoVuelo.put("tipoVuelo", "Directo");
        nuevoVuelo.put("estadoVuelo", "Activo");

        // Agregar el nuevo vuelo al array y guardar en el archivo
        vuelosArray.put(nuevoVuelo);
        JSONUtiles.grabarArray(vuelosArray);

        System.out.println("Vuelo agregado exitosamente.");
    }

    // MODIFICACION DE VUELO

    public void modificarVuelo() throws JSONException {
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

        listarVuelos();
        System.out.print("Ingrese el ID del vuelo a modificar: ");
        int idVuelo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        boolean encontrado = false;

        for (int i = 0; i < vuelosArray.length(); i++) {
            JSONObject vueloJson = vuelosArray.getJSONObject(i);

            if (vueloJson.getInt("idVuelo") == idVuelo) {
                System.out.print("Ingrese el nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer

                vueloJson.put("precio", nuevoPrecio);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            JSONUtiles.grabarArray(vuelosArray);
            System.out.println("Vuelo modificado correctamente.");
        } else {
            System.out.println("Vuelo no encontrado.");
        }
    }

    // ELIMINACION DE VUELO

    public void eliminarVuelo() throws JSONException {
        JSONArray vuelosArray = new JSONArray(JSONUtiles.leer("vuelos.json"));

        listarVuelos();
        System.out.print("Ingrese el ID del vuelo a eliminar: ");
        int idVuelo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        boolean encontrado = false;

        for (int i = 0; i < vuelosArray.length(); i++) {
            JSONObject vueloJson = vuelosArray.getJSONObject(i);

            if (vueloJson.getInt("idVuelo") == idVuelo) {
                vuelosArray.remove(i);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            JSONUtiles.grabarArray(vuelosArray);
            System.out.println("Vuelo eliminado correctamente.");
        } else {
            System.out.println("Vuelo no encontrado.");
        }
    }

    // LLAMADO A ADMINISTRADOR PARA MOSTRAR MENU

    public void llamadoAdministrador() throws JSONException {
        MenuAdministrador MA = new MenuAdministrador();
        MA.mostrarMenu();
    }



}
