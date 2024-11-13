package Clases;

import GestionJSON.GestionJSON;
import org.json.JSONException;

import java.util.List;
import java.util.Objects;

public class ReservasPasajeros {
    private List<Vuelo>listaDeTickets;


    public ReservasPasajeros() throws JSONException {
        this.listaDeTickets = Pasajero.compraDeVuelo();
    }

    public List<Vuelo> getListaDeTickets() {
        return listaDeTickets;
    }

    public void setListaDeTickets(List<Vuelo> listaDeTickets) {
        this.listaDeTickets = listaDeTickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReservasPasajeros that)) return false;
        return Objects.equals(listaDeTickets, that.listaDeTickets);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listaDeTickets);
    }

    @Override
    public String toString() {
        return "ReservasPasajeros{" +
                "listaDeTickets=" + listaDeTickets +
                '}';
    }

    public void escrituraJSON() throws JSONException {
        GestionJSON.createJSON(listaDeTickets);
    }

    public void cancelacionDeVuelo(Integer id)
    {
        Vuelo vuelo=null;
        for(Vuelo v: listaDeTickets)
        {
            if(id.equals(v.getIdVuelo()))
            {
                vuelo=v;
            }
        }
        if(vuelo!=null) {
            listaDeTickets.remove(vuelo);
            System.out.println("Vuelo cancelado");
        }
    }
}
