package Clases;

import Menues.MenuAdministrador;
import org.json.JSONException;

import java.util.List;

public class Administrador extends Usuario{

    // CONSTRUCTOR


    public Administrador(String email, String contrasenia, String rol) {
        super(email, contrasenia, rol);
    }

    public Administrador() {
    }

    public Administrador(String email, String contrasenia) {
        super(email, contrasenia);
    }

    @Override
    public String toString() {
        return "Administrador{} " + super.toString();
    }
}
