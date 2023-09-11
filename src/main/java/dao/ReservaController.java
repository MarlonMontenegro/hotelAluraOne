package main.java.dao;


import main.java.modelo.Reserva;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReservaController {

    private final EntityManager manager;

    public ReservaController(EntityManager manager) {
        this.manager = manager;
    }

    public void guardar(Reserva reserva) {
        this.manager.persist(reserva);
    }


    public List<Reserva> buscar() {

        String jpql = "SELECT r FROM Reserva r";
        TypedQuery<Reserva> consulta = manager.createQuery(jpql, Reserva.class);
        return  consulta.getResultList();

    }
}
