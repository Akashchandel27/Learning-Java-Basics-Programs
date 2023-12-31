package learning_java;

public class New_031_Final {

	public static void main(String[] args) {

		// Final is a reserved keyword...
		// Final- variable, methods,classes

		// Final with variable

		int i = 10; // Variable of a variable can't be changed once initialized with final
		System.out.println(i);

		int i = 11;
		System.out.println(i);

		// Final with class-- once a class is declared final, then you can't extend the
		// class.
		// if a class is declared final all the methods will be automatically final but
		// variable are not.

	}

	public void india() {
		System.out.println("this is india");
	}

	public void westindians() {
		System.out.println("this is west indians");
	}

}
