package coding_questions;

public class Basic_odd_even_number {
	
	// Program:-  Odd and even number
	// 1: ODD
	// 2: EVEN
	
	public static void main(String[] args) {
		
		odd_even(6);
		
	}
	
	
	public static void odd_even(int a) {
		
		if(a%2 ==0) {
			System.out.println("EVEN NUMBER");
			
		}
		else {
			System.out.println("ODD NUMBER");
		}
		
		return;
	}

}
