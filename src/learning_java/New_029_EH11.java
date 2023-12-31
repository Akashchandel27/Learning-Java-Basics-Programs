package learning_java;

public class New_029_EH11 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}            // exucation of code will stop in between if we stop here, we use exception here.
		System.out.println(5);

	}

}
