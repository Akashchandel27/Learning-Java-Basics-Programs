package learning_java;

public class New_017_static2  {
	
	int roll=01; // non static global variable
	String name; // non static global variable
	String college; // Non static global variable

	public static void main(String[] args) {

		New_017_static2 s2 = new New_017_static2();

		System.out.println(s2.roll);    // 0
		System.out.println(s2.name);    // null
		System.out.println(s2.college); // null
		
		New_017_static1.func1();
		System.out.println(New_017_static1.y); //900
		
		New_017_static1 oj1 = new New_017_static1();
		oj1.akash_chandel();
		oj1.akash();
		
		
	}

}
