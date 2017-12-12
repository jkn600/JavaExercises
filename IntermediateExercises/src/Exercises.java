
public class Exercises {

	public static void main(String[] args) {
		
		Exercises obj = new Exercises();
		
		//BlackJack
		System.out.println("** BlackJack **");
		System.out.println(obj.blackJack(6,  3));
		
		//Unique Sum
		System.out.println("** Unique Sum **");
		System.out.println(obj.uniqueSum(7,  6, 7));

	}

	public int blackJack(int a, int b) {
		int blackJ = 21;
		int diff1;
		int diff2;
		int finalVal = 0;
		
		if(a < 1 | b < 1) {
			 return finalVal;
		} else if(a > 21 && b > 21) { 
			return finalVal;
		} else if(a > 21) {
			finalVal = b;
		} else if(b > 21) {
			finalVal = a;
		} else {
			diff1 = blackJ - a;
			diff2 = blackJ - b;
			
			if(diff1 > diff2) {
				finalVal = b;
			} else {
				finalVal = a;
			}
		}
		
		return finalVal;
	}
	
	public int uniqueSum(int a, int b, int c) {
		int sumOfValues;
		
		if(a == b || a == c) {
			sumOfValues = b + c;
		} else if(b == a || b == c) {
			sumOfValues = a + c;
		} else if(c == a || c == b) {
			sumOfValues = a + b;
		} else {
			sumOfValues = a + b + c;
		}
		
		return sumOfValues;
	}
}
