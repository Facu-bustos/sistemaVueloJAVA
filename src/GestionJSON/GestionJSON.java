package GestionJSON;

import Clases.Escala;
import Clases.Vuelo;
import JSONutiles.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GestionJSON {

    public static List<Vuelo> mapeoVuelo () throws JSONException {
        List<Vuelo>listaDeVuelos=new ArrayList<>();

        JSONObject json = new JSONObject(JSONUtiles.leer("vuelos.json"));
        JSONArray jvuelos = json.getJSONArray("vuelos");

        for(int i=0; i<jvuelos.length(); i++)
        {
            JSONObject jvuelo=jvuelos.getJSONObject(i);
            Vuelo v = new Vuelo();
            v.setIdVuelo(jvuelo.getInt("id_vuelo"));
            v.setOrigen(jvuelo.getString("origen"));
            v.setDestino(jvuelo.getString("destino"));
            v.setHoraSalida(jvuelo.getString("hora_salida"));
            v.setHoraLlegada(jvuelo.getString("hora_llegada"));
            v.setDuracion(jvuelo.getString("duracion"));
            v.setPrecio(jvuelo.getDouble("precio"));
            v.setCantidadDisponible(jvuelo.getInt("capacidad_disponible"));
            v.setAerolinea(jvuelo.getString("aerolinea"));
            v.setClase(jvuelo.getString("clase"));
            v.setNumeroVuelo(jvuelo.getString("numero_vuelo"));

            JSONArray jescalas=jvuelo.getJSONArray("escalas");
            List<Escala>escala=new ArrayList<>();
            for(int j=0; j<jescalas.length(); j++)
            {
                JSONObject jescala=jescalas.getJSONObject(j);
                Escala e= new Escala();
                e.setAeropueto(jescala.getString("aeropuerto"));
                e.setHoraSalida(jescala.getString("hora_salida"));
                escala.add(e);
            }
            v.setEscalas(escala);
            v.setTipoVuelo(jvuelo.getString("tipo_vuelo"));
            v.setEstadoVuelo(jvuelo.getString("estado_vuelo"));
            listaDeVuelos.add(v);
        }

        return listaDeVuelos;
    }

    public static void createJSON(List<Vuelo> listaVuelo) throws JSONException {
        JSONObject jVuelo = new JSONObject();
        JSONArray jescalas = new JSONArray();
        for (Vuelo v : listaVuelo) {
                jVuelo.put("id_vuelo", v.getIdVuelo());
                jVuelo.put("origen", v.getOrigen());
                jVuelo.put("destino", v.getDestino());
                jVuelo.put("hora_salida", v.getHoraSalida());
                jVuelo.put("hora_llegada", v.getHoraLlegada());
                jVuelo.put("duracion", v.getDuracion());
                jVuelo.put("precio", v.getPrecio());
                jVuelo.put("capacidad_disponible", v.getCantidadDisponible());
                jVuelo.put("aerolinea", v.getAerolinea());
                jVuelo.put("clase", v.getClase());
                jVuelo.put("numero_vuelo", v.getNumeroVuelo());
                jVuelo.put("tipo_vuelo", v.getTipoVuelo());
                jVuelo.put("estado_vuelo", v.getEstadoVuelo());

                // Recorrer y añadir escalas del vuelo actual si existiera
                for (Escala escala : v.getEscalas()) {
                    JSONObject jEscala = new JSONObject();
                    jEscala.put("aeropuerto", escala.getAeropueto());
                    jEscala.put("hora_salida", escala.getHoraSalida());
                    jescalas.put(jEscala);
                }
                // Añadir escalas al JSON si existiera alguna
                jVuelo.put("escalas", jescalas);
                break;

        }
        JSONUtiles.grabar(jVuelo);
    }
}
