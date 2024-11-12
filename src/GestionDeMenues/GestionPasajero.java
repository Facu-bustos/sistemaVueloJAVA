package GestionDeMenues;

import Clases.Vuelo;
import Menues.MenuPasajero;
import GestionJSON.*;
import org.json.JSONException;

public class GestionPasajero {

    public void llamadoAMenuPasajero() throws JSONException {
        MenuPasajero MP = new MenuPasajero();
        MP.switchPasajero();
    }
}
