package Clases;

import Enumeradores.TipoUsuario;
import Excepciones.ContraseniaIncorrectaExcepcion;
import GestionJSON.GestionJSON;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Usuario {

    // ATRIBUTOS

    private String email;
    private String contrasenia;
    private String rol;
    // private TipoUsuario rol;

    /*public Usuario(String email, String contrasenia, TipoUsuario rol) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }*/

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

    /*public TipoUsuario getRol() {
        return rol;
    }*/

    public void setRol(String rol) {
        this.rol = rol;
    }

    /*public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }*/

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

}
