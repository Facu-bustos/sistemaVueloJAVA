package GestionDeMenues;

import Clases.Usuario;
import Clases.Vuelo;
import GestionJSON.GestionJSON;
import JSONutiles.JSONUtiles;
import Menues.MenuAdministrador;
import Menues.MenuAgenteVentas;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionAdministrador {

    public void lecturaDeArraylistaVuelos(List<Vuelo> listaVuelos) throws JSONException {
        for(Vuelo v: listaVuelos)
        {
            System.out.println(v);
        }
    }

    public void listarUsuarios(List<Usuario>listaUsuarios)
    {
        for(Usuario v: listaUsuarios)
        {
            System.out.println(v);
        }
    }

    public void eliminarUsuarios(List<Usuario>listaUsuarios) throws JSONException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el email del usuario a elimianar");
        String eliminar = sc.nextLine();

        Usuario encontrado = null;
        for(Usuario u: listaUsuarios)
        {
            if(u.getEmail().equalsIgnoreCase(eliminar))
            {
                encontrado=u;
            }
        }

        System.out.println("Eliminado usuario");
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

        if(encontrado!=null)
        {
            listaUsuarios.remove(encontrado);
            GestionJSON.createJSONusuarios(listaUsuarios);
        }
    }

    public List<Vuelo> eliminarVuelosProgramados(List<Vuelo>listaVuelos)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el ID del vuelo que desea Eliminar");
        int vueloID = sc.nextInt();
        sc.nextLine();

        Vuelo encontrado = null;

        for(Vuelo v: listaVuelos)
        {
            if(v.getIdVuelo()==vueloID)
            {
                encontrado=v;
            }
        }

        System.out.println("Eliminado VUELO");
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

        if(encontrado!=null)
        {
            listaVuelos.remove(encontrado);
        }else
        {
            System.out.println("ID incorrecto, no existen vuelos programados");
        }
        return listaVuelos;
    }
}
