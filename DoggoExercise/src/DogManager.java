import java.util.ArrayList;

public class DogManager {
	
	public DogManager() {
	}
	
	//Dog List
	ArrayList<Dog> dogList = new ArrayList<Dog>();
	
	//Populate List
	public void populate() {
		for(int i = 0; i < 100; i++) {
			dogList.add(new Dog(i + 1));
		}
	}

	//Loop through List
	public void outputList() {
		for(Dog d : dogList) {
			System.out.println(d);
		}
	}
	
}
