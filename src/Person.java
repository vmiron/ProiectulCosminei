public class Person {
	protected String name;
	protected String email;
	protected int age;

	Person() {
	}

	public Person(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

}
