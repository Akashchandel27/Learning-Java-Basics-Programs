package learning_java;

public class New_026_inheritance extends New_026_inheritance3 {                   // This is a Parent Class
	
	// we don't have main method in this so we can't execute the program

	public void twostrokeengine() {         // unique method
	System.out.println("Parent Engine");
	}

	public void dualexhaustsystem() {       // unique method
	System.out.println("Parent dual exhaust system");
	}
 
	public void wheels() {                 // common method as mentioned in parent class
	System.out.println("Parent wheels");
	}

}
