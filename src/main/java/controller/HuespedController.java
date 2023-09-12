package main.java.controller;

import main.java.dao.HuespedDao;
import main.java.modelo.Huesped;
import javax.persistence.EntityManager;
import java.util.List;

public class HuespedController {

    private final HuespedDao huespedDao;

    public HuespedController(EntityManager entityManager) {
        this.huespedDao = new HuespedDao(entityManager);
    }

    public void guardarHuesped(Huesped huesped) {
        huespedDao.guardar(huesped);
    }

    public List<Huesped> buscar() {
        return huespedDao.buscar();
    }

    public void eliminarHuesped(int id) {
        huespedDao.eliminarHuesped(id);
    }


}
