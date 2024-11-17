package GestionDeUsuario;
import Clases.Administrador;
import Clases.AgenteVenta;
import Clases.Pasajero;
import Clases.Usuario;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class GestionUsuario {

    private List<Usuario> usuarios; // Lista de todos los usuarios

    public GestionUsuario() {
        usuarios = new ArrayList<>();
        inicializarUsuarios(); // Llamada para crear usuarios predeterminados
    }

    private void inicializarUsuarios() {
        // Crear administradores predeterminados
        Administrador admin1 = new Administrador("joaco@java.com", "joaco");
        Administrador admin2 = new Administrador("facundo@java.com", "facundo");

        // Crear agentes de ventas y pasajeros si es necesario

        // Agregar administradores a la lista de usuarios
        usuarios.add(admin1);
        usuarios.add(admin2);
    }

    // Ver todos los administradores
    public List<Administrador> verAdministradores() {
        List<Administrador> admins = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Administrador) {
                admins.add((Administrador) usuario);
            }
        }
        return admins;
    }

    // Agregar un nuevo usuario
    public boolean registrarUsuario(Usuario usuario, Administrador admin) {
        if (admin != null && admin instanceof Administrador) {
            usuarios.add(usuario); // Agregar usuario a la lista
            return true;
        }
        return false;
    }

    // Eliminar un usuario
    public boolean eliminarUsuario(Usuario usuario, Administrador admin) {
        if (admin != null && admin instanceof Administrador) {
            return usuarios.remove(usuario); // Eliminar usuario de la lista
        }
        return false;
    }

    // Modificar un usuario
    public boolean modificarUsuario(Usuario usuario, Usuario modificador, String nuevoNombre, String nuevoEmail, String nuevoTelefono) {
        // El administrador puede modificar cualquier usuario
        if (modificador instanceof Administrador) {
            actualizarDatos(usuario, nuevoNombre, nuevoEmail, nuevoTelefono);
            return true;
        }

        // El agente de ventas solo puede modificar datos de pasajeros
        if (modificador instanceof AgenteVenta && usuario instanceof Pasajero) {
            actualizarDatos(usuario, nuevoNombre, nuevoEmail, nuevoTelefono);
            return true;
        }

        // El pasajero solo puede modificar sus propios datos
        if (modificador instanceof Pasajero && modificador.equals(usuario)) {
            actualizarDatos(usuario, nuevoNombre, nuevoEmail, nuevoTelefono);
            return true;
        }

        return false;
    }

    // Actualizar los datos de un usuario
    private void actualizarDatos(Usuario usuario, String nuevoNombre, String nuevoEmail, String nuevoTelefono) {
        usuario.setNombre(nuevoNombre);
        usuario.setEmail(nuevoEmail);
        usuario.setTelefono(nuevoTelefono);
    }

    // Métodos auxiliares para obtener usuarios según el tipo
    public List<Pasajero> obtenerPasajeros() {
        List<Pasajero> pasajeros = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Pasajero) {
                pasajeros.add((Pasajero) usuario);
            }
        }
        return pasajeros;
    }

    public List<AgenteVenta> obtenerAgentesVentas() {
        List<AgenteVenta> agentes = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof AgenteVenta) {
                agentes.add((AgenteVenta) usuario);
            }
        }
        return agentes;
    }

    public List<Administrador> obtenerAdministradores() {
        List<Administrador> admins = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Administrador) {
                admins.add((Administrador) usuario);
            }
        }
        return admins;
    }

    // Metodo para autenticar al administrador
    public boolean autenticarAdministrador(String email, String contrasenia) {
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Administrador) {
                Administrador admin = (Administrador) usuario;
                if (admin.getEmail().equals(email) && admin.getContrasenia().equals(contrasenia)) {
                    return true; // Credenciales válidas
                }
            }
        }
        return false; // Credenciales no válidas
    }

    public void agregarAdministrador(Administrador nuevoAdmin) {
    }
}
