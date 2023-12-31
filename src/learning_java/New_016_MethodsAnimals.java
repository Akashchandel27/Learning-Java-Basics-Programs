package learning_java;

public class New_016_MethodsAnimals {

	public static void main(String[] args) {

        // Here, we create the class, object and Methods		
		// Create object
		// New_016_MethodsAnimals - Class ka jo naam hai
		// romeo - Object reference
		// new New_016_MethodsAnimals - Object

		New_016_MethodsAnimals romeo = new New_016_MethodsAnimals(); // Object creation for the main method
		romeo.barking();   // calling the method via object creation in main method
		romeo.eating();    // calling the method via object creation in main method
		romeo.dance();
		int b= romeo.dance();
		System.out.println(b);

		// create object for the bird class
		
		Birds moti = new Birds();  // Object creation for the user-defined method
		moti.fly();                // calling the method via object creation in user-defined method
		moti.speak();              // calling the method via object creation in user-defined method


		// Create object for the vechicals
		
		Vehicals vehicals = new Vehicals();
		vehicals.truckDrive();
		vehicals.carDrive();

	}

	// Method

	public static void barking() { // Behavior  --> this method is created under the main method
		System.out.println("Romeo Barks");
	}

	
	public void eating() {               //--> this method is created under the main method
		System.out.println("Romeo eating");
	}
	
	int dance() {                        //--> this method is created under the main method
		int a=10;
		System.out.println("print the values of" + a);
		return a;
	}
	

}

class Birds { // User-Defined class

	public void fly() { // User-Defined Methods
		System.out.println("Moti Flying");
	}

	public void speak() { // User-Defined Methods
		System.out.println("Moti Speaks");
	}
	
}

class Vehicals {      // User-Defined class

	void truckDrive() {  // User-Defined Methods
		System.out.println("truck drive");
	}

	void carDrive() {  // User-Defined Methods
		System.out.println("Car Driving");
	}

}
