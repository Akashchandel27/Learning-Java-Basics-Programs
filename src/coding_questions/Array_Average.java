package coding_questions;

public class Array_Average {

	public static void main(String[] args) {
		
	
		int a[] = {10,23,3,2,1,0,-5};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
			}
			
		System.out.print(a[i]+" ");
		}
	}

}
