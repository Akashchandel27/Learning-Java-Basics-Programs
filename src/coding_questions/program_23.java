package Progarm_practice;

public class program_23 {

	public static void main(String[] args) {
		
		String s1 = "My name is Akash Chandel";
		String s2 = "";
		String words[] = s1.split(" ");
		
		for (int i=words.length-1;i>=0;i--) {
			
			s2=s2 + " " + words[i];
		}
		
		System.out.println(s2);
	}
	

}
