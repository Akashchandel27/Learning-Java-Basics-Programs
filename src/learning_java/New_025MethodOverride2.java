package learning_java;

public class New_025MethodOverride2 extends New_025MethodOverride1 {
	
	public void eat() {
		System.out.println("You are eating");
	}

	public static void main(String[] args) {
		

		New_025MethodOverride2 mo2 = new New_025MethodOverride2();
		mo2.eat();
		
		New_025MethodOverride1 mo1 = new New_025MethodOverride1();
		mo1.eat();
		
		New_025MethodOverride1 mo3 = new New_025MethodOverride2();
		mo3.eat();
	
	}
   
	// New_025MethodOverride2- Here, we are getting output as i am eating
	// if New_025MethodOverride2 = then, we are getting output as you are eating 
}
