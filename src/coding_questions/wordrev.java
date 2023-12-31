package Progarm_practice;

public class wordrev {

	public static void main(String[] args) {
		
		char ch = "";
		int i,len;
		String s ="Akash Chandel is good";
		String w ="";
		
		s=s+" ";
		len=s.length();
		
		for(i=0; i<len; i++) {
			ch = s.charAt(i);
		}
		
		 if(ch!=' ') {
			 w= ch+w;
		 }
		 else {
			 System.out.println(w +" ");
			 w= "";
		 }
		 

	}

}
