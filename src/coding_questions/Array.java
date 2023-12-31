package programs_practices_questions;

public class Array {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,30};
		int count =0;	
		
		for(int i =0; i<=a.length-1;i++) {
			
			if(a[i]==30) {
				count++;
			}
		
		}
		
		if(count>0) {
			System.out.println("it is one or more than one:- " + count );
		}
		else {
			System.out.println("it is zero");
		}

		
	}

}
