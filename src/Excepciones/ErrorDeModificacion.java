package Excepciones;

public class ErrorDeModificacion extends RuntimeException {
    public ErrorDeModificacion(String message) {
        super(message);
    }
}
