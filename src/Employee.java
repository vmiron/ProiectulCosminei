public class Employee extends Person {
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String email, int age, double salary) {
		super(name, email, age);
		if (salary < 0)
			this.salary = 0;
		else
			this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

}
