package learning_java;

public class New_040_Methods {
	
	
	//Method
	 static void printMessage() {
		System.out.println("welcome java");
		
	}
	 
	 static int sum(int a,int b) {//Accept only two values
		 
		 System.out.println("sum of a+b is" + (a+b));
		 return (a+b);
	 }
	 
	 static int min(int a, int b) {
		 
		 if(a<b)   // if a is smaller than b
			 return a;
		 else        // if b is smaller than a
			 return b;
	 }
	 
	
	public static void main(String[] args) {
		
		
		New_040_Methods calc = new New_040_Methods(); // to print the 
		calc.printMessage();                        // non-static method
		
		int result = sum(2,5); //Argument 
		
		System.out.println("sum of a& b is " + result);
		
		
		System.out.println(min(5,8));
		
		//Method to sum two number
		
		// call method
		//printMessage();  // it is static it is directly printing the output.
		
	}

}
