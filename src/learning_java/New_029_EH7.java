package learning_java;

public class New_029_EH7 {

	public static void main(String[] args) {

		int a[] = new int[7];

		try {
			a[7] = 10 / 0; // Arithmetic Exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}

}
