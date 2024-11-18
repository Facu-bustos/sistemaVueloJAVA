package GestionDeMenues;

import Clases.Escala;
import Clases.TicketsDeReserva;
import Clases.Vuelo;
import Menues.MenuAgenteVentas;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static GestionJSON.GestionJSON.createJSON;

public class GestionPasajero {


    public void lecturaDeArraylistaVuelos(List<Vuelo>listaVuelos) throws JSONException {
        for(Vuelo v: listaVuelos)
        {
            System.out.println(v);
        }
    }

    public List<TicketsDeReserva>comprarVuelo(List<Vuelo>listaVuelos)
    {
        Scanner scanner = new Scanner(System.in);
        List<TicketsDeReserva> listaDeReserva = new ArrayList<>();
        boolean seguirComprando = true;
        while (seguirComprando) {
            System.out.println("Ingrese el destino que desea reservar:");
            String destinoSeleccionado = obtenerEntradaValida(scanner);

            boolean vueloEncontrado = false;
            for (Vuelo v : listaVuelos) {
                if (v.getDestino().equalsIgnoreCase(destinoSeleccionado)) {
                    vueloEncontrado = true;
                    System.out.println("Usted seleccionó el destino: " + v.getDestino());
                    Random randomID = new Random();
                    int idRandomVuelo = randomID.nextInt(100);
                    TicketsDeReserva ticketReserva = new TicketsDeReserva();
                    ticketReserva.setIdReserva(idRandomVuelo);
                    ticketReserva.setIdVuelo(v.getIdVuelo());
                    ticketReserva.setOrigen(v.getOrigen());
                    ticketReserva.setDestino(v.getDestino());
                    ticketReserva.setPrecio(v.getPrecio());
                    ticketReserva.setNumeroVuelo(v.getNumeroVuelo());
                    ticketReserva.setAerolinea(v.getAerolinea());
                    ticketReserva.setDuracion(v.getDuracion());
                    ticketReserva.setHoraLlegada(v.getHoraLlegada());
                    listaDeReserva.add(ticketReserva);
                    break;
                }
            }
            if (!vueloEncontrado) {
                System.out.println("No se encontró ningún vuelo con el destino ingresado. Por favor, intente nuevamente.");
            }

            System.out.println("¿Desea adquirir otro destino? (si/no):");
            String respuesta = scanner.nextLine().trim();
            seguirComprando = respuesta.equalsIgnoreCase("si");
        }
        return listaDeReserva;
    }

    private String obtenerEntradaValida(Scanner scanner) {
        String entrada;
        while (true) {
            entrada = scanner.nextLine().trim();
            if (!entrada.isEmpty() && entrada.matches("[a-zA-Z\\s]+")) {
                return entrada;
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un destino válido (solo letras):");
            }
        }
    }


    public void eliminarReserva(List<TicketsDeReserva>Reservas)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de Reserva que desea Eliminar");
        int idReserva = scanner.nextInt();
        TicketsDeReserva eliminar = null;

        for(TicketsDeReserva TR: Reservas)
        {
            if(TR.getIdReserva()==idReserva)
            {
                eliminar=TR;
            }
        }

        if(eliminar!=null)
        {
            Reservas.remove(eliminar);
            System.out.println("VIAJE CANCELADO");
        }
    }

    public void mostrarReservas(List<TicketsDeReserva> reservas)
    {
        for(TicketsDeReserva tr: reservas)
        {
            System.out.println(tr.toString());
        }
    }

    public void checkIn()
    {

    }


}
