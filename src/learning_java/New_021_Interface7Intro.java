package learning_java;

public interface New_021_Interface7Intro {
	
	//      Methods were abstract and public
    void display();                                        // abstract method is a same as public abstract void display();
	public abstract void display1();

	// Fields and variable
    int i=10;                                              // Public, static, final by default
	                                                       // public static final int i=10; it is same as the above line-13

	public static final String name = "Selenium";          //

	// 8th JAVA version -- Default non-static concrete methods
	default void init() {
	}
	
	//public static method
	public static void stem() {

	}

	// 9th JAVA version- can make private method

	// private void german() {
	// }



}
