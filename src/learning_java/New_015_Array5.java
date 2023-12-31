package learning_java;

import java.util.Scanner;

public class New_015_Array5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number you wanted to add and take the average of that");
		int a1 = in.nextInt();
	
		int num[] = new int[a1];
		int average = 0;
		int i = 0;
		int sum = 0;

		for (i = 0; i < num.length; i++) {
			System.out.println("enter a number" + i+1 );
			num[i] = in.nextInt();
			sum = sum + num[i];
		}
		average = sum / a1;
		System.out.println("Average=" + average);
	}

}
