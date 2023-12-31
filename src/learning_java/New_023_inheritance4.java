package learning_java;

public class New_023_inheritance4 extends New_023_inheritance3 {

	public void multiplication(int x, int y) {
		
		z = x * y; // Establish Relation
		System.out.println("Multiplication is :- " + z);
	}

	public static void main(String[] args) {

		int x = 20, y = 10;

		New_023_inheritance4 i4 = new New_023_inheritance4();
		i4.addition(x, y);
		i4.addition(20, 15);
		i4.substraction(40, 18);
		i4.multiplication(x, y);
		
		int a1 = i4.addition(20, 15);
		System.out.println(a1+10000);
	}

}
