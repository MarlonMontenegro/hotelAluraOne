package main.java.dao;

import main.java.modelo.Huesped;

import javax.persistence.EntityManager;

public class HuespedDao {

    private EntityManager manager;

    public HuespedDao(EntityManager manager) {
        this.manager = manager;
    }

    public void guardar(Huesped huesped){
        this.manager.persist(huesped);
    }

}
