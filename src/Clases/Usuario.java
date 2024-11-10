package Clases;

import java.util.Date;

public abstract class Usuario extends Persona{

    //ATRIBUTOS

    private String email;
    private String contrasenia;

    //CONSTRUCTOR


    public Usuario(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, String email, String contrasenia) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre);
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public Usuario(String email, String contrasenia) {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public Usuario(){

    }

    //GETTER

    public String getEmail() {
        return email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    //SETTER

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //METODOS

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", contrasenia='" + contrasenia  + super.toString() +
                '}';
    }
}
