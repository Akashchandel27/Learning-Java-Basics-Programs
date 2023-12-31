package learning_java;

public class New_029_EH4 {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} 
		System.out.println("Exception Handled");

	}

}
