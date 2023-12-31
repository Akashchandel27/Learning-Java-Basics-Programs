package learning_java;

public class New_007_forloopexamplessum1 {

	public static void main(String[] args) {

		// Sum of natural number 1 to 10

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum = sum + i; // here sum will store all the sum of number and then print it outside the block
		}
		System.out.println("Number is" + sum);
	}
	
}

//Output:-  Number is55