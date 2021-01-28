package net.javaguides.hibernate.dao;
import net.javaguides.hibernate.model.*;
import net.javaguides.hibernate.util.*;
import org.hibernate.*;
import java.util.*;
public class StudentDAO {
	
	//add student
	//get all students
	//get student by id
	//update student
	//delete student
	
	public void add(Student student) throws Exception
	{
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
		}catch(Exception exception)
		{
			if(transaction!=null)transaction.rollback();
			throw exception;
		}
	}
	
	public void update(Student student) throws Exception
	{
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			session.saveOrUpdate(student);
			transaction.commit();
		}catch(Exception exception)
		{
			if(transaction!=null)transaction.rollback();
			throw exception;
		}
	}
	
	public Student getStudentById(long id) throws Exception
	{
		Transaction transaction=null;
		Student student = null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			student=session.get(Student.class, id);
			//student = session.load(Student.class,id);
			transaction.commit();
		}catch(Exception exception)
		{
			if(transaction!=null)transaction.rollback();
			throw exception;
		}
		return student;
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> getAll() throws Exception
	{
		List<Student> students=null;
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			students=session.createQuery("from Student").list();
			transaction.commit();
		}catch(Exception exception)
		{
			if(transaction!=null) transaction.rollback();
			throw exception;
		}
		return students;
	}
	
	public void delete(long id) throws Exception
	{
		Transaction transaction=null;
		Student student=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			student=session.get(Student.class, id);
			session.delete(student);
			transaction.commit();
		}catch(Exception exception)
		{
			if(transaction!=null)transaction.rollback();
		}
	}
}
