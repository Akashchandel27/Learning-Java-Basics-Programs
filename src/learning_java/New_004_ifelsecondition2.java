package learning_java;

public class New_004_ifelsecondition2 {

	public static void main(String[] args) {

		int age = 5; // local variable
		int weight = 133; // local variable

		// Outer if block
		if (age > 18) {

			// Inner if block
			if (weight > 50) {
				System.out.println("Eligiable for blood donation");
			} else {
				System.out.println("not eligible-- weight issue");
			}
		} else {
			System.out.println("must be greater than 18 years");
		}
	}

}
