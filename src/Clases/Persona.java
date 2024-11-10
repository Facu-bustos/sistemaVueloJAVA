package Clases;

import java.util.Date;

public abstract class Persona {

    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private String DNI;
    private String direccion;
    private String nacionalidad;
    private String telefono;
    private String fechaNacimiento;

    //CONSTRUCTOR

    public Persona(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre) {
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public Persona() {

    }

    //GETTER

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public String getApellido() {
        return apellido;
    }


    //SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //METODOS


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
