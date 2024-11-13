package Clases;

import GestionJSON.GestionJSON;
import org.json.JSONException;

import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Aeropuerto {

    //ATRIBUTOS

    private String ubicacion;
    List<Vuelo>listaVuelos;

    public Aeropuerto(String ubicacion, List<Vuelo> listaVuelos) throws JSONException {
        this.ubicacion = ubicacion;
        this.listaVuelos = Pasajero.compraDeVuelo();
    }
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(List<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aeropuerto that)) return false;
        return Objects.equals(ubicacion, that.ubicacion) && Objects.equals(listaVuelos, that.listaVuelos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ubicacion, listaVuelos);
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "ubicacion='" + ubicacion + '\'' +
                ", listaVuelos=" + listaVuelos +
                '}';
    }
}