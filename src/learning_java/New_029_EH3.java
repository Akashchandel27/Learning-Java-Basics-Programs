package learning_java;

public class New_029_EH3 {

	public static void main(String[] args) {

		try {
			int c = 5 / 0; // Arithmetic Exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException b) {
			b.printStackTrace();
		} catch (NullPointerException c) {
			c.printStackTrace();
		} catch (Exception d) {
			d.printStackTrace();

		}
		System.out.println("Exception Handled");
	}
}
