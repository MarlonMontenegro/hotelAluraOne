package main.java.dao;


import main.java.modelo.Reserva;

import javax.persistence.EntityManager;

public class ReservaDao {

    private EntityManager manager;

    public ReservaDao(EntityManager manager) {
        this.manager = manager;
    }

    public void guardar(Reserva reserva) {
        this.manager.persist(reserva);
    }



}
