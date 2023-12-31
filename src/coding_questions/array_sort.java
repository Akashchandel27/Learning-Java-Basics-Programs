package programs_practices_questions;

import java.util.Arrays;

public class array_sort {

	public static void main(String[] args) {
		
		int a[] = {10,23,3,2,1,0,-5};
		int temp;
	
		Arrays.sort(a);
		
		for(int i=0; i<a.length-1; i++) {
			
			System.out.println(a[i]);
		}

	}

}
