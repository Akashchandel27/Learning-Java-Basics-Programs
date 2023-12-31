package Progarm_practice;

public class Program_26 {
	
	public static void main(String[] args) {
		
		String s1= "Boy is Good";
		String ex= "";
		
		String words[] = s1.split(" ");
		
		for(int i=0; i<words.length;i++) {
			
			ex=ex+words[i].charAt(0);
		}
		
		System.out.println(ex);
		
	}

}
