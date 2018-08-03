import lti.org.Executive;
import lti.org.Manager;
import lti.org.employee;

public class TestEmployee {

	public static void main(String[] args) {

		Manager mgr = new Manager("Lili", 7000, 2000);
		showSalary(mgr);

		Executive exec = new Executive("Milli", 9000, 3000);
		showSalary(exec);
	}
	private static void showSalary(employee emp) {
		if (emp instanceof Manager)
		System.out.println("Manger"+emp.getSalary());
		else
			System.out.println("Exec"+emp.getSalary());
	}
	

//	private static void showSalary(Executive exec) {
//		System.out.println(exec.getSalary());
//	}
//
//	private static void showSalary(Manager mgr) {
//		System.out.println(mgr.getSalary());
//
//	}

}
