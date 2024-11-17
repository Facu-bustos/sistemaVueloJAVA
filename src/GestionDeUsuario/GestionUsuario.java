package GestionDeUsuario;
import Clases.Administrador;
import Clases.AgenteVenta;
import Clases.Pasajero;
import Clases.Usuario;

import java.util.ArrayList;
import java.util.List;


    public class GestionUsuario {}

        /*private List<Administrador> administradores;

        public GestionUsuario() {
            administradores = new ArrayList<>();
            inicializarAdministradores(); // Llamada para crear los administradores predeterminados
        }

        private void inicializarAdministradores() {
            // Crear dos administradores con email y contraseña
            Administrador admin1 = new Administrador("joaco@java.com", "joaco");
            Administrador admin2 = new Administrador("facundo@java.com", "facundo");

            // Agregarlos a la lista de administradores
            administradores.add(admin1);
            administradores.add(admin2);
        }

        public List<Administrador> verAdministradores() {
            return administradores;
        }

        public void agregarAdministrador(Administrador admin) {
            administradores.add(admin);
        }

        // Metodo para autenticar al administrador

        public boolean autenticarAdministrador(String email, String contrasenia) {
            for (Administrador admin : administradores) {
                if (admin.getEmail().equals(email) && admin.getContrasenia().equals(contrasenia)) {
                    return true; // Credenciales válidas
                }
            }
            return false; // Credenciales no válidas
        }
    }*/
        /*

        // ALTA DE USUARIO

        public boolean registrarUsuario(Usuario usuario, Administrador admin) {
            if (admin != null && admin instanceof Administrador) {
                // Solo el administrador puede agregar usuarios
                usuarios.add(usuario);
                return true;
            }
            return false;
        }

        // BAJA DE USUARIO

        public boolean eliminarUsuario(Usuario usuario, Administrador admin) {
            if (admin != null && admin instanceof Administrador) {
                // Solo el administrador puede eliminar usuarios
                return usuarios.remove(usuario);
            }
            return false;
        }

        // MODIFICAR INFO DE UN USUARIO

        public boolean modificarUsuario(Usuario usuario, Usuario modificador, String nuevoNombre, String nuevoEmail, String nuevoTelefono) {
            // Administrador puede modificar cualquier usuario
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

        // METODO PARA ACTUALIZAR DATOS

        private void actualizarDatos(Usuario usuario, String nuevoNombre, String nuevoEmail, String nuevoTelefono) {
            usuario.setNombre(nuevoNombre);
            usuario.setEmail(nuevoEmail);
            usuario.setTelefono(nuevoTelefono);
        }

        // Métodos auxiliares para obtener usuarios según el tipo (Opcional)
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
    }

         */