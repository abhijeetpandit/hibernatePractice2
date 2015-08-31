import java.util.HashSet;
import java.util.Set;

import org.abhi.anotated.Car;
import org.abhi.anotated.Showroom;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestAnnotationjoin {
	@Test
	public void test1() {
		try {
			Configuration configuration = new Configuration().configure("ann_hib.cfg.xml").addAnnotatedClass(Showroom.class).addAnnotatedClass(Car.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			Session session = sessionFactory.openSession();
			Set<Car> list = new HashSet<>();
			list.add(new Car(0, "I10", "black"));
			list.add(new Car(0, "I20", "red"));
			list.add(new Car(0, "I30", "orange"));
			list.add(new Car(0, "I40", "white"));
			Showroom showroom = new Showroom(0, "abhi", list);
			Transaction transaction = session.beginTransaction();
			
			session.save(showroom);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
