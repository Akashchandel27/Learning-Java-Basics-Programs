package coding_questions;

public class Array_odd_even {
	
	// Each value is odd or even in the array
	
	public static void main(String[] args) {

		int a[] = { 10, 23, 3, 2, 1, 0, -5 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 0) {

				System.out.println("EVEN NUMBER");

			} else {
				System.out.println("ODD NUMBER");
			}

		}

	}

}
