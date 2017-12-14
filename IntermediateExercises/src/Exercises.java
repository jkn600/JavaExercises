
public class Exercises {

	public static void main(String[] args) {

		// TOO HOT boolean declaration
		boolean isItSummer = false;

		Exercises obj = new Exercises();

		// BlackJack
		System.out.println("** BlackJack **");
		System.out.println(obj.blackJack(6, 3));

		// Unique Sum
		System.out.println("** Unique Sum **");
		System.out.println(obj.uniqueSum(7, 6, 7));

		// TOO HOT?
		System.out.println("** TOO HOT? **");
		System.out.println(obj.tooHot(58, isItSummer));

		// Person Manager
		PersonManager pm = new PersonManager();

		// Person(s)
		// pm.personList.add(new Person("Joshua", 22, "QA Consultant"));
		Person p1 = new Person("Joshua", 22, "QA Consultant");
		Person p2 = new Person("Lee", 24, "QA Consultant");
		Person p3 = new Person("Matt", 23, "QA Consultant");
		Person p4 = new Person("James", 26, "QA Consultant");
		Person p5 = new Person("Shirley", 22, "QA Consultant");
		Person p6 = new Person("Sam", 24, "QA Consultant");

		// Populate List
		pm.personList.add(p1);
		pm.personList.add(p2);
		pm.personList.add(p3);
		pm.personList.add(p4);
		pm.personList.add(p5);
		pm.personList.add(p6);

		// Output List
		System.out.println("** List Output **");
		pm.outputList();

		// Display found Employee
		System.out.println("** Search Result **");
		System.out.println("1 Result Found: " + pm.findEmployee("James"));
	}

	// BlackJack
	public int blackJack(int a, int b) {
		int blackJ = 21;
		int diff1;
		int diff2;
		int finalVal = 0;

		if (a < 1 | b < 1) {
			return finalVal;
		} else if (a > 21 && b > 21) {
			return finalVal;
		} else if (a > 21) {
			finalVal = b;
		} else if (b > 21) {
			finalVal = a;
		} else {
			diff1 = blackJ - a;
			diff2 = blackJ - b;

			if (diff1 > diff2) {
				finalVal = b;
			} else {
				finalVal = a;
			}
		}

		return finalVal;
	}

	// Unique Sum
	public int uniqueSum(int a, int b, int c) {
		int sumOfValues;

		if (a == b || a == c) {
			sumOfValues = b + c;
		} else if (b == a || b == c) {
			sumOfValues = a + c;
		} else if (c == a || c == b) {
			sumOfValues = a + b;
		} else {
			sumOfValues = a + b + c;
		}

		return sumOfValues;
	}

	// TOO HOT?
	public boolean tooHot(int temp, boolean isSummer) {
		boolean isTooHot = false;

		if (!isSummer) {
			if (60 <= temp && temp <= 90) {
				isTooHot = true;
			} else {
				return isTooHot;
			}
		} else {
			if (60 >= temp && temp <= 100) {
				isTooHot = true;
			} else {
				return isTooHot;
			}
		}
		return isTooHot;
	}
}
