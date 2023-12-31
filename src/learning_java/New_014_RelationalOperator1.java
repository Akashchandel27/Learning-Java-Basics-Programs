package learning_java;

public class New_014_RelationalOperator1 {

	public static void main(String[] args) {
		
		int a= 300; // local variable
		int b= 300; // local variable
		
		if (a != b)
		{
			System.out.println(" a is not equal to b");
		}
		else
		{
			System.out.println("a and b are equal");
		}
		
		
		String p ="Akash";
		String q ="akash";
		
		
		// for the 1st way
		if (p == q) {
			System.out.println(" p and q are equal for the 1st way");
		}
		else {
			System.out.println(" p and q are not equal for the 1st way");
		}
		
		// for the 2nd way
		if(p.equals(q)) {
			System.out.println("p and q are equal for the 2nd way");
		}
		else {
			System.out.println(" p and q are not equal for the 2nd way");
		}

		// for the 3rd way to ignore the case- sensitive words
	    if(p.equalsIgnoreCase(q)) {
	    	System.out.println("p and q  are equal for the 3 rd way");
	    }
	    else {
			System.out.println(" p and q are not equal for the 3rd way");
		}
	}

}
