package learning_java;

public class New_013_LogicalOperator1 {

	public static void main(String[] args) {
		
		int a=100;  // local variable
		int b=5;    // local variable
		int c=200;  // local variable
		
		// logical operator
		System.out.println(a < b  && a < c);  // false --  Both the statement needs to be true to satisfied
		
		// bitwise operator
		System.out.println(a < b || a < c);   // false & true -- Any one can be true

	}

}
