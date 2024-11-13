package Clases;
import Enumeradores.TipoEstadoCheckIn;
import Enumeradores.TipoPasajero;
import Excepciones.ReadFail;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import GestionJSON.*;

import static GestionJSON.GestionJSON.createJSON;

public class Pasajero extends Usuario {

    //ATRIBUTOS
    private String numPasaporte;
    private TipoPasajero tipoPasajero;
    private TipoEstadoCheckIn estadoCheckIn;
    private Integer idVueloPasajero;
    Scanner scanner;

    //CONSTRUCTOR
    public Pasajero(String nombre, String apellido, String DNI, String direccion, String nacionalidad, String telefono, String fechaNacimiento, String email, String contrasenia, List<Vuelo> listaVuelos, String numPasaporte, TipoPasajero tipoPasajero, TipoEstadoCheckIn estadoCheckIn, Integer idVueloPasajero, Scanner scanner) {
        super(nombre, apellido, DNI, direccion, nacionalidad, telefono, fechaNacimiento, email, contrasenia, listaVuelos);
        this.numPasaporte = numPasaporte;
        this.tipoPasajero = tipoPasajero;
        this.estadoCheckIn = estadoCheckIn;
        this.idVueloPasajero = idVueloPasajero;
        this.scanner = scanner;
    }

    public Pasajero()
    {
        super();

    }
    //Gette and setter


    public String getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(TipoPasajero tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    public TipoEstadoCheckIn getEstadoCheckIn() {
        return estadoCheckIn;
    }

    public void setEstadoCheckIn(TipoEstadoCheckIn estadoCheckIn) {
        this.estadoCheckIn = estadoCheckIn;
    }

    public Integer getIdVueloPasajero() {
        return idVueloPasajero;
    }

    public void setIdVueloPasajero(Integer idVueloPasajero) {
        this.idVueloPasajero = idVueloPasajero;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero pasajero)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(numPasaporte, pasajero.numPasaporte) && tipoPasajero == pasajero.tipoPasajero && estadoCheckIn == pasajero.estadoCheckIn && Objects.equals(idVueloPasajero, pasajero.idVueloPasajero) && Objects.equals(scanner, pasajero.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPasaporte, tipoPasajero, estadoCheckIn, idVueloPasajero, scanner);
    }

    ///METODOS
    public List<Vuelo> lecturaDeListaVuelo()
    {
        try {
        List<Vuelo>listaVuelo=GestionJSON.mapeoVuelo();
        System.out.print(listaVuelo);
            return listaVuelo;
        }catch (JSONException e)
        {
            throw new ReadFail("Lectura ERRONEA");
        }
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "numPasaporte='" + numPasaporte + '\'' +
                ", tipoPasajero=" + tipoPasajero +
                ", estadoCheckIn=" + estadoCheckIn +
                ", idVueloPasajero=" + idVueloPasajero +
                ", scanner=" + scanner +
                "} " + super.toString();
    }

    public static List<Vuelo> compraDeVuelo() throws JSONException {

        Scanner scanner1 = new Scanner(System.in);
        List<Vuelo>listaVuelosDisponibles=GestionJSON.mapeoVuelo();
        List<Vuelo>ListaDeTickets=new ArrayList<>();
        System.out.println("Elija el ID del vuelo a comprar:");
        String id = scanner1.nextLine();
        // Verificamos si la entrada es un número
        if (!id.matches("\\d+")) {  // Verificamos que contenga solo dígitos
            System.out.println("Error: Debe ingresar un número válido.");
        } else {
            int idVuelo = Integer.parseInt(id);  // Convertir a número
            boolean encontrado = false;
            // buscamos el vuelo en la lista de vuelos , si hay coincidencia accedemos a persistir
            for (Vuelo v : listaVuelosDisponibles) {
                if (v.getIdVuelo() == idVuelo) {
                    System.out.println("Vuelo encontrado:");
                    for(int i=0; i<listaVuelosDisponibles.size(); i++)
                    {
                        Vuelo ticketVuelo=new Vuelo();
                        ticketVuelo.setIdVuelo(v.getIdVuelo());
                        ticketVuelo.setOrigen(v.getOrigen());
                        ticketVuelo.setDestino(v.getDestino());
                        ticketVuelo.setHoraSalida(v.getHoraSalida());
                        ticketVuelo.setHoraLlegada(v.getHoraLlegada());
                        ticketVuelo.setDuracion(v.getDuracion());
                        ticketVuelo.setPrecio(v.getPrecio());
                        ticketVuelo.setCantidadDisponible(v.getCantidadDisponible());
                        ticketVuelo.setAerolinea(v.getAerolinea());
                        ticketVuelo.setClase(v.getClase());
                        ticketVuelo.setNumeroVuelo(v.getNumeroVuelo());
                        List<Escala>escalaVuelo=new ArrayList<>();
                        for(Escala e: v.getEscalas())
                        {
                            Escala escalaV= new Escala();
                            escalaV.setAeropueto(e.getAeropueto());
                            escalaV.setHoraSalida(e.getHoraSalida());
                            escalaVuelo.add(escalaV);
                        }
                        ticketVuelo.setEscalas(escalaVuelo);
                        ticketVuelo.setTipoVuelo(v.getTipoVuelo());
                        ticketVuelo.setEstadoVuelo(v.getEstadoVuelo());
                        ListaDeTickets.add(ticketVuelo);
                    }
                    System.out.println("Vuelo comprado:");
                    encontrado = true;
                    break;
                }

            }
            if (!encontrado) {
                System.out.println("Error: No existe un vuelo con el ID " + idVuelo + ".");
            }
        }
        return ListaDeTickets ;
    }

    public void cancelacionDeVuelo(Integer id) throws JSONException {
        System.out.println("¿Desea eliminar el vuelo?");
        String si=scanner.nextLine();
        if(si.equalsIgnoreCase("si"))
        {
            ReservasPasajeros p = new ReservasPasajeros();
            p.cancelacionDeVuelo(id);
        }
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

}


