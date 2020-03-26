package hibernate.test;

//import org.hibernate.mapping.List;

import org.hibernate.Session;

import hibernate.test.dto.EmployeeEntity;

public class TestHibernateInsert {
	
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		
       
		//Add new Employee object
		EmployeeEntity emp = new EmployeeEntity();
		emp.setEmail("lokesh@mail.com");
		emp.setFirstName("lokesh");
		emp.setLastName("gupta");
					EmployeeEntity emp1 = new EmployeeEntity();
					emp1.setEmail("Akash@gmail.com");
					emp1.setFirstName("Akash");
					emp1.setLastName("Pandey");
					
					EmployeeEntity emp2 = new EmployeeEntity();
					emp2.setEmail("Ashish@gmail.com");
					emp2.setFirstName("Ashish");
					emp2.setLastName("Pandey");
								EmployeeEntity emp3 = new EmployeeEntity();
								emp3.setEmail("Praveen@gmail.com");
								emp3.setFirstName("praveen");
								emp3.setLastName("Singh");
		session.beginTransaction();
		session.save(emp);
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.getTransaction().commit();
		
		
		
		
		HibernateUtil.shutdown();
	}

}
