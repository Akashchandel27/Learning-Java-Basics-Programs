package learning_java;

public class New_007_forloop_short {

	public static void main(String[] args) {
		
		// Enhanced for loop or mutated for loop
		// while working with array or collections, we give preference to for each loop instead of for loop
		// this loop iterates though each elements of the collection/array
		// syntax easy to understand
		// code is become more readable and less complicated

		char vowels[]= {'a','e','i','o','u'};

		for(char name: vowels) {
		System.out.println(name + "-one");
		}
		

        int numbers[]= {10000,10,10,10,10,1000};
		int sum=0;
		
		for(int name1: numbers) {
			
		       sum += name1;
		}
		
		System.out.print(sum + " ");

	}

}
