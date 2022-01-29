package emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate_Main {
	public static void main(String[] args) {
		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 Metadata md=new MetadataSources().getMetadataBuilder().build();
		 SessionFactory sf=md.getSessionFactoryBuilder().build();
		 Session s=sf.openSession();
		 Transaction t=s.beginTransaction();
	   	 employee e=new employee();
	   	 e.setEmpno(3);
	   	 e.setEmpname("karthik");
	   	 e.setEmpemail("k@c.c");
	   	 // s.save(e);
	   	 employee e1=s.get(employee.class,2);
	   	  System.out.println(e1);
	   	 t.commit();
	   	 s.close();
	   	 sf.close();
	    }
	}

		