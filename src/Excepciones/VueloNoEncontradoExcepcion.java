package Excepciones;

public class VueloNoEncontradoExcepcion extends RuntimeException {
    public VueloNoEncontradoExcepcion(String message) {
        super(message);
    }
}
