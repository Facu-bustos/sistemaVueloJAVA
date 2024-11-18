package SistemaDeLoggeo;

import Clases.Administrador;
import Clases.AgenteVenta;
import Clases.Pasajero;
import Clases.Usuario;
import GestionJSON.GestionJSON;
import Menues.MenuAdministrador;
import Menues.MenuPasajero;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SistemaLoggin {
    // Atributos
    private List<Usuario> listaDeUsuarios;

    public SistemaLoggin() throws JSONException {
        this.listaDeUsuarios = GestionJSON.mapeoPasajero();
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SistemaLoggin that)) return false;
        return Objects.equals(getListaDeUsuarios(), that.getListaDeUsuarios());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getListaDeUsuarios());
    }

    @Override
    public String toString() {
        return "SistemaLoggin{" +
                "listaDeUsuarios=" + listaDeUsuarios +
                '}';
    }

    public void loggear() throws JSONException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese email:");
        String emailLoggeo = sc.nextLine();
        System.out.println("Ingrese contraseña:");
        String contrasenia = sc.nextLine();
        System.out.println("Ingrese rol");
        String rol = sc.nextLine();

        boolean encontrado = false;

        for(Usuario u: listaDeUsuarios)
        {
            if(u.getEmail().equalsIgnoreCase(emailLoggeo)&&u.getContrasenia().equalsIgnoreCase(contrasenia) && u.getRol().equalsIgnoreCase(rol))
            {
                Administrador ad = new Administrador();
                encontrado = true;
                if(encontrado==true)
                {
                    ad.mostrarMenu();
                }
            } else if (u.getEmail().equalsIgnoreCase(emailLoggeo)&&u.getContrasenia().equalsIgnoreCase(contrasenia) && u.getRol().equalsIgnoreCase(rol)) {

                Pasajero pa = new Pasajero();
                encontrado=true;
                if(encontrado==true)
                {
                    pa.mostrarMenu();
                }
            }else
            {
                AgenteVenta agente = new AgenteVenta();
                encontrado=true;
                if(encontrado==true)
                {
                    agente.mostrarMenu();
                }
            }
        }



        if(encontrado==false)
        {
            if(rol.equalsIgnoreCase("administrador"))
            {
                Usuario ad = new Administrador();
                ad.setEmail(emailLoggeo);
                ad.setContrasenia(contrasenia);
                ad.setRol(rol);
                listaDeUsuarios.add(ad);
                //ACA VA EL LLAMADO PARA CREAR JSON USSER
            } else if (rol.equalsIgnoreCase("pasajero")) {
                Usuario pa = new Pasajero();
                pa.setEmail(emailLoggeo);
                pa.setContrasenia(contrasenia);
                pa.setRol(rol);
                listaDeUsuarios.add(pa);
                //ACA VA EL LLAMADO PARA CREAR JSON USSER
            }else
            {
                Usuario ag = new AgenteVenta();
                ag.setEmail(emailLoggeo);
                ag.setContrasenia(contrasenia);
                ag.setRol(rol);
                listaDeUsuarios.add(ag);
                //ACA VA EL LLAMADO PARA CREAR JSON USSER
            }
        }
    }
}
