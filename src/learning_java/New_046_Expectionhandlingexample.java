package learning_java;

public class New_046_Expectionhandlingexample {

	public static void main(String[] args) {
		// Arithmetic Exception
		
//		try {
//		int result = 1000/0;
//		}
//		catch(ArithmeticException e) {
//			
//			System.out.println(e.toString());
//		}
		
		
		// null pointer expection
		
//		try {
//			String s = null;
//			
//			System.out.println(s.length());
//		} catch (NullPointerException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.toString());
	//	}
		
	
	// Number format expection
		
//		try {
//			String s ="abc";
//			int i = Integer.parseInt(s);
//			System.out.println(s);
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.toString());
//		}
//		
//		System.out.println("hello");
//	
//}
		
		//array index -out of bound expection
		
		try {
			int a[] = new int [5];
			a[5]=8;
			
			System.out.println(a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("catch block" + e.toString());
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("hello java");
		
	}
}