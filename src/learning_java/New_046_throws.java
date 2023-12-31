package learning_java;

import java.io.IOException;

public class New_046_throws {
		
		static void checkage(int age) throws ArithmeticException,IOException {
			
			if (age < 18){
				throw new ArithmeticException("Acess Denied");
			}
			else 
			{
				System.out.println("Acess Granted");
			}
		}

	public static void main(String[] args) {
		
		try {
			checkage(97);
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
		
		System.out.println("rest of the coder");
		

	}

}
