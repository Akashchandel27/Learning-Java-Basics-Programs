package learning_java;

public class New_000_mainmethod {

	// -> Main Method - Starting point of execution of any java program
	// -> if there is no main method what will happen then? Answer :- there will be no execution
	// -> Can main method be non-static? Answer:- No, main method has to be non-static,otherwise error will come
	// -> Does main method return any value ?? Answer- No
	// -> main()- default signature which is pre-defined in JVM.
	// -> main method accept string array parameter in form of argument.
	// -> we can use any thing in place of args.
	// -> we can use public static and static public
	// -> without (String[] args) will execution happen? answer :- NO
	// -> who get the highest priority in execution? answer :- static block

	// Execution Process( Precedence ) - Static block > static method > object creation > instance (BMCI)

	// int,char, String, boolean variable
	int a1 = 10; 
	
	// Constructor -- it is like a method but did not have its return type
	// Class name is same as the constructor name
	// 
	
	public New_000_mainmethod() {
		int a = 10, b = 9;
		if (a < b) {
			System.out.println("hllo constuctor");

		}

		else {
			System.out.println("not a constrctor");
		}
	}
	
	
	static {
		int a = 10, b = 9;
		if (a < b) {
			System.out.println("if static static block");
		} else {
			System.out.println("else static block"); // 1st printed line
		}
	}

	static {
		System.out.println("this is second static block"); // 2nd printed line
	}

	static int chinu(int a, int b) { // Static method
		int max = a + b;
		System.out.println(max);
		return max + 9;

	}

	public static void main(String[] args) {
		
		

		System.out.println("hello JI");

		New_000_mainmethod obj1 = new New_000_mainmethod();
		System.out.println("hello"); // 4th printed line

		// New_000_mainmethod.display(); // print here also // 5th printed line - 10
		int a = New_000_mainmethod.chinu(3, 4);

		System.out.println(4 + a);

		obj1.display(); // above way will printed in this way also
		chinu(1, 2);

		// Calling static method.
		// display(); // print here // 6th printed line - 10

	}
	
	// The static keyword in Java is mainly used for memory management. 
	// And is used to share the same variable or method of a given class.
	// if any method is static and belong to same class, then we can directly call, it by this class name.
	
	static {
		System.out.println("third static block");
	}

	//Methods - a block of code with logic is known as method
	 void display() {
		int a = 1000001;
		System.out.println(a);
		System.out.println(a1);

	}
	 int circle(int a) {
		 System.out.println("Enter the area of the:- ");
		 int area = (int) (3.14*a*a);
		 return area;
		 
	 }

}

// public is access modifier.
// We use this before the main method
// If we change public to the protected then it will throw the error.
// If we use private in place of public then also we will get the error.
// Static is a keyword.
// If we remove the static keyword then it is become non-static, then the
// program will not executed afterwards.
// In Main method we need static keyword.
// Void is return type.
// Main is a default signature which can't be change it will throw the error on changing of it.
// If we do it as Main_1 then also it will throw the error.
// It will work on this also. Main (String[] selenium)
// It will work main (String…selenium) also.
// Not work on (string..selenium and string….selenium)
// We can use static public keyword in the above way also.
// We need to write string to make a main method.
// With-out (string{} args) will the execution happen?---- No
