
public class Dog {

	//Variables declarations
	String name;
	int age;
	float height;
	int place;
	
	
	//Constructor
	public Dog(int place) {
		this.place = place;
	}
	
	//Constructor 2
/*	public Dog(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}*/
	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return  place + ": " + "Dog [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	

}
