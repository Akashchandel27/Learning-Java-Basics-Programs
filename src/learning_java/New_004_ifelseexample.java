
package learning_java;

import java.util.Scanner;

public class New_004_ifelseexample {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int a = scan.nextInt();// get input from user for num1

		System.out.print("Enter the second number: ");
		int b = scan.nextInt();// get input from user for num2

		System.out.print("Enter the third number: ");
		int c = scan.nextInt();// get input from user for num3

		if (a < b && a < c) {
			System.out.println("A is smaller:" + a);
		}

		else if (b < a && b < c) {
			System.out.println("B is smaller:" + b);
		} 
		else {
			System.out.println("C is smaller:" + c);
		}
		scan.close();

	}

}
