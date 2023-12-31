package learning_java;

public class New_017_static6 {

	int x = 10;       // global variable
	static int y = 5; // static variable
	

	// non static method
	public void a() {
		int z = 10; // local variable
		System.out.println(z);
	}

	static int b = 6; // static variable

	// static method
	public static void b() {
		int a = 5; // local variable
		System.out.println(a);
	}

	public static void main(String[] args) {

		New_017_static6 s6 = new New_017_static6();
		s6.a();
		
		System.out.println(s6.b); // Correct but not appropriate
		System.out.println(New_017_static6.b); // It seems to be correct and appropriate
		System.out.println(b); // Completely Correct
		b();

	}
}
