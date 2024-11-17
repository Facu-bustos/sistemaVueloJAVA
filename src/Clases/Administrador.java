package Clases;

import java.util.List;

public class Administrador extends Usuario{

    // CONSTRUCTOR

    public Administrador(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, List<Vuelo> listaVuelos) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, email, contrasenia, listaVuelos);
    }
    public Administrador(String email, String contrasenia) {
        super(email,contrasenia);
    }

    // METODOS


}
