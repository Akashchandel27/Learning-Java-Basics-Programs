package learning_java;

public interface New_021_Interface1 {
	
	// varible can't have empty value in that
	static int a = 5; // static variable
	int b = 5;        // non static int variable
	final int c = 10; // final int variable
	

	abstract void a();
	abstract void b();
	
	
	// can't have non-static method's in that
	public static void method1() {
		System.out.println("new method added here");	
	}
	
	public static void method2() {
		System.out.println("new method added here");
		
	}
	
	
	
	}


