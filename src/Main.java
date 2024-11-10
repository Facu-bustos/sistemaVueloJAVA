import Clases.Vuelo;
import org.json.JSONException;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try
        {
            List<Vuelo>ListaVuelos=GestionJSON.mapeoVuelo();
            System.out.println(ListaVuelos.toString());
        }catch (JSONException e)
        {
            e.printStackTrace();
        }
    }
}
