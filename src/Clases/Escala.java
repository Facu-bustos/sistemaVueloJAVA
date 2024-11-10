package Clases;

public class Escala {

    // ATRIBUTOS

    private String aeropueto;
    private String horaSalida;

    // CONSTRUCTOR

    public Escala(String aeropueto, String horaSalida) {
        this.aeropueto = aeropueto;
        this.horaSalida = horaSalida;
    }

    public Escala() {

    }

    // GETTER

    public String getAeropueto() {
        return aeropueto;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    // SETTER

    public void setAeropueto(String aeropueto) {
        this.aeropueto = aeropueto;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    // METODOS

    @Override
    public String toString() {
        return "Escala{" +
                "aeropueto='" + aeropueto + '\'' +
                ", hora_salida='" + horaSalida + '\'' +
                '}';
    }
}