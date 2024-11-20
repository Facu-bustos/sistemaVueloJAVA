package SistemaDeLoggeo;

import Clases.Administrador;
import Clases.AgenteVenta;
import Clases.Pasajero;
import Clases.Usuario;
import Enumeradores.TipoUsuario;
import GestionJSON.GestionJSON;
import Menues.MenuAdministrador;
import Menues.MenuAgenteVentas;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SistemaLoggin {
    // Atributos
    private List<Usuario> listaDeUsuarios;

    public SistemaLoggin() throws JSONException {
        this.listaDeUsuarios = GestionJSON.mapeoListaUsuarios();
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

    public void loggear(TipoUsuario rolSeleccionado) throws JSONException { // MODIFICADO
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese email:");
        String emailLoggeo = sc.nextLine();
        System.out.println("Ingrese contraseña:");
        String contrasenia = sc.nextLine();

        boolean encontrado = false;

        for (Usuario u : listaDeUsuarios) {
            if (u.getEmail().equalsIgnoreCase(emailLoggeo) &&
                    u.getContrasenia().equalsIgnoreCase(contrasenia)) {

                encontrado = true;

                // Mostrar el menú según el rol
                switch (u.getRol()) {
                    case "administrador":
                        MenuAdministrador menuAdmin = new MenuAdministrador();
                        menuAdmin.mostrarMenu();
                        break;
                    case "pasajero":
                        MenuPasajero menuPasajero = new MenuPasajero();
                        menuPasajero.mostrarMenu();
                        break;
                    case "agente de ventas":
                        MenuAgenteVentas menuAgente = new MenuAgenteVentas();
                        menuAgente.mostrarMenu();
                        break;
                    default:
                        System.out.println("Rol desconocido."); // ESTO NO VA
                }
                break;
            }
        }

        if (!encontrado) { // ESTO ESTABA FUERA DEL FOR, CREO QUE VA ADENTRO
            Usuario nuevoUsuario;
            switch (rolSeleccionado) {
                //case "administrador": ASI ES COMO ESTABAN LOS 3
                case ADMINISTRADOR:
                    nuevoUsuario = new Administrador();
                    nuevoUsuario.setEmail(emailLoggeo);
                    nuevoUsuario.setContrasenia(contrasenia);
                    //nuevoUsuario.setRol(rolSeleccionado); TIRA ERROR PORQUE ESPERA UN STRING, HAY QUE MODIFICAR EL GET Y SET NADA MAS
                    break;
                //case "pasajero":
                case PASAJERO:
                    nuevoUsuario = new Pasajero();
                    nuevoUsuario.setEmail(emailLoggeo);
                    nuevoUsuario.setContrasenia(contrasenia);
                    //nuevoUsuario.setRol(rolSeleccionado);
                    break;
                //case "agente de ventas":
                case AGENTE_VENTA:
                    nuevoUsuario = new AgenteVenta();
                    nuevoUsuario.setEmail(emailLoggeo);
                    nuevoUsuario.setContrasenia(contrasenia);
                    //nuevoUsuario.setRol(rolSeleccionado);
                    break;
                default:
                    System.out.println("Rol inválido. No se puede crear el usuario.");
                    return;
            }
            listaDeUsuarios.add(nuevoUsuario);
            System.out.println("Nuevo usuario creado y agregado a la lista.");

            GestionJSON.createJSONusuarios(listaDeUsuarios);
        }
    }
}
