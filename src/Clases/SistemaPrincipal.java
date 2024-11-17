package Clases;

import GestionDeMenues.MenuAdministrador;
import GestionDeMenues.MenuAgenteVentas;
import GestionDeMenues.MenuPasajero;
import GestionDeUsuario.GestionUsuario;

import java.util.Scanner;
import java.util.Scanner;

public class SistemaPrincipal {

    private static GestionUsuario gestionUsuario = new GestionUsuario();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Sistema de Gestión de Vuelos ===");
            System.out.println("1. Ingresar como Administrador");
            System.out.println("2. Ingresar como Pasajero");
            System.out.println("3. Ingresar como Agente de Ventas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    MenuAdministrador.mostrarMenu(scanner);
                    break;
                case 2:
                    MenuPasajero.mostrarMenu(scanner);
                    break;
                case 3:
                    MenuAgenteVentas.mostrarMenu(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();

        System.out.println("Inicio de sesión de administrador");
        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        // Intentar autenticar al administrador
        if (gestionUsuario.autenticarAdministrador(email, password)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido al sistema!");
            mostrarMenu(scanner); // Mostrar el menú de opciones
        } else {
            System.out.println("Error: Email o contraseña incorrectos.");
        }

        scanner.close();
    }

    private static void mostrarMenu(Scanner scanner) {
        int opcion;

        do {
            System.out.println("--- Menú de opciones ---");
            System.out.println("1. Ver información del vuelo");
            System.out.println("2. Crear nueva reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Agregar administrador");
            System.out.println("5. Agregar pasajero");
            System.out.println("6. Agregar agente de ventas");
            System.out.println("7. Modificar datos de usuario");
            System.out.println("8. Listar administradores");
            System.out.println("9. Listar pasajeros");
            System.out.println("10. Listar agentes de ventas");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    verInformacionVuelo();
                    break;
                case 2:
                    crearNuevaReserva();
                    break;
                case 3:
                    cancelarReserva();
                    break;
                case 4:
                    agregarAdministrador(scanner);
                    break;
                case 5:
                    agregarPasajero(scanner);
                    break;
                case 6:
                    agregarAgenteDeVentas(scanner);
                    break;
                case 7:
                    modificarDatosUsuario(scanner);
                    break;
                case 8:
                    listarAdministradores();
                    break;
                case 9:
                    listarPasajeros();
                    break;
                case 10:
                    listarAgentesDeVentas();
                    break;
                case 11:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 11);
    }

    private static void verInformacionVuelo() {
        System.out.println("Mostrando información del vuelo...");
        // Lógica para ver la información del vuelo
    }

    private static void crearNuevaReserva() {
        System.out.println("Creando una nueva reserva...");
        // Lógica para crear una nueva reserva
    }

    private static void cancelarReserva() {
        System.out.println("Cancelando reserva...");
        // Lógica para cancelar una reserva
    }

    private static void agregarAdministrador(Scanner scanner) {
        System.out.print("Ingrese el email del nuevo administrador: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese la contraseña del nuevo administrador: ");
        String password = scanner.nextLine();

        Administrador nuevoAdmin = new Administrador(email, password);
        gestionUsuario.agregarAdministrador(nuevoAdmin);
        System.out.println("Administrador agregado exitosamente.");
    }

    private static void agregarPasajero(Scanner scanner) {
        System.out.print("Ingrese el email del pasajero: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese la contraseña del pasajero: ");
        String password = scanner.nextLine();

        System.out.print("Ingrese el número de pasaporte del pasajero: ");
        String numPasaporte = scanner.nextLine();

        System.out.print("Ingrese el tipo de pasajero (ej. ECONOMY, BUSINESS): ");
        String tipoPasajero = scanner.nextLine();

        Pasajero nuevoPasajero = new Pasajero(email, password, numPasaporte, tipoPasajero);
        gestionUsuario.agregarPasajero(nuevoPasajero);
        System.out.println("Pasajero agregado exitosamente.");
    }

    private static void agregarAgenteDeVentas(Scanner scanner) {
        System.out.print("Ingrese el email del agente de ventas: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese la contraseña del agente de ventas: ");
        String password = scanner.nextLine();

        AgenteVenta nuevoAgente = new AgenteVenta(email, password);
        gestionUsuario.agregarAgenteDeVentas(nuevoAgente);
        System.out.println("Agente de ventas agregado exitosamente.");
    }

    private static void modificarDatosUsuario(Scanner scanner) {
        System.out.print("Ingrese el email del usuario a modificar: ");
        String email = scanner.nextLine();

        Usuario usuario = gestionUsuario.buscarUsuarioPorEmail(email);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        System.out.print("Ingrese el nuevo email: ");
        String nuevoEmail = scanner.nextLine();
        usuario.setEmail(nuevoEmail);

        System.out.print("Ingrese la nueva contraseña: ");
        String nuevaPassword = scanner.nextLine();
        usuario.setPassword(nuevaPassword);

        System.out.println("Datos modificados exitosamente.");
    }

    private static void listarAdministradores() {
        System.out.println("Lista de administradores:");
        for (Administrador admin : gestionUsuario.obtenerAdministradores()) {
            System.out.println("Email: " + admin.getEmail());
        }
    }

    private static void listarPasajeros() {
        System.out.println("Lista de pasajeros:");
        for (Pasajero pasajero : gestionUsuario.obtenerPasajeros()) {
            System.out.println("Email: " + pasajero.getEmail() + ", Número de pasaporte: " + pasajero.getNumPasaporte());
        }
    }

    private static void listarAgentesDeVentas() {
        System.out.println("Lista de agentes de ventas:");
        for (AgenteVenta agente : gestionUsuario.obtenerAgentesDeVentas()) {
            System.out.println("Email: " + agente.getEmail());
        }
    }
}