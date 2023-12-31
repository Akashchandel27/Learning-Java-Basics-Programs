package learning_java;

public class New_012_UnaryOperator1 {

	public static void main(String[] args) {
		
		int i = 1;                                  // Local variable
		
		System.out.println(i              ++);      //1 , 2
		
		System.out.println(i);                      //2
		
		System.out.println(i              ++ );     //2, 3
		
		System.out.println(++               i);     //4, 4
		
		System.out.println(i);                      //4
		
		int j =i+1;
		System.out.println(j);                      //5

	}

}
