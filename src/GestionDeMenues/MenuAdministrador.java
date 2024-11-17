package GestionDeMenues;

import java.util.Scanner;

public class MenuAdministrador {


        public static void mostrarMenu(Scanner scanner) {
            int opcion;

            do {
                System.out.println("=== Menú Administrador ===");
                System.out.println("1. Ver lista de vuelos");
                System.out.println("2. Agregar un nuevo vuelo");
                System.out.println("3. Modificar un vuelo");
                System.out.println("4. Eliminar un vuelo");
                System.out.println("5. Volver al menú principal");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.println("Mostrando lista de vuelos...");
                        // Lógica para ver lista de vuelos
                        break;
                    case 2:
                        System.out.println("Agregando un nuevo vuelo...");
                        // Lógica para agregar un vuelo
                        break;
                    case 3:
                        System.out.println("Modificando un vuelo...");
                        // Lógica para modificar un vuelo
                        break;
                    case 4:
                        System.out.println("Eliminando un vuelo...");
                        // Lógica para eliminar un vuelo
                        break;
                    case 5:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 5);
        }
    }
