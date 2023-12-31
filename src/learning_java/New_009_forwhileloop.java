package learning_java;

public class New_009_forwhileloop {

	public static void main(String[] args) {
				
		int i = 1;
		while (i <= 5) {
			System.out.println("Repititon of while loop" + i);
			
			
			for (int j = 1; j <= 5; j++) {
				System.out.println("i =" + i + ":j =" + j);
			
			}
			i=i+1;

		}
	}
}