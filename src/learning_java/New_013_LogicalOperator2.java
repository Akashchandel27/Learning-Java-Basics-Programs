package learning_java;

public class New_013_LogicalOperator2 {

	public static void main(String[] args) {
		
		int a=10;  // local variable
		int b=5;   // local variable
		int c=20;  // local variable
		
		// logical operator
		System.out.println(a < b  && a < c);  // false
		System.out.println(a);      //10
		 
		// bitwise operator
		System.out.println(a < b || a < c);   // false & true
		System.out.println(a);   // 11

	}

}
