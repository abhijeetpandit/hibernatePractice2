import java.util.ArrayList;
import java.util.List;

import org.abhi.datamodel.Car;
import org.abhi.datamodel.Showroom;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestMain {
	@Test
	public void testInsert() {
		try {
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			Session session = sessionFactory.openSession();
			List<Car> list = new ArrayList<>();
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
