package learning_java;

public class New_029_EH6 {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			a[10]= 50;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("Exception Handled");

	}

}
