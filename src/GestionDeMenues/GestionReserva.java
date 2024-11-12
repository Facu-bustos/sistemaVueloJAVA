package GestionDeMenues;

import Clases.Reserva;
import Clases.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class GestionReserva {
    private List<Reserva> reservas;

    public GestionReserva(List<Reserva> reservas) {
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> obtenerReservasPorVuelo(Vuelo vuelo) {
        List<Reserva> reservasDelVuelo = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getVuelo().equals(vuelo)) {
                reservasDelVuelo.add(reserva);
            }
        }
        return reservasDelVuelo;
    }

    public List<Reserva> obtenerTodasLasReservas() {
        return reservas;
    }
}
