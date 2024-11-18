package Clases;

import Excepciones.ContraseniaIncorrectaExcepcion;
import GestionJSON.GestionJSON;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Usuario extends Persona{

    // ATRIBUTOS

    private String email;
    private String contrasenia;
    private String rol;

    public Usuario(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, String rol) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento);
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public Usuario(String email, String contrasenia, String rol) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public Usuario() {

    }

    public Usuario(String email, String contrasenia) {
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    public abstract  void mostrarMenu() throws JSONException;
}
