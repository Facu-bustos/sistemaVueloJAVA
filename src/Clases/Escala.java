package Clases;

public class Escala {

    // ATRIBUTOS

    private String aeropuerto;
    private String horaSalida;

    // CONSTRUCTOR

    public Escala(String aeropuerto, String horaSalida) {
        this.aeropuerto = aeropuerto;
        this.horaSalida = horaSalida;
    }

    public Escala() {

    }


    public String getAeropueto() {
        return aeropuerto;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    // SETTER

    public void setAeropueto(String aeropueto) {
        this.aeropuerto = aeropueto;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    // METODOS

    @Override
    public String toString() {
        return "Escala{" +
                "aeropueto='" + aeropuerto + '\'' +
                ", hora_salida='" + horaSalida + '\'' +
                '}';
    }

}
