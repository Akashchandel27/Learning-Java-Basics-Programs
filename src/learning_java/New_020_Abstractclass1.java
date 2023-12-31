package learning_java;

public class New_020_Abstractclass1 extends New_020_Abstractclass {

	@Override
	void eat() {
		System.out.println("Eating");
	}
	
	@Override
	void dress() {
		System.out.println("dress");
	}
	
	@Override
	public void displayInformation() {
		
		super.displayInformation();
	}
	
	public static void main(String[] args) {

		// We can not create an object of abstract class and interface.
		// that's means we can't create the object for the New_020_Abstractclass,error will throw in that case.
		// constructor will invoke automatically while creating the object.
		
		New_020_Abstractclass1 ac2 = new New_020_Abstractclass1(); // via a object creation
		//New_020_Abstractclass a1 = new New_020_Abstractclass(2);
		ac2.eat();
		ac2.dress();
		ac2.roll_no();
		ac2.new1();
		ac2.new2();
		ac2.sept_new_AC();
		a();
		ac2.b();
		
		
		New_020_Abstractclass ac1 = new New_020_Abstractclass1();  // via a class name 
		ac1.a();
		ac1.new2();
		ac1.displayInformation();
		
	}

	@Override
	void new1() {
		System.out.println("new file is added on it");
		
	}

	@Override
	void new2() {
		System.out.println("new 2 file is been added over here");
		
	}

	@Override
	void roll_no() {
		int a=10;
		int roll= a+10;
		System.out.println(roll);
		return ;
	}

	@Override
	void sept_new_AC() {
		System.out.println("AC");
		
	}
}
