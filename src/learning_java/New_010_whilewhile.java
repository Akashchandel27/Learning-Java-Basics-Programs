package learning_java;

public class New_010_whilewhile {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.print("Outer Loop sequence number" + i);
			i++;

			int j = 1;
			while (j <= 10) {
				System.out.println("Inner Loop sequence number" + "i:" + i + "j:" + j);
				j++;

			}

		}

	}
}