package learning_java;

public class New_023_inheritance2 extends New_023_inheritance1 {

	String name = "Selenium"; // Global Variable

	public static void main(String[] args) {

		New_023_inheritance1 i2 = new New_023_inheritance2();
		System.out.println(i2.roll);
		System.out.println(i2.name);
		
		
//		System.out.println(i2.roll);
//		System.out.println(i2.name);
	}
}