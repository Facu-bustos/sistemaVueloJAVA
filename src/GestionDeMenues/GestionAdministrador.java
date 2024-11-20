package GestionDeMenues;

import Clases.*;
import Excepciones.ErrorDeEliminacion;
import Excepciones.ErrorDeModificacion;
import GestionJSON.GestionJSON;
import JSONutiles.JSONUtiles;
import Menues.MenuAdministrador;
import Menues.MenuAgenteVentas;
import Menues.MenuPasajero;
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
        System.out.println("Borramos los VUELOS CANCELADOS");

        Vuelo encontrado = null;

        for(Vuelo v: listaVuelos)
        {
            if(v.getEstadoVuelo().equalsIgnoreCase("Cancelado"))
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


    public void darDeAltaUsuarios(List<Usuario>listaDeUsuarios) throws JSONException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese email:");
        String emailLoggeo = sc.nextLine();
        System.out.println("Ingrese contraseña:");
        String contrasenia = sc.nextLine();
        System.out.println("Ingrese rol:");
        String rol = sc.nextLine();

        boolean encontrado = false;

        for (Usuario u : listaDeUsuarios) {
            if (u.getEmail().equalsIgnoreCase(emailLoggeo) &&
                    u.getContrasenia().equalsIgnoreCase(contrasenia) &&
                    u.getRol().equalsIgnoreCase(rol)) {

                encontrado = true;

                // Mostrar el menú según el rol
                switch (rol.toLowerCase()) {
                    case "administrador":
                        MenuAdministrador menuAdmin = new MenuAdministrador();
                        menuAdmin.mostrarMenu();
                        break;
                    case "pasajero":
                        MenuPasajero menuPasajero = new MenuPasajero();
                        menuPasajero.mostrarMenu();
                        break;
                    case "agente de ventas":
                        MenuAgenteVentas menuAgente = new MenuAgenteVentas();
                        menuAgente.mostrarMenu();
                        break;
                    default:
                        System.out.println("Rol desconocido.");
                }
                break;
            }
        }

        if (!encontrado) {
            Usuario nuevoUsuario;
            switch (rol.toLowerCase()) {
                case "administrador":
                    nuevoUsuario = new Administrador();
                    nuevoUsuario.setEmail(emailLoggeo);
                    nuevoUsuario.setContrasenia(contrasenia);
                    nuevoUsuario.setRol(rol);
                    break;
                case "pasajero":
                    nuevoUsuario = new Pasajero();
                    nuevoUsuario.setEmail(emailLoggeo);
                    nuevoUsuario.setContrasenia(contrasenia);
                    nuevoUsuario.setRol(rol);
                    break;
                case "agente de ventas":
                    nuevoUsuario = new AgenteVenta();
                    nuevoUsuario.setEmail(emailLoggeo);
                    nuevoUsuario.setContrasenia(contrasenia);
                    nuevoUsuario.setRol(rol);
                    break;
                default:
                    System.out.println("Rol inválido. No se puede crear el usuario.");
                    return;
            }
            listaDeUsuarios.add(nuevoUsuario);
            System.out.println("Nuevo usuario creado y agregado a la lista.");
            GestionJSON.createJSONusuarios(listaDeUsuarios);
        }
    }

    public void modificarUsuarios(List<Usuario>listaDeUsuarios) throws JSONException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Email que quiere modificar");
        String modificar =sc.nextLine();

        for(Usuario u: listaDeUsuarios)
        {
            if(u.getEmail().equalsIgnoreCase(modificar))
            {
                System.out.println("Ingrese contraseña nueva");
                String contraNueva = sc.nextLine();
                u.setContrasenia(contraNueva);
                System.out.println("Ingrese ROL:");
                String rol = sc.nextLine();
                u.setRol(rol);
            }
        }
        System.out.println("Modificando usuario");
        try {
            for(int i=0; i<3; i++)
            {
                Thread.sleep(1000);
                System.out.println("."+".");
            }
        }catch (Exception e)
        {
            throw new ErrorDeModificacion("Error al modificar un usuairo");
        }
        GestionJSON.createJSONusuarios(listaDeUsuarios);
    }

}
