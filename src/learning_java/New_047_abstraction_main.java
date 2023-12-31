package learning_java;

public class New_047_abstraction_main {

	public static void main(String[] args) {
		
		New_047_abstraction_bike obj = new New_047_abstraction_Honda();
		obj.start();
		obj.run();
		obj.stop();
		
		New_047_abstraction_bike obj1 = new New_047_abstraction_TVS();
		obj1.start();
		obj1.run();
		obj1.stop();
		
		New_047_abstraction_bike obj2 = new New_047_abstraction_yamaha();
		obj2.start();
		obj2.run();
		obj2.stop();
		

	}

}
