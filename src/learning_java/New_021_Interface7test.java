package learning_java;

public class New_021_Interface7test implements New_021_Interface7Intro,New_021_Interface7conclusion, New_021_Interfacea {

	public static void main(String[] args) {
		
		// you can't create the object of interface
		
		//Webdriver driver = new webdriver();
		
		New_021_Interface7test test = new New_021_Interface7test();
		test.display();
		test.display1();
		test.akash();

		}

	@Override
	public void display() {
		System.out.println("this is test class display method");
		
	}

	@Override
	public void display1() {
		System.out.println("this is test class display1 method");
	}

	@Override
	public void endstory() {
		System.out.println("this is test class end story method");
		
	}

	@Override
	public void climaxstory() {
		System.out.println("this is test class climax story method");
		
	}

	@Override
	public void akash() {
		System.out.println("this is akash's block");
		
	}

}
