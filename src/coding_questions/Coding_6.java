package coding_questions;

import java.util.Scanner;

public class Coding_6 {

	public static void main(String[] args) {

		int n, reverse = 0;

		System.out.println("Enter the number to reverse");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();   // 123

		while (n != 0) {
			reverse = reverse * 10; 
			System.out.println("reverse" +reverse);// 0= 0*10
			reverse = reverse + n % 10; // 0=0+
			System.out.println("reverse" +reverse);
			n = n / 10;
			System.out.println("n" +n);
		}
		System.out.println("Reverse of entered number is " + reverse);

		in.close();

	}


}
