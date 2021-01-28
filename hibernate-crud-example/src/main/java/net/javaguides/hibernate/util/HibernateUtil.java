package net.javaguides.hibernate.util;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
import org.hibernate.boot.registry.*;
import org.hibernate.service.*;
import net.javaguides.hibernate.model.*;
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			try
			{
				Configuration configuration;
				configuration=new Configuration();
				Properties settings;
				settings=new Properties();
				settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernatedb?useSSL=false");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "Abhishek@5397");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "create-drop");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Student.class);
				ServiceRegistry serviceRegistry;
				serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				sessionFactory=configuration.buildSessionFactory(serviceRegistry);
			}catch(Exception exception)
			{
				System.out.println("Exception occurred : "+exception);
				exception.printStackTrace();
			}
		}
		return sessionFactory;
	}
}