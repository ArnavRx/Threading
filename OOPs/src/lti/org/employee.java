package lti.org;

public class employee {
	private int empNo;
	private String empName;
	private double salary;

	public employee() {
	}

	private static int autogen;
	static {
		System.out.println("Employee class loaded...");
		autogen = 1001;
	}

	public employee(String empName, double salary) {
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("Emp No" + empNo);
		System.out.println("Emp Name" + empName);
		System.out.println("Salary" + salary);
	}

	public double getSalary() {
		return salary;
	}
}
