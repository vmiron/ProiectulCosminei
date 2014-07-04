
public class GmailPredicate implements Predicate<Person>{

	@Override
	public boolean match(Person param) {
		if(param.getEmail().trim().endsWith("@gmail.com"))
			return true;
		return false;
	}

}
