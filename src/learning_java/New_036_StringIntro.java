package learning_java;

public class New_036_StringIntro {

	public static void main(String[] args) {

		// Strings itne important kyu hai?
		// Answer:- because automation mai maximum object creation hum string ke
		// madhayam se karte hai

		// ** IMPORTANT POINTS ***
		// 1. String is a non-primitive data type.(Size string ka fix nahi hota)
		// 2. String is a sequence of characters. (String is also called array of
		// characters)

		char arr[] = { 's', 'e', 'l', 'e', 'n', 'i', 'u', 'm' };

		String S = new String(arr);
		System.out.println(S);

		// 3. String ek class hai, string class ke andar bahut saare methods bhi hai
		// 4. String is also an object.(immutable object)
		String S1 = "Selenium";

		// string ko kitne tarike se create kiya ja sakta hai
		// String,stringbuffer, stringbuilder

		String S2 = new String();
		String S3 = "selenium";
		System.out.println(S3);
		StringBuffer S4 = new StringBuffer();
		StringBuilder S5 = new StringBuilder();

	}

}