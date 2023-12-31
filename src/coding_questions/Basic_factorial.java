package coding_questions;

public class Basic_factorial {

	// Program:-  factorial of the number
	// 5 = 5*4*3*2*1 =120;
	
	public static void main(String[] args) {

		factorial(5);

	}

	public static void factorial(int a) {

		int fact = 1;
		
		for (int i = 1; i <= a; i++) {
			fact *= i;
		}
		System.out.println(fact);

	}

}
