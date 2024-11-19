import GestionDeMenues.GestionAgenteDeVentas;
import GestionDeMenues.GestionPasajero;
import Menues.MenuAgenteVentas;
import Menues.MenuPasajero;
import SistemaDeLoggeo.SistemaLoggin;
import org.json.JSONException;

public class Main {
    public static void main(String[] args) throws JSONException {
        SistemaLoggin sistemaLoggeo = new SistemaLoggin();
        sistemaLoggeo.loggear();
    }
}
