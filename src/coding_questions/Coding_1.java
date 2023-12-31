package coding_questions;

public class Coding_1 {
	
	// String S= "Boy is Good"
	// Expected = BIG
	
	public static void main(String[] args) {
		
		String S = "Boy is good";
		String ex = " ";
		
		String words[]= S.split(" ");
		//System.out.println(words);
		
		for(int i=0; i<words.length;i++) {
				
				ex += words[i].charAt(0);
		}
		System.out.println(ex);
	}

}
