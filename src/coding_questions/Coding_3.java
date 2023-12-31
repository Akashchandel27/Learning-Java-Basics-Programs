package coding_questions;

public class Coding_3 {
	
	// String S= Reverse the string

	public static void main(String[] args) {
		
		String S= "My name is gaurav kumar gupta";
		String ex = "";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			ex += S.charAt(i);
		}
		
		System.out.println(ex);

	}

}
