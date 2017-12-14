import java.util.ArrayList;
import java.util.Collections;

public class Exercises {

	public static void main(String[] args) {
		Exercises obj = new Exercises();

		System.out.println(obj.getSandwhich("breadjambread"));

		System.out.println("---- Task 3 ----");
		System.out.println(obj.evenlySpaced(4, 6, 2));

		System.out.println("---- Task 4 ----");
		System.out.println(obj.nTwice("any", 3));
	}

	public String doubleChar(String word) {

		// char[] doubledLetters = null;

		word.toCharArray();

		return null;
	}

	public String getSandwhich(String name) {

		name.split("bread");

		return name;
	}

	public boolean evenlySpaced(int a, int b, int c) {

		boolean isEvenlySpaced = false;

		ArrayList<Integer> nums = new ArrayList<Integer>();

		nums.add(a);
		nums.add(b);
		nums.add(c);
		Collections.sort(nums);
		int diff1 = nums.get(0) - nums.get(1);
		int diff2 = nums.get(1) - nums.get(2);

		int space1 = Math.abs(diff1);
		int space2 = Math.abs(diff2);

		if (space1 == space2) {
			isEvenlySpaced = true;
		}

		return isEvenlySpaced;
	}

	// Deprecated
	/*
	 * // Method to sort a string alphabetically for nTwice public static String
	 * sortString(String inputString) { // convert input string to char array char
	 * tempArray[] = inputString.toCharArray();
	 * 
	 * // sort tempArray Arrays.sort(tempArray);
	 * 
	 * // return new sorted string (strings are immutable so we have to create a new
	 * // one here) return new String(tempArray); }
	 */

	// Reverse String function for nTwice
	public static String reverseIt(String source) {
		int i, len = source.length();
		StringBuilder dest = new StringBuilder(len);

		for (i = (len - 1); i >= 0; i--) {
			dest.append(source.charAt(i));
		}

		return dest.toString();
	}

	public String nTwice(String word, int count) {

		String first3 = "";
		String last3 = "";
		String returnedString = "";

		// first 3
		for (int i = 0; i < count; i++) {
			first3 += word.charAt(i);
		}

		// last 3
		for (int i = word.length() - 1; i >= (word.length() - count); i--) {
			last3 += word.charAt(i);
		}

		last3 = reverseIt(last3);
		returnedString = first3 + last3;

		return returnedString;
	}

	public String endsLy(String word) {

		return "";
	}

	// Example JUnit test method
	public int addTog(int a, int b) {
		return a + b;
	}
}
