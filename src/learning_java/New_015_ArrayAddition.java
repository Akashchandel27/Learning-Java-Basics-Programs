package learning_java;

import java.util.Scanner;

public class New_015_ArrayAddition {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number you wanted to add and take the average of that");

		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

		// creating another matrix to store the sum of two matrices
		int c[][] = new int[3][3]; // 3 rows and 3 columns

		// adding and printing addition of 2 matrices
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j]; // use - for subtraction
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println();// new line

		}

	}
}
