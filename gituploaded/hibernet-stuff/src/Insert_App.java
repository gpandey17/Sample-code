import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Insert_App 

{

	
	
	public static void main(String args[])
	{
		
		
		Configuration conf=new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session hsession=sf.openSession();
		
		Transaction tx=hsession.beginTransaction();
		
		Emp3 obj=new Emp3();
		
		obj.setId(9899);
		
		obj.setName("arun");
		
		hsession.persist(obj);
		
		tx.commit();
		
		hsession.close();
		
		sf.close();
		
		
		
		
	}
}
