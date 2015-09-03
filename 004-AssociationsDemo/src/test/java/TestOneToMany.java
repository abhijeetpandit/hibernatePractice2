import java.util.HashSet;
import java.util.Set;

import org.abhi.datamodel.Actor;
import org.abhi.datamodel.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestOneToMany {
	@Test
	public void test() {
		
		try {
			
		
		Configuration configuration = new Configuration().configure("oneToMany.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Set<Actor> actors = new HashSet<>();
		actors.add(new Actor(null, "Abhi"));
		actors.add(new Actor(null, "Pandit"));
		
		Movie movie= new Movie(null, "Bahubali", actors);
		
		session.save(movie);
		transaction.commit();
		session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void testSelect() {
		try {
			Configuration configuration = new Configuration().configure("oneToMany.cfg.xml");
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			Session session = sessionFactory.openSession();
			
			Transaction transaction= session.beginTransaction();
			Actor actor = (Actor) session.load(Actor.class, 2);
			System.out.println(actor);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
