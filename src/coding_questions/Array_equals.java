package programs_practices_questions;

import java.util.Arrays;

public class Array_equals {

	public static void main(String[] args) {
		
		int a[] = {10,23,3,2,1,0,-5};
		int b[] = {10,23,3,2,1,0,-5};
		
		
		if(Arrays.equals(a, b)) {
			System.out.println("both are equals");
		}
		else {
			System.out.println("not equals");
		}
	}

}
