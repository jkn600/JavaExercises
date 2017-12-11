
public class Exercises {
	//Global Declaration
	static boolean isTorF = true;
	
	public static void main(String[] args) {
		
		//Object Creation for method calling
		Exercises obj = new Exercises();

		//Assignment
		String output = "Hello World!";
		System.out.println(output);
		
		//Parameters
		System.out.println("** Parameters **");
		obj.parameters("Test String");
		
		//Return Types
		System.out.println("** Return Types **");
		System.out.println(obj.returnTypes());
		
		//Parameters/Operators + Conditionals 1/2
		System.out.println("** Parameters/Operators + Conditionals 1/2 **");
		System.out.println(obj.paramOp(5, 8, isTorF));
		
		//Iteration
		System.out.println("** Iteration **");
		obj.iteration();
		
		//Arrays
		System.out.println("** Arrays **");
		obj.arrays();
		
		//Iteration/Arrays
		System.out.println("** Iteration/Arrays **");
		obj.iterationArray(obj.arrays());
		
		//Iteration/Arrays
		System.out.println("** Iteration/Arrays 2 **");
		obj.iterationArrayTwo();
	}
	
	//Parameters
	public void parameters(String param1) {
		System.out.println(param1);
		
	}
	
	//Return Types
	public String returnTypes() {
		return "Hello World!";
	}
	
	//Parameters/Operators + Conditionals 1/2
	public int paramOp(int one, int two, boolean trueFalse) {
		
		int result;
		
		if(one == 0) {
			return two;
		} else if(two == 0) {
			return one;
		} else if(trueFalse) {
			result = one + two;
		} else {
			result = one * two;
		}
		
		return result;
	}
	
	//Iteration
	public void iteration() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(paramOp(i, i*2, isTorF));
		}
		
	}
	
	//Arrays
	public int[] arrays() {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//System.out.println(paramOp(array[3], array[7], isTorF));
		
		return array;
		
	}
	
	//Iteration/Arrays
	public void iterationArray(int[] array) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	//Iteration/Arrays 2
		public void iterationArrayTwo() {
			
			//Initialise fixed-length Array
			int[] array = new int[10];
			
			//Populate Array
			for(int i = 0; i < 10; i++) {
				array[i] = i + 1;
			}
			
			//Iterate through Array and output array[j] * 10
			for (int j = 0; j < 10; j++) {
				array[j] = array[j] * 10;
				System.out.println(array[j]);
			}
			
		}

}
