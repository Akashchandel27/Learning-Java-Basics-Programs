package learning_java;

public class New_011_Variables4 {

	public static void main(String[] args) {

		int a[] = { 20, 23, 34, 354, 54 };

		String a1[] = { "akash", "chandel" };

		Object a2[] = { 1, 2.2, "akash", 'c' };

		// For int a
		System.out.println(a[0]);  //20
		System.out.println(a[1]);  //23
		System.out.println(a[2]);  //34
		System.out.println(a[3]);  //354
		System.out.println(a[4]);  //54
		//System.out.println(a[5]); --- > Index 5 out of bounds for length 5
		
		// For String a1
		System.out.println(a1[0]); //akash
		System.out.println(a1[1]); //chandel
		
		
		// For Object a2
		System.out.println(a2[0]); //1
		System.out.println(a2[1]); //2.2
	    System.out.println(a2[2]); //akash
		System.out.println(a2[3]); //c

	}

}
