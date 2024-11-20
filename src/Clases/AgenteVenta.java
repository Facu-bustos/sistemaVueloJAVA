package Clases;

import Menues.MenuAgenteVentas;
import org.json.JSONException;

import java.util.List;
import java.util.Objects;

public class AgenteVenta extends Usuario{

    // CONSTRUCTOR

    public AgenteVenta(String email, String contrasenia, String rol) {
        super(email, contrasenia, rol);
    }

    public AgenteVenta() {
    }

    public AgenteVenta(String email, String contrasenia) {
        super(email, contrasenia);
    }

    @Override
    public String toString() {
        return "AgenteVenta{} " + super.toString();
    }

}
