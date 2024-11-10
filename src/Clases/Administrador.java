package Clases;

public class Administrador extends Usuario{

    //ATRIBUTOS

    //CONSTRUCTOR

    public Administrador(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, String email, String contrasenia) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre, email, contrasenia);
    }

    public Administrador() {
    }

    public Administrador(String email, String contrasenia) {
        super(email, contrasenia);
    }

    //SETTER

    //GETTER

    //METODOS


    @Override
    public String toString() {
        return "Administrador{}" + super.toString();
    }
}
