package Excepciones;

public class ReadFail extends RuntimeException {
    public ReadFail(String message) {
        super(message);
    }
}
