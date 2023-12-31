package learning_java;

public class New_017_static5 {

	static int z  = 5; // static variable
	int y = 1; // non static global variable
	
	int z1 =10000;
	static int a1 =4;

	// static method
	public static void a() {
		z = 10; // Local variable
		System.out.println(z);
	}

	// Non static method
	public void b() {
		z = 15; // local variable
		System.out.println(z1);
		a();
		System.out.println(a1);
	}

	public static void main(String[] args) {
		
		
		
		//a();
		New_017_static5 s5 = new New_017_static5();
		s5.b();
		System.out.println(s5.y); {
			
		}
	}
}

// Static variable -  static method       -  Accept
// static variable - non static method    -  Accept
// non-static variable -  static method       -  Not Accept - create instance of the method
// non-static variable - non static method    -  Accept