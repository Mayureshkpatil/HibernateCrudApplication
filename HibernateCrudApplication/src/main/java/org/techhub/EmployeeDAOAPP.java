package org.techhub;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class EmployeeDAOAPP {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("mayu");
		emp.setSal(150000);
		session.save(emp);   //save database record
		
//		session.delete(emp);  //we want to delete the employee by using its id.
		
//		session.update(emp); //update record of employee
		
		
		t.commit();
		session.close();
		System.out.println("Record save in database table");
		
//		System.out.println("Record deleted From database table.......");
		
//		System.out.println("Record Update From database table.......");
	}
}

