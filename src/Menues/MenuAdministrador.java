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

        List<Usuario>listaUsuarios=GestionJSON.mapeoListaUsuarios();
        List<Vuelo> listaVuelos= GestionJSON.mapeoVuelo();
        List<Vuelo>reprogramados = new ArrayList<>();
        GestionAdministrador gestorAdmin = new GestionAdministrador();
        Scanner scanner = new Scanner(System.in);


        int opcion;

        do {
            System.out.println("=== Menú Administrador ===");
            System.out.println("1. Ver lista de vuelos");
            System.out.println("2. Ver lista de usuarios");
            System.out.println("3. Eliminar un usuario");
            System.out.println("4. Eliminar vuelos");
            System.out.println("5.Actualizar lista de vuelos");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1:
                    gestorAdmin.lecturaDeArraylistaVuelos(listaVuelos);
                    break;
                case 2:
                    gestorAdmin.listarUsuarios(listaUsuarios);
                    break;
                case 3:
                    gestorAdmin.eliminarUsuarios(listaUsuarios);
                    break;
                case 4:
                    List<Vuelo>reprogramacion= gestorAdmin.eliminarVuelosProgramados(listaVuelos);
                    reprogramados.addAll(reprogramacion);
                    break;
                case 5:
                    GestionJSON.createJSONVuelosReprogramados(reprogramados);
                    break;
                case 6:
                    System.out.println("6. Volviendo al menu PRINCIPAL");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }
}
