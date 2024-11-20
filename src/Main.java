
import SistemaDeLoggeo.SistemaLoggin;
import org.json.JSONException;

public class Main {
    public static void main(String[] args) throws JSONException {
        SistemaLoggin sistemaLoggeo = new SistemaLoggin();
        sistemaLoggeo.loggear();
    }
}
