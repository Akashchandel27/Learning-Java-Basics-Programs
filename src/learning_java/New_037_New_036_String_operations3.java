package learning_java;

public class New_037_New_036_String_operations3 {

	public static void main(String[] args) {
		
		// to upper case
		String S ="automation";
		System.out.println(S.toUpperCase());

		// to lower case
		System.out.println(S.toLowerCase()); //Special character will remain same

		// value of

		int i=10;
		int j=20;

		System.out.println(i+j);

		String S1= String.valueOf(i); // converts different data type to string
		String S2= String.valueOf(j);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S1+S2);

		char c[]=S.toCharArray(); // convert string to character array
		System.out.println(c);

	}

}
