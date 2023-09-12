package main.java.controller;

import main.java.dao.ReservaDao;
import main.java.modelo.Reserva;
import javax.persistence.EntityManager;
import java.util.List;

public class ReservaController {

    private final ReservaDao reservaDao;

    public ReservaController(EntityManager entityManager) {
        this.reservaDao = new ReservaDao(entityManager);
    }

    public void guardarReserva(Reserva reserva) {
        reservaDao.guardar(reserva);
    }

    public List<Reserva> buscar() {
        return reservaDao.buscar();
    }

    public void eliminar(int id) {
        reservaDao.eliminarReserva(id);
    }

}
