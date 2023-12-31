package learning_java;

public class New_015_Arraybasic {

	public static void main(String[] args) {
		
	    // Array will accept the same data type

		// int[]i = {1,2,3,4,5,6};
        int i []= {10,20,30,40,50}; // int data type

		String j[]= {"mony","sonu","tony","s","p"}; // string data type

		double k[]= {10.12,6.43,43.09}; // float data type


		// to know the length of the array

		System.out.println("int length is: " +i.length);
		System.out.println("String length is:" +j.length);
		System.out.println("Flaoat length is:" +k.length);

		// to know the particular position in the array

		System.out.println(j[0]);
		System.out.println(j[4]);

		for(int a=0; a<i.length; a++) { // Here, we ran the loop till its length.
		System.out.print(j[a]+ " "); // Here, we print the particular position in the array

	}

}
}
