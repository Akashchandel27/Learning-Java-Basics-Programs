package learning_java;

public class New_015_Arraybasic1dim {

	public static void main(String[] args) {
		
		//Array Declare
		String str1 [] = {"hello","world","machine"};
		
		
		for(int a=0; a<str1.length; a++) { // Here, we ran the loop till its length.
			System.out.println(str1[a]+ " ");
			}
		
		
		// Array Size
		// Here, we are giving the particular size in the array

		String str2[]= new String[3];

		// Here, we can give any data type value in that

		str2[0]="09";
		str2[1]="lion";
		str2[2]="monkey";

		System.out.println("the length of the array is loop 1 " +str2.length);

		for(int a=0; a<str2.length; a++) { // Here, we ran the loop till its length.
		System.out.print(str2[a]+ " ");
		}

		int k[] = new int[5];

		k[0]=1;
		k[1]=2;
		k[2]=13;
		k[3]=22;
		k[4]=34;
		//k[5]=23; //  Index 5 out of bounds for length 5

		System.out.println("the lenth of the array is loop 2 " +k.length);

	}

}
