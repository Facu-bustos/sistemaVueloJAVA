package GestionDeMenues;

import Menues.MenuPasajero;
import org.json.JSONException;

public class GestionPasajero {

    public void llamadoAMenuPasajero() throws JSONException {
        MenuPasajero MP = new MenuPasajero();
        MP.switchPasajero();
    }
}
