package learning_java;

public abstract class New_020_Abstractclass3 {

	String primaryfuel;           // = "Diesel";
	String secondaryfuel;         // ="Kersoene";

	
	New_020_Abstractclass3(){
		System.out.println("this is constuctor ");
	}
	
	public abstract void startmechanism();     // An abstract method- which does not have a body. No implement.

	public void servicetime() {
		System.out.println("this is a normal service time method");

	}
}