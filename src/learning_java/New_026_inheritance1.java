package learning_java;

public class New_026_inheritance1  extends New_026_inheritance{  // child class
 
	public void speedometer() {                 // Unique Method
		System.out.println("Child Speedometer");
	}

	public void autostart() {                  // Unique Method
		System.out.println("Child autostart");
	}

	public void wheels() {                     // Common method as mentioned in child class
		System.out.println("Child wheels");
	}

}
