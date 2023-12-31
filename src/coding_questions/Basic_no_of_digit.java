package coding_questions;

public class Basic_no_of_digit {
	
	// Program :- Number of digit in the number
	// 129 = 3 digit;

	public static void main(String[] args) {
		
		int n=129;
		int count=0;
		
		while(n>0) {
			
			n=n/10;
			count++;
		}
		
		System.out.println(count);
		

	}

}
