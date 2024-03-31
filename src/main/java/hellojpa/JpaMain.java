package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        //code

        EntityTransaction tx = em.getTransaction();
        tx.begin();

    try{

        em.remove(1L);
        tx.commit();
    }catch (Exception e ){
        tx.rollback();
    }finally {
        em.close();
    }
        emf.close();
    }
}
