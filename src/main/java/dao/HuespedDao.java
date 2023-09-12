package main.java.dao;

import main.java.modelo.Huesped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class HuespedDao {

    private EntityManager manager;

    public HuespedDao(EntityManager manager) {
        this.manager = manager;
    }

    public void guardar(Huesped huesped) {
        this.manager.persist(huesped);
    }

    public List<Huesped> buscar() {
        String jpql = "SELECT h FROM Huesped h";
        TypedQuery<Huesped> consulta = manager.createQuery(jpql, Huesped.class);
        return consulta.getResultList();
    }


    public void eliminarHuesped(int id) {

        EntityTransaction entityTransaction = manager.getTransaction();

        try {
            entityTransaction.begin();

            String jpql = "DELETE FROM Huesped h WHERE h.id = :id ";
            Query eliminar = manager.createQuery(jpql);

            eliminar.setParameter("id", id);
            eliminar.executeUpdate();
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction != null && entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            throw new RuntimeException("Error al eliminar al Huesped.", e);
        }

    }

}
