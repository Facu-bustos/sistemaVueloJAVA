package GestionDeMenues;

import Clases.Pasajero;
import Menues.MenuAgenteDeVentas;
import Menues.MenuPasajero;
import org.json.JSONException;

public class GestionAgenteDeVentas {

    public void llamadoAgenteDeVentas() throws JSONException {
        MenuAgenteDeVentas MA = new MenuAgenteDeVentas();
        MA.switchAgenteDeVentas();
    }



}
