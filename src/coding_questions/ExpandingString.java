package Progarm_practice;

public class ExpandingString {

	public static void main(String[] args) {

		String input = "a3b2d3";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (Character.isLetter(currentChar)) {
				int count = Character.getNumericValue(input.charAt(i + 1));
				for (int j = 0; j < count; j++) {
					output = output + currentChar;
				}
			}
		}

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

}
