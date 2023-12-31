package learning_java;

public class New_027_Polymainoverloadautomatic {

	public static void main(String[] args) {

		New_027_Polymainoverloadautomatic ref = new New_027_Polymainoverloadautomatic(); // oBject Reference
		ref.show(10);
		ref.show("india");
		ref.show('a');
	}

	public void show(int i) {
		System.out.println("int method");
	}

	public void show(String S) {
		System.out.println("String Method");
	}

}
