package learning_java;

public class New_011_Variables3 {
	
	// Variable types:-
	// 1. Local Variable :- a variable declared inside method body is called local variable.
	// 2. Global Variable:- a variable declared inside the class body but outside the method body. is called instance/global variable.
	// 3. Static Variable:- a global variable which is declared as static is called static variable. we can't create any local variable as static.
	
	
	int d =90;           // Global/Instance variable
	static int f = 15;   // static variable
	
    // Pre-defined method
	public static void main(String[] args) {

		int h=5; // local variable
		System.out.println(f);
		System.out.println(h);
		
		
	
		New_011_Variables3 new_011_Variables3 = new New_011_Variables3();
		new_011_Variables3.a();
		System.out.println(new_011_Variables3.d);
		System.out.println(new_011_Variables3.g);
		a();
		
	}

	 int g=7; // static variable
	
	//user-defined method
	public static int a() {
		int a=10; //local variable
		System.out.println(a);
		return a;
		
	}
}
