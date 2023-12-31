package learning_java;

public class New_042_Static1 {

	// class variable
	static int count=0;  // non-static variable, will get memory every time object of the class is created
	
	
	New_042_Static1(){  // constructor without parameter
		
		count++; // increment by 1
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
		New_042_Static1 obj1 = new New_042_Static1();
		New_042_Static1 obj2 = new New_042_Static1();
		New_042_Static1 obj3 = new New_042_Static1();
		
		
		
		

	}

}
