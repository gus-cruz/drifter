import database.entities.Person;
import database.entities.Vehicle;
import database.enums.GenderENUM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] arg){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.car_store.jpa" );

//        Vehicle vehicle = new Vehicle(
//                "Hyundai",
//                "HB20",
//                "Preta",
//                "dalle",
//                "123abc",
//                2020,
//                2019,
//                120,
//                6,
//                "Car",
//                15,
//                "Diesel",
//                150,
//                5000.00
//        );

        Person user = new Person(
                "Gustavo Ferreira",
                new Date(),
                "12345678901",
                "123",
                GenderENUM.MALE,
                "234",
                "456",
                "gustavo@gmail.com"
        );

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}