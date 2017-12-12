
public class Person {
	
	//Variables
	String name;
	int age;
	String occupation;

	//Constructor
	public Person (String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.occupation = job;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}
	
	//toString Override
	public String toString() {
		
		return "Name: " + name + " | Age: " + age + " | Occupation: " + occupation;
		
	}
	
	
	
}
