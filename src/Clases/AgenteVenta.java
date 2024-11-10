package Clases;

public class AgenteVenta extends Usuario{

    //ATRIBUTOS

    //CONSTRUCTOR

    public AgenteVenta(String telefono, String fechaNacimiento, String nacionalidad, String apellido, String DNI, String direccion, String nombre, String email, String contrasenia) {
        super(telefono, fechaNacimiento, nacionalidad, apellido, DNI, direccion, nombre, email, contrasenia);
    }

    public AgenteVenta(String email, String contrasenia) {
        super(email, contrasenia);
    }

    public AgenteVenta() {
    }

    //GETTER

    //SETTER

    //METODOS

    @Override
    public String toString() {
        return "AgenteVenta{}" + super.toString();
    }
}
