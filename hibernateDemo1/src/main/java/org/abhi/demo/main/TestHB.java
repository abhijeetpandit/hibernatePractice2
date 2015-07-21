package org.abhi.demo.main;

import org.abhi.demo.datamodel.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestHB {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(new Movie(null, "Dark Knight", "Nolan", "Batman"));
		session.getTransaction().commit();
		
	}
}
