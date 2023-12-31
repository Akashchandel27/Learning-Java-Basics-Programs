package learning_java;

public class New_036_Stringimmutable {

	public static void main(String[] args) {

		// Immutable ka matlab? Something which can't be changed.
		// String object are immutable. Immutablity ka jo concept hai woh string object
		// ke saath relate kiya jaataa hai

		String S = new String("Selenium"); // Heap area because of new keyword.
		S.concat("JAVA"); // ADD TO STRING HERE
		System.out.println(S);
		
		S = S.concat("C++");
		System.out.println(S);

		// Agar hum string object mai kuch bhi chedkhaani karte hai, toh woh new object
		// create karta hai aur original object ko nahi change karta.

		// Why is still string immutable?

		String player1 = "cricket"; // String literal is cricket.. // 1 Object will be created in SCP.
		String player2 = "soccer"; // No object will be created rather player 2 will refer to cricket.
		String player3 = "cricket";

		// String player =100 "Cricket"

	}

}
