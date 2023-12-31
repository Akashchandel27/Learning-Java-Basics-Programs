package learning_java;

public class New_008_arrowpatter {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("*");

			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}

		}

		int downstairs = 10;
		for (int k = 1; k <= downstairs; k++) {
			System.out.println();

			for (int l = downstairs; l > k; l--) {

				System.out.print("1");
			}
		}
	}
}
