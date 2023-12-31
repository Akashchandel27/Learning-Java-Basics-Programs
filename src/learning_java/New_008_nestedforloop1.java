package learning_java;

public class New_008_nestedforloop1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // Outer Loop

			for (int j = 1; j <= 5; j++) { // Inner Loop

				System.out.println("i =" + i + " :j=" + j);
			}
			System.out.println("for repitation of i" + i);

		}

	}
}
