package Clases;

import java.util.List;
import java.util.Objects;

public class AgenteVenta extends Usuario{

    // CONSTRUCTOR

    public AgenteVenta(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, List<Vuelo> listaVuelos) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, email, contrasenia, listaVuelos);
    }
}
