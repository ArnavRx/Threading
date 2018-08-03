package lti.org;

public class Manager extends employee {
	private double commision;

	public Manager() {

	}

	public Manager(String empName, double salary, double commision) {
		super(empName, salary);
		this.commision = commision;
	}

	@Override
	public void payslip() {

		super.payslip();
		System.out.println("Commision " + commision);
	}

	@Override
	public double getSalary() {

		return super.getSalary() + commision;
	}
}
