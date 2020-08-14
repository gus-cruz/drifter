import database.entities.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] arg){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.car_store.jpa" );

        Vehicle vehicle = new Vehicle(
                "Hyundai",
                "HB20",
                "Preta",
                "daledele",
                "123abc",
                2020,
                2019,
                120,
                6,
                "Car",
                15,
                "Diesel",
                150,
                5000.00
        );

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(vehicle);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}