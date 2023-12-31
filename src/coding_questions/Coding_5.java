package coding_questions;

public class Coding_5 {

	// Reverse a number 
	
	//Number = 234
	//EX =432
	
	public static void main(String[] args) {
		
		int n = 234;
		int rev = 0;
		
		for(int i=0;i<=2;i++) {
			
		int rem=n%10;
		rev=rem+rev*10;
		n=n/10;
		}
		
		System.out.println(rev);
		

	}

}
