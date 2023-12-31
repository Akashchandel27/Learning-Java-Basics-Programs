package learning_java;

public class New_007_forloopcontinuestatement {

	public static void main(String[] args) {

		// continue --> it is used to excuation stop to the particular point
		
		// for loop
		for (int i = 1; i <= 10; ++i) {

			// if the value of i is 5 the loop terminates
			if (i == 3) {
				continue;
			}
			System.out.println(i);

		}

	}
}
