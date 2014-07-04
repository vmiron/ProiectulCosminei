
public class NamePredicate implements Predicate<Person> {

	private String name="";
	
	NamePredicate(){}
	NamePredicate(String name){
		this.name= name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	@Override
	public boolean match(Person param) {
		if(name.toLowerCase().trim().equals(param.getName().toLowerCase().trim()))
			return true;
		
		return false;
	}


}
