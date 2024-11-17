import GestionDeMenues.GestionPasajero;
import org.json.JSONException;

public class Main {
    public static void main(String[] args) throws JSONException {

        //ACA TENEMOS QUE HACER LA LOGICA PARA ENTRAR A QUE TIPO DE MENU DEBEMOS ENTRAR..
        //SI SOMOS PASAJERO DEBEMOS ENTRAR COMO PASAJERO
        //SI SOMOS AGENTE DE VENTA ENTRAR COMO AGENTE DE VENTA
        //SI SOMOS ADMINISTRADO ENTRAR COMO ADMINISTRADOR


        GestionPasajero GP = new GestionPasajero();
        GP.llamadoAMenuPasajero();

        /*GestionAgenteDeVentas GA = new GestionAgenteDeVentas();
        GA.llamadoAgenteDeVentas();*/


    }
}
