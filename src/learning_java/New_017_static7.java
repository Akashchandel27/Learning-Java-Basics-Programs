package learning_java;

public class New_017_static7 {

	String a; // global variable
	int b; // global variable

	static int c = 4; // static variable

	public static void a() {
		System.out.println("Hello Static");
	}

	public static void main(String[] args) {
		New_017_static7 s7 = new New_017_static7();

		s7.a = "Selenium";
		s7.b = 1;

		c = 2;
		a();

		System.out.println(s7.a + "  " + s7.b + "  " + c);

	}
}
