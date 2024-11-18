package Clases;

import Menues.MenuAdministrador;
import org.json.JSONException;

import java.util.List;

public class Administrador extends Usuario{

    // CONSTRUCTOR

    public Administrador(String email, String contrasenia) throws JSONException {
        super(email,contrasenia);
    }

    public Administrador() {
        super();
    }

    @Override
    public void mostrarMenu() throws JSONException {
        MenuAdministrador ad = new MenuAdministrador();
    }
}
