package learning_java;

public class New_026_inheritance2 {

	public static void main(String[] args) {
		
		// Test class to created to invoke the main method in that, we have main method in that

		New_026_inheritance1 bike1 = new New_026_inheritance1();             //** Created bike new method

		bike1.autostart();              // Static Polymorphism and compile time polymorphism ** compile time kara jata hai
		bike1.speedometer();
		bike1.wheels();
		bike1.dualexhaustsystem();
		bike1.twostrokeengine();
		bike1.taillights();
		bike1.kickstart();

		System.out.println("_______________________________________________________");

		New_026_inheritance parentbike = new New_026_inheritance1(); //** Created parent-bike as a new method
		parentbike.dualexhaustsystem();
		parentbike.twostrokeengine();
		parentbike.wheels();
		

		System.out.println("_______________________________________________________");

		// Here, We will make object for the child class so the common class we have printed is for child only.
		// Wheels is common in all the above classes.
		// We know when the same class name and the same argument in the parent class and the child class is there is know as method overriding.

		New_026_inheritance parentbike1 = new New_026_inheritance1(); // When child class object is reffered by the parent class variable - Dynamic (Runtime) polymorphsim- top casting
		parentbike1.wheels();



		System.out.println("_______________________________________________________");


		New_026_inheritance1 parentbike2 = (New_026_inheritance1) new New_026_inheritance(); // When parenet class object is reffered by the child class variable - Down casting
		parentbike2.wheels();    // cast to class exception

        System.out.println("_______________________________________________________");
		}
	
	   // Interview :- direct questions what is down casting and why it is not recommeended it
	   // if parent class object is referred bu child class referance variable what is it called
	   //  what is the expection encountered during down casting
	
		
}
	

