package Progarm_practice;

public class SwapFirstAndLastCharacter {

	public static void main(String[] args) {
		
		String givenstr="Keerthana";
	
		char firstChar=givenstr.charAt(0);
		char lastChar=givenstr.charAt(givenstr.length()-1);
		String swappedString = lastChar+givenstr.substring(1, givenstr.length()-1)+firstChar;
		
		System.out.println(swappedString);
		
		

	}

}
