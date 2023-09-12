package main.java.dao;

import main.java.modelo.Reserva;

import javax.persistence.*;
import java.util.List;

public class ReservaDao {

    private final EntityManager manager;

    public ReservaDao(EntityManager manager) {
        this.manager = manager;
    }

    public void guardar(Reserva reserva) {
        this.manager.persist(reserva);
    }


    public List<Reserva> buscar() {
        String jpql = "SELECT r FROM Reserva r";
        TypedQuery<Reserva> consulta = manager.createQuery(jpql, Reserva.class);
        return consulta.getResultList();
    }


    public void eliminarReserva(int id) {

        EntityTransaction entityTransaction = manager.getTransaction();
        try {
            entityTransaction.begin();

            String jpql = "DELETE FROM Reserva r WHERE r.id = :id";
            Query eliminar = manager.createQuery(jpql);

            eliminar.setParameter("id", id);
            eliminar.executeUpdate();

            entityTransaction.commit();
        } catch (Exception e) {

            if (entityTransaction != null && entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            throw new RuntimeException("Error al eliminar la reserva.", e);
        }
    }
}
