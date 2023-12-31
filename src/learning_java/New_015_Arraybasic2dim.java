package learning_java;

public class New_015_Arraybasic2dim {

	public static void main(String[] args) {

		// How to declare the variable
		// Here, ROWS means yeh total kitne hai bracket kitne hai
		// Col means bracket ki andar kitne hai

		int i[][] = { { 1, 2, 2, 4, 5 }, // Hisab yah se chalta hai sab toh value col ki 2 hai
				      { 3, 4, 7, 6, 8 },
				      { 4, 5, 3, 7, 7 },
				      { 4, 8, 8, 4, 3 } 
				           };
		
		
		System.out.println("the number of row are :- " + i.length);
		System.out.println("the number of col are:- " + i[0].length);
		
		for (int j = 0; j < i.length; j++) {                      // for col outer for loop
			     
			    for (int k = 0; k <i[j].length; k++)               // for row inner for loop
				
			    	 
			    	 System.out.print("" + i[j][k] + " ");
			         System.out.println("*neew**");

		}

	}
}