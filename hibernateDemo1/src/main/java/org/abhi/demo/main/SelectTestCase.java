package org.abhi.demo.main;

import java.util.List;

import org.abhi.demo.datamodel.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SelectTestCase {
	
	private SessionFactory sessionFactory;
	
	@Before
	public void begin() {
		try {
			Configuration configuration = new Configuration().configure(); 
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSingleSelect() {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			List<Movie> movies = session.createQuery("from Movie").list();
			System.out.println(movies);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*@Test
	public void testMultipleSelect() {
		fail();
	}*/
	
	@After
	public void destroyResources() {
		sessionFactory.close();
		System.out.println("destroyed");
	}
}
