package net.javaguides.hibernate;
import net.javaguides.hibernate.dao.*;
import net.javaguides.hibernate.model.*;
import java.util.*;
public class App {
	public static void main(String gg[])
	{
		try
		{
			StudentDAO studentDAO=new StudentDAO();
			//creating student
			Student student1=new Student("Abhishek","Kataria","katariaabhi5397@gmail.com");
			
			//saving student
			studentDAO.add(student1);
			Student student2=new Student("Ankush","Kataria","ankushkataria4597@gmail.com");
			studentDAO.add(student2);
			
			//getting student by id
			student1=studentDAO.getStudentById(1);
			System.out.println("Student retrieved ");
			System.out.println("Id : "+student1.getId());
			System.out.println("Name : "+student1.getFirstName()+" "+student1.getLastName());
			System.out.println("E-mail id : "+student1.getEmail());
			
			//updating student
			student1.setFirstName("Khyati");
			student1.setEmail("1107khyatimehta@gmail.com");
			studentDAO.update(student1);
			List<Student> students=studentDAO.getAll();
			students.forEach(student -> {
				System.out.println("Id : "+student.getId()+", Name : "+student.getFirstName()+" "+student.getLastName()+", E-mail : "+student.getEmail());
			});
			
			//getting all students
			int count=studentDAO.getAll().size();
			System.out.println("Total number of students : "+count);
			
			//deleting student
			studentDAO.delete(1);
			students=studentDAO.getAll();
			System.out.println("Students remaining : "+students.size());
			for(Student s: students)
			{
				System.out.println("Id : "+s.getId()+", Name : "+s.getFirstName()+" "+s.getLastName()+", E-mail : "+s.getEmail());
			}
		}catch(Exception exception)
		{
			System.out.println("Exception caught : "+exception);
		}
	}
}
