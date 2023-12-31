package learning_java;

public class New_006_whileloop {

	public static void main(String[] args) {
		
		//Step-1 Initialize
		//Step-2 While loop condition
		//step-3 while loop body ke andar whatever logic you want
		//Step-4 increment / Decrement

		int i=10;
		while (i<17) {

		System.out.println(i);

		}
		i++;
		
		
		
		int j=10;
		while (j>0) {
			
			j--;
		}
		
		System.out.println(j);
		
		// Here, the i++ is outside the block then, it will not print in that condition.
		// 10 will printed in the infinite loop
		

//		int i = 10;
//		while (i < 16) {
//
//			System.out.println(i);
//			i++; // Here, the i++ is present in the inside of the block,so, it will printed.
		//}
		
		
		
	}

	
}
