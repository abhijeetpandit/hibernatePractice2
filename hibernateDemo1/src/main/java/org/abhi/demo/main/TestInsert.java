package org.abhi.demo.main;


import org.abhi.demo.datamodel.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestInsert {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure(); 
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(new Movie(null, "Inception", "Nolan", "Dream"));
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("inserted");
	}
}
