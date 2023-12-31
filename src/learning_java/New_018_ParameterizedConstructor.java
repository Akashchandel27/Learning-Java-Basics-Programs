package learning_java;

public class New_018_ParameterizedConstructor {

	int id=10; // global variable
	String name; // global variable
	String address; // Global variable

	// Default Constructor
	New_018_ParameterizedConstructor() {
		System.out.println(id);
	}

	// Parameterized Constructor
	New_018_ParameterizedConstructor(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// Non Static method
	public void displayInformation() {
		System.out.println(id + "  " + name + "  " + address);
	}

	public static void main(String[] args) {

		// Default Constructor Calling
		New_018_ParameterizedConstructor pc = new New_018_ParameterizedConstructor();

		// Parameterized Constructor Calling
		New_018_ParameterizedConstructor pc1 = new New_018_ParameterizedConstructor(1, "Ram", "Pune");
		New_018_ParameterizedConstructor pc2 = new New_018_ParameterizedConstructor(2, "Shyam", "Mumbai");

		pc.displayInformation();                     // printed the default constructor value in that
		pc1.displayInformation(); 
		pc2.displayInformation();

	}
}
