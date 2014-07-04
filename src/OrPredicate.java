import java.util.ArrayList;
import java.util.List;


public class OrPredicate<T> implements Predicate<T> {
	private List<Predicate<T>> pred = new ArrayList<Predicate<T>>();;

	OrPredicate(Predicate<T> pred1, Predicate<T> pred2) {
		pred.add(pred1);
		pred.add(pred2);
	}

	OrPredicate(List<Predicate<T>> list) {
		this.pred.addAll(list);
	}

	OrPredicate(Predicate<T>... predicats) {
		for (Predicate<T> pred : predicats) {
			this.pred.add(pred);
		}
	}

	@Override
	public boolean match(T param) {
		boolean answer = false;
		for (Predicate<T> predicateIterator : pred) {
			if (predicateIterator.match(param)) {
				answer = true;
				break;
			}
		}
		return answer;
	}

}
