package coding_questions;

public class Coding_2 {


	// String S= "My name is gaurav kumar gupta"
	// Expected = "gupta kumar gaurav is name my"

	public static void main(String[] args) {

		String S= "My name gaurav kumar gupta";
		//String ex = " ";

		String words[]= S.split(" ");

		for(int i =words.length-1; i>=0; i--) {

			System.out.print(words[i]+" ");
		}

	}
}