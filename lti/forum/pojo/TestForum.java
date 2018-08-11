package lti.forum.pojo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestForum {
	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		User user = new User();
		User.setuserId(10);
		dept.setName("admin");
		dept.setLocation("Andheri,Mumbai");

		session.save(dept);
		tx.commit();

	}
	
	@Test
	public void testCase2() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Department dept= (Department) session.get(Department.class, 10);
		
		Employee emp= new Employee();
		emp.setEmpno(1001);
		emp.setName("vishal dabane");
		emp.setSalary(3000.0);
		emp.setDept(dept);
		session.save(emp);
		
		tx.commit();
		
	}
	
	@Test
	public void testCase3() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Department dept= (Department) session.get(Department.class, 10);
		System.out.println(dept.getName());
		
		
		System.out.println(dept.getEmployees());
		
		tx.commit();
		
	}

}
