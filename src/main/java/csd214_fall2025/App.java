package csd214_fall2025;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    private EntityManagerFactory emf;
    public void run(){
        // Create the EntityManagerFactory using the persistence unit name from persistence.xml
        emf = Persistence.createEntityManagerFactory("product-pu");
//        populateDatabase();
    }
//
//    public void populateDatabase() {
//        // EntityManager is used to interact with the persistence context
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        try {
//            tx.begin(); // Start a transaction
//
//            System.out.println("Populating database with products...");
//            em.persist(new BookEntity("String author", "String title", 29.99, 10, "String isbn_10", "String description"));
//
//            tx.commit(); // Commit the transaction
//            System.out.println("Population complete.");
//        } catch (Exception e) {
//            // If anything goes wrong, roll back the transaction
//            if (tx.isActive()) {
//                tx.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            // Always close the EntityManager
//            em.close();
//        }
//    }

}
