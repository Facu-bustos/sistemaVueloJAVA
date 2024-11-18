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


    // CONSTRUCTOR
    public Usuario(String email, String contrasenia) throws JSONException {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public Usuario() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getEmail(), usuario.getEmail()) && Objects.equals(getContrasenia(), usuario.getContrasenia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmail(), getContrasenia());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                "} " + super.toString();
    }
    // VALIDAR CONTRASENIA

}
