package coding_questions;

public class Coding_4 {
	
	
	//String is Palindrome or not

	public static void main(String[] args) {
		
		String S= "lijil";
		String ex = "";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			ex += S.charAt(i);
		}
		
		
		
		if(S.equalsIgnoreCase(ex))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
