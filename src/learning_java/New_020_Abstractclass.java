package learning_java;

public abstract class New_020_Abstractclass {
	
	static int a = 5; // static variable
	int b = 5;        // non static int variable
	final int c = 10; // final int variable
	int id;
	
	
	// constructor
	New_020_Abstractclass() {
		System.out.println("Hello Abstract Class Constructor--------");
	}
	
	New_020_Abstractclass(int id) {
		System.out.println("interger cons");
	}
	
	public void displayInformation() {
		System.out.println(c);
		System.out.println(" new file ");
	}
	

	// abstract method
	abstract void eat();
	
	abstract void roll_no();
	
	abstract void dress();
	
	abstract void new1();
	
	abstract void new2();
	
	abstract void sept_new_AC();

	// Non abstract method
	public static void a() {
		System.out.println("Hello non abstract method-- a");
	}
	
	public static void b() {
		System.out.println("this is non abstract method-- b");
	}
	

}
