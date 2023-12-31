package learning_java;

public class New_007_forloop {

	public static void main(String[] args) {
		// Intilization
		// Condition which is belongs to Boolean expression
		// Increment and Decrement
		
		int sum=0;
		
		for (int i =1; i<10; i++) {
			
			// Step-1 Intilization statement
			// Step-2 i<10 evaluation is done, if it is true, then control goes inside the loop and logic will excuted.
			// Step-3 i++ this will increase the value.
			// Step-4 till the condition statement is true, the process continue
			// Step-5 conditonal statement when it becomes false
			sum=sum+i;
			
			
			
		}
		System.out.println(sum);
	}

}
