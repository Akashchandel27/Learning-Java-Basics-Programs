package learning_java;

public class New_036_String_operations2 {

	public static void main(String[] args) {
		
		// Replace
		String S = "I am learning String";
		System.out.println(S.replace("am","am not"));

		// If replace words present at the multiple location
		String S1 = "Can an ankle injury heal";
		System.out.println(S1.replace("an","add"));

		// Replacefirst
		System.out.println(S1.replaceFirst("an","add"));

		// ReplaceAll
		System.out.println(S1.replace("an", "add"));
		// Replace() method cannot work with regular expression where as replaceAll () can work with regex.

		System.out.println(S1.replace("an(.)", "add"));

		System.out.println("***********************************************************************************************");

		// index of
		String S2 = "Selenium";
		System.out.println(S2.indexOf(7)); // -1
		System.out.println(S2.indexOf('m')); //7
		System.out.println(S2.indexOf("ium")); //5

		// lastindexof
		System.out.println(S2.lastIndexOf("ele"));
		System.out.println(S2.lastIndexOf('m'));

		// Char at
		System.out.println(S2.charAt(7));

		// contains
		System.out.println(S2.contains("S")); /// Return the boolean value

		//Ends with
		System.out.println(S2.endsWith("m")); // Return the boolean value

		//Start with
		System.out.println(S2.startsWith("Se")); // Return the boolean value

	}

}
