package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Usuario extends Persona{

    // ATRIBUTOS

    private String email;
    private String contrasenia;
    private List<Vuelo> listaVuelos;

    // CONSTRUCTOR

    public Usuario(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, List<Vuelo> listaVuelos) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento);
        this.email = email;
        this.contrasenia = contrasenia;
        this.listaVuelos = new ArrayList<>();
    }

    public Usuario() {

    }

    // GETTER

    public String getEmail() {
        return email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public List<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    // SETTER

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setListaVuelos(List<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    // METODOS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(email, usuario.email) && Objects.equals(contrasenia, usuario.contrasenia) && Objects.equals(listaVuelos, usuario.listaVuelos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, contrasenia, listaVuelos);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", listaVuelos=" + listaVuelos +
                "} " + super.toString();
    }
}
