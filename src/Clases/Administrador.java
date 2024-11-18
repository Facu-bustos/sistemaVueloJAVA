package Clases;

import org.json.JSONException;

import java.util.List;

public class Administrador extends Usuario{

    // CONSTRUCTOR

    public Administrador(String email, String contrasenia) throws JSONException {
        super(email,contrasenia);
    }

}
