public class SalaryPredicate implements Predicate<Person> {

	private double amount;

	SalaryPredicate() {
	}

	SalaryPredicate(double amount) {
		if (amount < 0)
			this.amount = 0;
		else
			this.amount = amount;
	}

	@Override
	public boolean match(Person param) {
		if (param instanceof Employee) {
			if (((Employee) param).getSalary() < amount)
				return true;
		}
		return false;
	}

}
