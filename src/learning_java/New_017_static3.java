package learning_java;

public class New_017_static3 {
	
	int roll;                 			// non static global variable
	String name;              			// non static global variable
	static String college = "Balaji";   // static global variable
	static int age;

	New_017_static3 (int roll, String name) {   // Constructor here
        this.roll = roll;
		this.name = name;
	}

	public void getResult() {
		System.out.println(roll + "  " + name + "  " + college + " " + age);
	}

}
