package learning_java;

public class New_032_Finally {

	public static void main(String[] args) {
		
		int q=10;
		
		// Finally is a reserved keyword
		// Finally assiocate with try/catch and guarantees execution
		// try/catch executes and then finally block executes.

		try {
		int i=25;
		System.out.println("the value of i" +i);

		int j=i/0; //Arithmetic Expection
		System.out.println("the value of j" +j);
		} catch (ArithmeticException e) {
		 System.out.println("let JVM print this arithmetic expection" +e);
		 }
		
		finally {
		System.out.println("this will print no matter what");
		System.out.println(q);
		}
		

	}

}
