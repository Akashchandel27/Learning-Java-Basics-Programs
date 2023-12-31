package Progarm_practice;
public class OccurrenceOfCharInString {

	public static void main(String[] args) {
		//OccurrenceOfCharInString occurrence = new OccurrenceOfCharInString();
		//occurrence.occurrenceOfCharInStr("Keerthana");
		
		String s1 ="Keerthana";
		char toFind = 'e';
		
		int occurrence = 0;
		s1 = s1.toLowerCase();
		char[] charArray = s1.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if (toFind == charArray[i]) {
				occurrence++;
			}
		}
		System.out.println("Character " + toFind + " presence " + occurrence + " times");
	}
		
		
		
	}

