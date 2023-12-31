package learning_java;

public class New_025MethodOverride4 extends New_025MethodOverride3 {


	public void run() {
		System.out.println("Ram is running");
	}

	public static void main(String[] args) {

		New_025MethodOverride4 mo4 = new New_025MethodOverride4();
		mo4.run();  

		New_025MethodOverride3 mo3 = new New_025MethodOverride3();
		mo3.run();
	}

}
