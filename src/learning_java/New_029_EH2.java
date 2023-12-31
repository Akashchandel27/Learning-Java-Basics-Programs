package learning_java;

public class New_029_EH2 {

	public static void main(String[] args) {

		try {
			int c = 3 / 0; // Arithmetic Expection
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}

		System.out.println("Exception handled");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

}
