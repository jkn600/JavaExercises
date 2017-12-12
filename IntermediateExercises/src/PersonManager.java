import java.util.ArrayList;

public class PersonManager {

	//Creating List
	ArrayList<Person> personList = new ArrayList<Person>();
	
	//Loop through list and output to console
	public void outputList() {
		for(Person p : personList) {
			System.out.println(p);
		}
	}
	
	//Search
	public Person findEmployee(String name) {
		Person foundEmployee = null;
		
		for(Person p : personList) {
			if(p.getName().equals(name)) {
				foundEmployee = p;
			}
		}
		return foundEmployee;
	}
	
}
