package coding_questions;

public class Basic_sum_of_number {
	
	// Program to sum of digit

	public static void main(String[] args) {

		int number = 129;
		int sum = 0;
		int digit;

		while (number > 0) {
			
			// finds the last digit of the given number
			digit = number % 10;
			
			// adds last digit to the variable sum
			sum += digit;
			// removes the last digit from the number
			
			number = number / 10;

		}

		System.out.println(sum);

	}
}
