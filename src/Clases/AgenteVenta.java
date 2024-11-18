package Clases;

import org.json.JSONException;

import java.util.List;
import java.util.Objects;

public class AgenteVenta extends Usuario{

    // CONSTRUCTOR

    public AgenteVenta(String email, String contrasenia) throws JSONException {
        super(email, contrasenia);
    }
}
