import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

import javax.jws.Oneway;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 Person p1 = new Person("Cosmina veronica","cosmina@gmail.com",21);
	 Employee e1 = new Employee("Veronica", "Veronica@yahoo.com ", 12, 30);

	 Predicate<Person> emailPred = new GmailPredicate();
	 Predicate<Person> agePred =  new AgePredicate(18); 
	 Predicate<Person> namePredicate= new NamePredicate("Veronica");
	 Predicate<Person> notPred = new NotPredicate(emailPred); //doesn't have an gmail address
	 Predicate<Person> orPredicate = new OrPredicate<Person>(agePred,notPred,namePredicate);
	 
	 new NotPredicate(new SalaryPredicate());
	 //11
	 Predicate<Person> andPredicate = new AndPredicate<Person>(notPred, agePred);
	 System.out.println(andPredicate.match(p1));
	 
	 //12
	 Predicate<Person> twelvePredicate = new TwelvePredicate();
	 System.out.println("twelve: " + twelvePredicate.match(e1));
	 
	 //13
	 List<Person> list = new ArrayList<Person>();
	 list.add(new Person("Cos","cos@gmail.com",20));
	 list.add(new Person("Cosmi","cosmi@gmail.com",21));
	 list.add(new Person("Cosmina","cos@yahoo.com",20));
	 list.add(new Employee("Cocos","cocos@gmail.com",20,400));
	 list.add(new Person("Vero","vero@gmail.com",20));
	 List<Person> coolPersons = filter(list,emailPred);
	 
	 for(Person onePerson : coolPersons){
			System.out.println(onePerson.getName());
		}
	}

	static List<Person> filter(List<Person> allPersons, Predicate<Person> predicate){
		List<Person> specialPersons= new ArrayList<Person>();
		for(Person onePerson : allPersons){
			if(predicate.match(onePerson)){
				specialPersons.add(onePerson);
			}
		}
		return specialPersons;
 	}
}
