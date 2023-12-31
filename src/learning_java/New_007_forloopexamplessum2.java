package learning_java;

import java.util.Scanner;

public class New_007_forloopexamplessum2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number till which you wanted to end the loop");
		int a = scan.nextInt();

		int sum = 0;                                        // sum of natural number 0 to 10

		for (int i = 1; i <= a; i++) {

			sum = sum + i;
			System.out.println("Number is" + sum);

		}

		System.out.println("Final sum of number is" + sum);
		scan.close();

	}

}
