package GestionDeMenues;

import Clases.*;
import GestionJSON.GestionJSON;
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
                    ticketReserva.setHoraSalida(v.getHoraSalida());
                    ticketReserva.setHoraLlegada(v.getHoraLlegada());
                    ticketReserva.setDuracion(v.getDuracion());
                    ticketReserva.setPrecio(v.getPrecio());
                    ticketReserva.setCantidadDisponible(v.getCantidadDisponible());
                    ticketReserva.setAerolinea(v.getAerolinea());
                    ticketReserva.setClase(v.getClase());
                    ticketReserva.setNumeroVuelo(v.getNumeroVuelo());
                    List<Escala>escalas = new ArrayList<>();
                    for(Escala es: v.getEscalas())
                    {
                      Escala escala = new Escala();
                      escala.setAeropueto(es.getAeropueto());
                      escala.setHoraSalida(es.getHoraSalida());
                      escalas.add(escala);
                    }
                    ticketReserva.setEscalas(escalas);
                    ticketReserva.setTipoVuelo(v.getTipoVuelo());
                    ticketReserva.setEstadoVuelo(v.getEstadoVuelo());
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
        System.out.println("Realizando compra");
        try {
            for(int i=0; i<3; i++)
            {
                Thread.sleep(1000);
                System.out.println("."+".");
            }
        }catch (Exception e)
        {
            throw new RuntimeException("Error en la ejecucion");
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
                System.out.println("Entrada inválida, ingrese un destino válido (solo letras):");
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
}
