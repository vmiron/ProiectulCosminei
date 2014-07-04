public class NotPredicate<T> implements Predicate<T> {

	private Predicate<T> predicate;

	NotPredicate(Predicate<T> predicate) {
		this.predicate = predicate;
	}

	@Override
	public boolean match(T param) {
		boolean answer = predicate.match(param);
		return !answer;
	}

}
//? super T