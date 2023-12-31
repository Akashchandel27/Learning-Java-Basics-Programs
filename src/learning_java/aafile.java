package learning_java;

public class aafile {

	int b = 10; // global variable
	static int c = 5; // static variable

	public static void main(String[] args) {

		int a = 6; // local variable

		System.out.println(a); // 6
		System.out.println(c); // 5

//		// Here we need to create the object and call the value
		aafile v8 = new aafile();
		System.out.println(v8.b);
		System.out.println(v8.c);
		v8.a();

	}

	public void a() {

		int f = 10; // local variable
		String a1 ="akash";
		System.out.println(a1);
		
		//aafile v8 = new aafile();
		System.out.println("----------");
		//System.out.println(v8.b);
		
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
		System.out.println("hello selenium");
	}
	
	

}
