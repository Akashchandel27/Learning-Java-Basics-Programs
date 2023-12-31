package learning_java;

public class New_015_Array1 {

	public static void main(String[] args) {
		
		// Declaration and Instantiation of an array
		int a[] = new int[5];

		// Initialization
		a[3] = 10;
		a[1] = 89;
		a[2] = 3;
		a[0] = 65;
		a[4] = 1;
		// a[5] = 6; // Error :- java.lang.ArrayIndexOutOfBoundsException

		System.out.println(a[2]);

		// Print the length of an array
		System.out.println("Total array length :- " + a.length); // length is the property of an array

		// Print all array element
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array value for index : " + i + " is " + a[i]);

	}

}
}