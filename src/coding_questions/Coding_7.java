package coding_questions;

public class Coding_7 {

	public static void main(String[] args) {
		
		int n =1010;
		int reverse =0;

		while (n != 0) {
			reverse = reverse * 10; 
			//System.out.println("reverse" +reverse);// 0= 0*10
			reverse = reverse + n % 10; // 0=0+
			//System.out.println("reverse" +reverse);
			n = n / 10;
			//System.out.println("n" +n);
		}
		System.out.println("Reverse of entered number is " + n);
		
		if(reverse==n)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
