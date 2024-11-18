package Menues;

import Clases.*;
import GestionDeMenues.*;
import GestionDeMenues.GestionAdministrador;
import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdministrador {

    public void mostrarMenu() throws JSONException{

        GestionAdministrador gestorAdmin = new GestionAdministrador();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Administrador ===");
            System.out.println("1. Ver lista de vuelos");
            System.out.println("2. Ver informacion de un vuelo en especifico");
            System.out.println("3. Agregar un nuevo vuelo");
            System.out.println("4. Modificar un vuelo");
            System.out.println("5. Eliminar un vuelo");
            System.out.println("6. Eliminar un usuario");
            System.out.println("7. Asignar tripulacion de empleados a un vuelo");
            System.out.println("8. Ver tripulacion de empleados de un vuelo");
            System.out.println("9. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestorAdmin.listarVuelos();
                    break;
                case 2:
                    System.out.println("Mostrando informacion de un vuelo especifico...");
                    break;
                case 3:
                    gestorAdmin.agregarVuelo();
                    break;
                case 4:
                    System.out.println("Modificando un vuelo...");
                    // Lógica para modificar un vuelo
                    break;
                case 5:
                    System.out.println("Eliminando un vuelo...");
                    // Lógica para eliminar un vuelo
                    break;
                case 6:
                    System.out.println("Eliminando un usuario...");
                    break;
                case 7:
                    System.out.println("Asignando tripulacion...");
                    break;
                case 8:
                    System.out.println("Mostrando tripulacion de vuelo...");
                    break;
                case 9:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);
    }
}
