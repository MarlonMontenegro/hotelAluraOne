package main.java.pruebasConexiones;

import javax.persistence.EntityManager;
import main.java.utils.JPAUtil;


public class DataBaseConnectionTest {


    public static void main(String[] args) {

        try {

            EntityManager manager = JPAUtil.getEntityManager();
            System.out.println("Conexion Existosa!...");

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Fallo en conexion");

        }


    }


}
