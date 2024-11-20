package Clases;

import Enumeradores.TipoUsuario;
import Menues.MenuAdministrador;
import org.json.JSONException;

import java.util.List;

public class Administrador extends Usuario{

    // CONSTRUCTOR


    public Administrador(String email, String contrasenia, TipoUsuario rol) {
        super(email, contrasenia, );

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
