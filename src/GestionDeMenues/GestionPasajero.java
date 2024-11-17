package GestionDeMenues;

import Clases.Escala;
import Clases.Vuelo;
import Menues.MenuAgenteVentas;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.List;
import java.util.Scanner;

import static GestionJSON.GestionJSON.createJSON;

public class GestionPasajero {

    private Scanner scanner = new Scanner(System.in);

    public int compraDeVuelo(List<Vuelo> listaVuelo) throws JSONException {

        System.out.println("Elija el ID del vuelo a comprar:");
        int idVuelo = scanner.nextInt();
        scanner.nextLine();
        Integer idBusqueda=null;
        boolean encontrado = false;
        // buscamos el vuelo en la lista de vuelos , si hay coincidencia accedemos a persistir
        for (Vuelo v : listaVuelo) {
            if (v.getIdVuelo() == idVuelo) {
                System.out.println("Vuelo encontrado:");
                createJSON(idVuelo,listaVuelo);
                System.out.println("Vuelo comprado:");
                datosDelViajeAdquirido(idVuelo,listaVuelo);
                encontrado = true;
                idBusqueda=idVuelo;
                break;
            } else {
                System.out.println("Error: No existe un vuelo con el ID " + idVuelo + ".");
            }
        }
        return idBusqueda;
    }

    public void cancelacionDeVuelo()
    {

    }

    public void mostrarDatosPersonales()
    {

    }

    public void modifcarDatosPersonales()
    {

    }



    public static void datosDelViajeAdquirido(Integer idVuelo, List<Vuelo>listaVuelo)
    {
        if(idVuelo!=null)
        {

            for(Vuelo v: listaVuelo)
            {
                if(v.getIdVuelo()==idVuelo)
                {
                    System.out.println("ID VUELO: " + v.getIdVuelo());
                    System.out.println("NUMERO DE VUELO: " + v.getNumeroVuelo());
                    System.out.println("ORIGEN: " + v.getOrigen());
                    System.out.println("DESTINO: " + v.getDestino());
                    System.out.println("ESTADO DE VUELO" + v.getEstadoVuelo());
                    System.out.println("AEROLINEA: " + v.getAerolinea());
                    System.out.println("CLASE: " + v.getClase());
                    System.out.println("DURACION: "+ v.getDuracion());
                    for(Escala e: v.getEscalas())
                    {
                        System.out.println("Aeropuerto " + e.getAeropueto());
                        System.out.println("HORA LLEGADA: " + e.getHoraSalida());
                    }
                    System.out.println("HORA DE SALIDA : " + v.getHoraSalida());
                    System.out.println("HORA DE LLEGADA: " + v.getHoraLlegada());
                    System.out.println("PRECIO: " + v.getPrecio());
                    System.out.println("TIPO DE VUELO: " + v.getTipoVuelo());
                }
            }
        }
    }

    // LLAMADO A PASAJERO PARA MOSTRAR MENU

    public void llamadoPasajero() throws JSONException {
        MenuPasajero MP = new MenuPasajero();
        MP.mostrarMenu();
    }

}
