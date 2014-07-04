public class AgePredicate implements Predicate<Person> {

	private int age;

	AgePredicate() {
	}

	AgePredicate(int age) {
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
	}

	@Override
	public boolean match(Person param) {
		if (param.getAge() < age)
			return true;
		return false;
	}

}
