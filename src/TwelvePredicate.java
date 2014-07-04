
public class TwelvePredicate implements Predicate<Person> {

	@Override
	public boolean match(Person param) {
		Predicate<Person> emailPred =  new GmailPredicate();
		Predicate<Person> notPredicate = new NotPredicate(emailPred);
		Predicate<Person> salaryPredicate = new SalaryPredicate(100);
		
		return (new AndPredicate(notPredicate, salaryPredicate).match(param));
	}
	
}
