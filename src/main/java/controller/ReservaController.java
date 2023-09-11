package main.java.controller;

import main.java.modelo.Reserva;

import javax.persistence.EntityManager;
import java.util.List;

public class ReservaController {

    private final main.java.dao.ReservaController reservaController;

    public ReservaController(EntityManager entityManager) {
        this.reservaController = new main.java.dao.ReservaController(entityManager);
    }

    public void guardarReserva(Reserva reserva) {
        reservaController.guardar(reserva);
    }

    public List<Reserva> buscar() {
        return reservaController.buscar();
    }


}
