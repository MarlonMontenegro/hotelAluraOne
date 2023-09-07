package main.java.pruebasConexiones;

import javax.persistence.EntityManager;
import main.java.utils.JPAUtils;


public class DataBaseConnectionTest {


    public static void main(String[] args) {

        try {

            EntityManager manager = JPAUtils.getEntityManager();
            System.out.println("Conexion Existosa!...");

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Fallo en conexion");

        }


    }


}
