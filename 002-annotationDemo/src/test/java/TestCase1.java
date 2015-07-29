import org.abhi.ad.datamodel.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestCase1 {
	
	@Test
	public void testInsert() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		session.save(new Employee(0, "abhi2"));
		session.save(new Employee(0, "pandit2"));
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
