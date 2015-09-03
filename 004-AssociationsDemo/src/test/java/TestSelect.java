import org.abhi.datamodel.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestSelect {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("oneToMany.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction= session.beginTransaction();
		Actor actor = (Actor) session.load(Actor.class, new Integer(2));
		System.out.println(actor.getMovie());
		transaction.commit();
		session.close();
	}
}
