package GestionDeMenues;
import java.util.Random;

import Clases.Escala;
import Clases.Pasajero;
import Clases.TicketsDeReserva;
import Clases.Vuelo;
import Enumeradores.TipoEstadoCheckIn;
import Excepciones.VueloNoEncontradoExcepcion;
import GestionJSON.GestionJSON;
import Interface.I_interface;
import org.json.JSONException;

import java.util.*;

public class GestionAgenteDeVentas implements I_interface {

    public GestionAgenteDeVentas()
    {
    }

    public void lecturaVuelos(List<Vuelo>listaVuelos) {
        for(Vuelo v: listaVuelos)
        {
            System.out.println(v);
        }

    }

    /*public void lecturaDeArraylistaVuelos(List<Vuelo>listaVuelos) throws JSONException {
        for(Vuelo v: listaVuelos)
        {
            System.out.println(v);
        }
    }*/

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
               throw new VueloNoEncontradoExcepcion("Destino no disponible, le avisaremos cuando haya vuelos diponibles");
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

    public void CheckIN(List<TicketsDeReserva>ticketsDeReservas) throws JSONException {

        Pasajero p = new Pasajero();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Número de Pasaporte:");
        String numeroPasaporte;
        while (true) {
            numeroPasaporte = sc.nextLine().trim();

            // Validamos que sean solo numeros,
            // validamos que solo haya digitos del 0 a 9
            if (numeroPasaporte.matches("\\d+")) {
                p.setNumPasaporte(numeroPasaporte);
                break; // Salir del bucle si es válido
            } else {
                System.out.println("Error: El número de pasaporte debe contener solo números. Intente nuevamente:");
            }
        }
        String nombre = "";
        String apellido = "";
        boolean nombreValido = false;
        while (!nombreValido) {
            System.out.println("Ingrese NOMBRE:");
            nombre = sc.nextLine();
            nombreValido = true; // Asumimos que es válido

            // Verificamos que todos los caracteres sean letras
            for (int i = 0; i < nombre.length(); i++) {
                char c = nombre.charAt(i);
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                    nombreValido = false;
                    System.out.println("El nombre solo puede contener letras. Intente de nuevo.");
                    break;
                }
            }
        }
        boolean apellidoValido = false;
        while (!apellidoValido) {
            System.out.println("Ingrese APELLIDO:");
            apellido = sc.nextLine();
            apellidoValido = true;
            for (int i = 0; i < apellido.length(); i++) {
                char c = apellido.charAt(i);
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                    apellidoValido = false;
                    System.out.println("El apellido solo puede contener letras. Intente de nuevo.");
                    break;
                }
            }
        }
        //ACA HACEMOS UNA DOBLE VALIDACION
        //EL NUMERO DE PASAPORTE QUE ASIGNAMOS ES EL CORRECTO COMPARA
        //Y CAMBIAMOS EL ESTADO DEL CHECK IN A REALIZADO.
        System.out.println("Realizando checkIN");
        try {
            for(int i=0; i<3; i++)
            {
                Thread.sleep(1000);
                System.out.println("."+".");
            }
            // Pausa de 1 segundo
            if (p.getNumPasaporte().equalsIgnoreCase(numeroPasaporte)) {
                if (p.getEstadoCheckIN() == TipoEstadoCheckIn.PENDIENTE) {
                     p.setEstadoCheckIN(TipoEstadoCheckIn.REALIZADO);
                    System.out.println("Check-in realizado con éxito.");
                } else {
                    System.out.println("El check-in ya fue realizado.");
                }
            } else {
                System.out.println("Número de pasaporte incorrecto.");
            }
        } catch (InterruptedException e) {
            System.err.println("El retardo fue interrumpido.");
        }
        if(p.getNumPasaporte()!=null)
        {
            GestionJSON.createJSON(nombre,apellido,numeroPasaporte,ticketsDeReservas);
        }
    }

}

