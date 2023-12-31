package learning_java;

public class New_044_Methodoverloading {
	// In Method overaloading, multiple methods can have
	// 1. Same Name
	// 2. Different parameter number
	// 3. Different parameter data types

	void add(int a, int b) {

		System.out.println("1:" + (a + b));
	}

	void add(double a, double b) {

		System.out.println("2:" + (a + b));

	}

	void add(int a, double b) {

		System.out.println("3:" + (a + b));

	}

	void add(int a, int b, int c) {

		System.out.println("4:" + (a + b));

	}

	public static void main(String[] args) {
		
		//Create object
		
		New_044_Methodoverloading obj1 = new New_044_Methodoverloading();
		obj1.add(2, 3);
		obj1.add(232.232, 232.34);
		obj1.add(2, 232.34);
		obj1.add(34,230, 20);
		
		
		
		

	}

}
