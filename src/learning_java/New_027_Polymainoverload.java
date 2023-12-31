package learning_java;

public class New_027_Polymainoverload {

	public static void main(String[] args) {

		System.out.println("this is a main method");
		main(10);
		main(args = new String[3], args = new String[4]);
	}

	public static void main(int a) {
		System.out.println("this is the int parameter main method");
	}

	public static void main(String[] args1, String[] args2) {
		System.out.println("thos is the mutilple parameter string array main method");
	}

}
