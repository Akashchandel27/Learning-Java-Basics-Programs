package learning_java;

public interface New_021_Interface6Automobile {
	
	// 1) Interface in java is a reference type.
	// 2) Interface is pure abstraction.
	// 3) Collection of abstract method's.
	// 4) A class implements an interface, it inherits abstract method of the interface
	// 5) constants,default methods, static methods, nested types
	// 6) default and static methods- these 2 methods can have body in interface.
	// 7) main method is allowed in interface
	// 8) Any variable of any data-type once declared or initialized in interface in final in nature (static)


	int i=10;
	String name ="Rohit";


	public void steering();                                         // 3) collection of abstract method's
	public void horn();
	public void infotainment();
	public void cruisecontrol();
	public void brakes();

	public static void sunroof()   {                         // 6) default and static methods- these 2 methods can have body in interface.
        System.out.println("this is user-defined method");
		}

	public default void main(String[] args) {
		System.out.println("this is the main method inside the interface");

	}

  
}
