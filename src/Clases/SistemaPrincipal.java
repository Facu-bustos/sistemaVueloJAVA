package Clases;

import GestionDeUsuario.GestionUsuario;

import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        GestionUsuario gestionUsuarios = new GestionUsuario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inicio de sesión de administrador");
        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        // Intentar autenticar al administrador
        if (gestionUsuarios.autenticarAdministrador(email, password)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido al sistema!");
        } else {
            System.out.println("Error: Email o contraseña incorrectos.");
        }

        scanner.close();
    }
}

