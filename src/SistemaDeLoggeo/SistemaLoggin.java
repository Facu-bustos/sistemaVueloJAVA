package SistemaDeLoggeo;

import Clases.Pasajero;
import Clases.Usuario;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SistemaLoggin {
    // Atributos
    private List<Usuario> listaDeUsuarios;

    public SistemaLoggin() {
        this.listaDeUsuarios = new ArrayList<>();
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SistemaLoggin that)) return false;
        return Objects.equals(getListaDeUsuarios(), that.getListaDeUsuarios());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getListaDeUsuarios());
    }

    @Override
    public String toString() {
        return "SistemaLoggin{" +
                "listaDeUsuarios=" + listaDeUsuarios +
                '}';
    }

    public void loggear() throws JSONException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese email:");
        String emailLoggeo = sc.nextLine();
        System.out.println("Ingrese contraseña:");
        String contrasenia = sc.nextLine();

        // Verificar si el usuario ya está registrado
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.getEmail().equals(emailLoggeo) && usuario.getContrasenia().equals(contrasenia)) {
                usuarioEncontrado = usuario;
                break;
            }
        }
        if (usuarioEncontrado != null) {
            System.out.println("Inicio de sesión exitoso.");
            MenuPasajero menu = new MenuPasajero();
            menu.mostrarMenu();
        } else {
            System.out.println("Usuario no registrado. Creando nuevo usuario...");
            Pasajero nuevoUsuario = new Pasajero();
            nuevoUsuario.setEmail(emailLoggeo);
            nuevoUsuario.setContrasenia(contrasenia);
            listaDeUsuarios.add(nuevoUsuario);
            System.out.println("Usuario registrado exitosamente.");
        }
    }





}
