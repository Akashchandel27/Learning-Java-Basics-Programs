package learning_java;

public abstract class New_047_abstraction_bike {
	
	//constructor
	New_047_abstraction_bike(){
		System.out.println("bike class created");
	}
	
	abstract void run(); //abstract method
	abstract void a1();
	
	void start() { // non-abstract method
		System.out.println("bike started ");
	}
	
	void stop() { // non-abstract method
		System.out.println("bike stop ");
	}

}
