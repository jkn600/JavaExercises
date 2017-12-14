
public class Exercise {

	public static void main(String[] args) {

		Exercise nums = new Exercise();

		/*
		 * //DoggoCompetition DogManager dm = new DogManager(); dm.populate();
		 * dm.outputList();
		 * 
		 */

		System.out.println(nums.findFactorial(3628800));
	}

	public String findFactorial(int number) {
		// Variables
		// Store passed value
		int initNumber = number;

		// Initialise factorial
		int factorial = 0;

		// Perform factorial division
		for (int i = 2; number != 1; i++) {
			number = number / i;
			// System.out.println(number); (DEBUG PURPOSES)
			// If number is equal to 0, then no factorial found and break statement
			if (number == 0) {

				factorial = 0;
				break;

			}

			// Set factorial
			factorial = i;

		}

		/*
		 * If factorial is equal to 0 as a result of above, print the attempted number
		 * with "NONE" next to it
		 */
		if (factorial == 0) {

			// Convert int to String and return value
			return String.valueOf(initNumber) + " NONE";
		}

		// Convert int to String and return value
		return String.valueOf(factorial);
	}

}
