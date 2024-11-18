package Clases;

import Menues.MenuAgenteVentas;
import org.json.JSONException;

import java.util.List;
import java.util.Objects;

public class AgenteVenta extends Usuario{

    // CONSTRUCTOR


    public AgenteVenta(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, String rol) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, email, contrasenia, rol);
    }

    public AgenteVenta(String email, String contrasenia, String rol) {
        super(email, contrasenia, rol);
    }

    public AgenteVenta() {
    }

    @Override
    public void mostrarMenu() throws JSONException {
        MenuAgenteVentas agenteVentas = new MenuAgenteVentas();
        agenteVentas.mostrarMenu();
    }
}
