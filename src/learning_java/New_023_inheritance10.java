package learning_java;

public class New_023_inheritance10 extends New_023_inheritance9 { // we have to make itNew_023_inheritance8 to get all
																	// the methods

	public void run() {
		System.out.println("I am running");
	}
	
	
	public New_023_inheritance10() { // its has no return type.no void is used)
		int a = 10;
		System.out.println("print--main class" + a);
	}

	public static void main(String[] args) {
		New_023_inheritance10 i10 = new New_023_inheritance10();

		i10.bark(); // we can't inherit the same class in the inheritanace8 again and again, it
					// can't possiable.
		i10.eat();
		i10.run();
		
		

	}

}
