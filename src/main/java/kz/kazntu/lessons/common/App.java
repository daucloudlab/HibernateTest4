package kz.kazntu.lessons.common;

// http://www.mkyong.com/hibernate/maven-hibernate-annonation-mysql-example/

import kz.kazntu.lessons.utils.HibernateUtil;
import org.hibernate.Session;

public class App {
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("4718");
        stock.setStockName("GOOG");

        session.save(stock);
        session.getTransaction().commit();

        HibernateUtil.shutdown();
    }
}
