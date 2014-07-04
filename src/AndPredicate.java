import java.util.ArrayList;
import java.util.List;

public class AndPredicate<T> implements Predicate<T>{

	private List<Predicate<T>> pred = new ArrayList<Predicate<T>>();;

	AndPredicate(Predicate<T> pred1, Predicate<T> pred2) {
		pred.add(pred1);
		pred.add(pred2);
	}

	AndPredicate(List<Predicate<T>> list) {
		this.pred.addAll(list);
	}

	AndPredicate(Predicate<T>... predicats) {
		for (Predicate<T> pred : predicats) {
			this.pred.add(pred);
		}
	}

	@Override
	public boolean match(T param) {
		boolean answer = true;
		for (Predicate<T> predicateIterator : pred) {
			if (!predicateIterator.match(param)) {
				answer = false;
				break;
			}
		}
		return answer;
	}

}
