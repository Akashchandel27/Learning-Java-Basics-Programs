package learning_java;

public class New_036_String_operations1 {

	public static void main(String[] args) {
		
		//1. Length() method
		//String S1 ="Automation Hub Sarthak";
		//String S1 ="a";
//		
//		String s1n ="nzk";
		//System.out.println(S1.length()+1); // 22 character in the string -- Return the integer value
//		System.out.println(s1n.length()); // this is throwing null pointer expectation. so length method will throw NPE in case string value is null

//		int val =S1.length();
//		if(val==0) {
//		System.out.println("this is not a right string");
//		}
//		else {
//		System.out.println("this is right string");
//		}

		// isEmpty() Method

//		String S2= "afd";
//		
//		//boolean val2 =S2.isEmpty(); // this will return boolean-- true or false
//		System.out.println(S2.isEmpty());
//		//System.out.println(val2);

		// 3. trim() method

//		String S3 ="          worldcup 2011 is india's               "; // it return the string value
//		System.out.println(S3.trim());
		
//		String returnvalString =S3.trim(); // it remove the blank space before and after the string start and ends
//		System.out.println(returnvalString);


		// 4. Using trim() and length () together

//		String S4="   JAVA is an OOPS Lanaguage   ";
//		System.out.println(S4.length());
//		System.out.println(S4.trim().length());

		// 5. Compare two string equals(), equalsignoreCase(), CampareTo(), CampareToIngoreCase()

		// Equals()

//		String S5 = "Java";
//		String S6 = "Python";
//		System.out.println(S5.equals(S6));// Return the boolean value

		// equalsIgnoreCase()
//		String S7 ="JAVA";
//		System.out.println(S5.contentEquals(S7));
//		System.out.println(S5.equalsIgnoreCase(S7));

		//campare to()

//		String S8="I am learning String in Java";
//		String S9="I am not interested in strings in Java";
//
//		int valCompare = S8.compareTo(S9); // Return int
//		System.out.println(valCompare+2); // Return int

//		String S10="a"; // unicode value is 97
//		String S11="A"; // unicode value is 65
//		System.out.println(S10.compareTo(S11)); // answer is 32 97-65=32 65-97 =-32
//
//		String S12="B";
//		String S13="B";
//		System.out.println(S13.compareTo(S13));

		//Camparetoingorecase()


		String S14 ="MARUTI";
		String S15="maruti";
		System.out.println(S14.compareToIgnoreCase(S15)); // it will compare the two string and ignore

		// how to add/concat() strings

		String S16="10";
		String S17="Selenium";
		String S18="25";
		String S19="JAVA";
		System.out.println(S16+S17+S18+S19);
		System.out.println(S16.concat(S17).concat(S18).concat(S19));

		// how to join string
		String S20="Maruti";
		String S21="Toyota";
		String S22="hyundai";
		System.out.println(String.join("^", S20,S21,S22));

		// subsequence() -- return char sequence value

		String S23="lockdown is boring but essential";
		System.out.println(S23.subSequence(4, 16));
		// System.out.println(S23.subSequence(0, 125)); // StringIndexOutOfBoundException

		// Sub-string()

		System.out.println(S23.substring(9));
		System.out.println(S23.substring(9,18)); // Start from 9th but ends with (18-1)th postition
		System.out.println(S22.substring(0,0)); // blank output
	}

}
