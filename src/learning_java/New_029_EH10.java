package learning_java;

public class New_029_EH10 {

	public static void checkeligibility(int age) {

		try {
			if (age < 18) {
				throw new ArithmeticException("Invalid");
			} else {
				System.out.println("Valid");
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException, Exception, ArithmeticException {

		Thread.sleep(3000);
		checkeligibility(15);
		checkeligibility(19);

	}

}
