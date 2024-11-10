package Clases;

import java.util.Objects;

public class Escala {
    private String aeropueto;
    private String hora_salida;

    public Escala()
    {

    }

    public Escala(String aeropueto, String hora_salida) {
        this.aeropueto = aeropueto;
        this.hora_salida = hora_salida;
    }

    public String getAeropueto() {
        return aeropueto;
    }

    public void setAeropueto(String aeropueto) {
        this.aeropueto = aeropueto;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Escala escala)) return false;
        return Objects.equals(aeropueto, escala.aeropueto) && Objects.equals(hora_salida, escala.hora_salida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aeropueto, hora_salida);
    }

    @Override
    public String toString() {
        return "Escala{" +
                "aeropueto='" + aeropueto + '\'' +
                ", hora_salida='" + hora_salida + '\'' +
                '}';
    }
}
