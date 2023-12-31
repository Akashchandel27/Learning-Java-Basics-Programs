package learning_java;

public class New_011_Variables8 {

	int b=10;          // global variable
	static int c=5;    // static variable
	
	public static void main(String[] args) {
		
		int a=6;       // local variable
		
		
		System.out.println(a);  //6
		System.out.println(c); //5
		
		
//		// Here we need to create the object and call the value
		New_011_Variables8 v8 = new New_011_Variables8();
		System.out.println(v8.b);
		System.out.println(v8.c);
		v8.a();
		
		}
	
	public void a() {
		
		int f=10;    // local variable
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
		System.out.println("hello selenium");
	} 

}
