package coding_questions;

public class Basic_swap_two {

	// Program swap without using third variables
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 9;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a + " " + b);

	}

}
