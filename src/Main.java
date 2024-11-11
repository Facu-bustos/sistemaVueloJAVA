import Clases.Vuelo;
import GestionDeMenues.GestionPasajero;
import GestionJSON.GestionJSON;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.List;

public class Main {
    public static void main(String[] args) throws JSONException {


        GestionPasajero GP = new GestionPasajero();
        GP.llamadoAMenuPasajero();


    }
}
