package learning_java;

public class New_048_try_catch_finally {

	public static void main(String[] args) {
		
//		// Arithmetic Exception
//		
//		
//		try {
//		    int result = 100/0;
//		}
//		catch (Exception e) {
//			System.out.println(e.toString());
//			
//		}
//		
//		System.out.println("hello");
		
		
		// Null pointer Exception
		
		String s;
		try {
			s = null;
			
			System.out.println(s.length());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("it should excuate for sure");
		}
		
		
		
	}

}
