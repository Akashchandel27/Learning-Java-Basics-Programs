package learning_java;

public class New_007_forloopbreakstatment {

	public static void main(String[] args) {

		
		// break --> it is used to stop the execution on the same point
		// for loop
		for (int i = 1; i <= 10; ++i) {

			// if the value of i is 5 the loop terminates
			if (i == 5) {
				break;
			}
			System.out.println(i);

		}

	}
}