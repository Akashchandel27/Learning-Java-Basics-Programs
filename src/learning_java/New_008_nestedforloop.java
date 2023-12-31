package learning_java;

public class New_008_nestedforloop {

	public static void main(String[] args) {
		// For loop inside the a for loop
		// Inner loop completely execute then go for the outer for loop

		for (int i = 1; i <= 5; i++) { // Outer Loop

			System.out.print("For repitation of i" + i);
			
			for (int j = 1; j <= 5; j++) { // Inner Loop

				System.out.println("i =" + i + " :j=" + j);
			}

		}

	}
}
