package Excepciones;

public class ContraseniaIncorrectaExcepcion extends RuntimeException {
    public ContraseniaIncorrectaExcepcion(String message) {
        super(message);
    }
}
