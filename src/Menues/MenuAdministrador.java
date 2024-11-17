package Menues;

import Clases.Pasajero;
import Clases.Vuelo;
import GestionJSON.GestionJSON;
import org.json.JSONException;

import java.util.List;
import java.util.Scanner;

public class MenuAdministrador {


    public void switchAdministrador() throws JSONException {
        List<Vuelo> listaVuelo= GestionJSON.mapeoVuelo();
        Pasajero pasajero = new Pasajero();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ELIGE UNA OPCION");
        System.out.println("1: Generar informe general");
        System.out.println("2: Consultar historial pasajero");
        System.out.println("3: Consultar estado vuelo");
        System.out.println("4: Consultar datos personales");
        System.out.println("5: ");

        String opc=scanner.nextLine();
        switch (opc)
        {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
            default:
                System.out.println("Opcion Incorrecta,INTENTE NUEVAMENTE");
                break;
        }
    }

}
