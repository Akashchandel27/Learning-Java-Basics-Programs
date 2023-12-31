package learning_java;

import java.lang.invoke.StringConcatFactory;

public class New_016_Methods {

	// Method- Independent unit of execution. (apna logic hota hai).they can execute
	// this logic under certain condition.
	// AccessModifer + Static(optional) +return type + name of the method +body
	// we can write method under the method and work all alone.
	// via objref we can call methods having access modifiers private and protected (even you can call if they are static in nature- directly or classname)
    // default method can only be created in an interface
	
	
	private void bedroom() {
		System.out.println("this is private method");
	}

	protected void vault() {
		System.out.println("this is the protected method");
	}

	public static void main(String[] args) {
		System.out.println("this is a main method");
		
		New_016_Methods objref = new New_016_Methods(); 
		New_016_Methods_short objref1 = new New_016_Methods_short();

		int n = objref.test();
		System.out.println("first value is " +n);

		
		String f = objref.sample();      // String f = objref.sample();
		System.out.println("Second value is " +f);

		
		boolean g = objref.validation(); // boolean g = objref.validation();
		System.out.println("third value is " +g);

		objref.bedroom();
		objref.vault();
		
		String a3 = New_016_Methods.sample();
		System.out.println(a3 + "hello");
		
		boolean d3 = New_016_Methods.validation();
		System.out.println(d3 == true);
		
		int d1 = New_016_Methods.test();
		System.out.println(d1+100);
		
	}

	public static int test() {

		int k = 5;
		int l = 10;
		int m = k + l;

		return m;

	}

		public static String sample() {

		String str1 = "python";
		String str2 = "java";
		String str3 = str1 + str2;

		return str3;
	}

	public static boolean validation() {

		boolean b1 = 10 < 20;
		boolean b2 = 20 > 30;

		return b2;
	}
}