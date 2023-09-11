package main.java.dao;

import main.java.modelo.Huesped;
import main.java.modelo.Reserva;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class HuespedDao {

    private EntityManager manager;

    public HuespedDao(EntityManager manager) {
        this.manager = manager;
    }

    public void guardar(Huesped huesped){
        this.manager.persist(huesped);
    }
    public List<Huesped> buscar() {
        String jpql = "SELECT h FROM Huesped h";
        TypedQuery<Huesped> consulta = manager.createQuery(jpql, Huesped.class);
        return  consulta.getResultList();
    }
}
