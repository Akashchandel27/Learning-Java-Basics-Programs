package learning_java;

public class New_016_Methods_short {
    // Please refer to the New_016_Methods for the full code
	
	private void bedroom() {
		System.out.println("this is private method");
	}

	protected static void vault() {
		System.out.println("this is the protected method");
	}

	public static void main(String[] args) {
	System.out.println("this is a main method");
	
	New_016_Methods_short objref = new New_016_Methods_short();

		test(3); // - can call the directly also, without call the functions
		objref.sample();
		objref.validation();
	    objref.bedroom();
		objref.vault();
		
	}

	public static int test(int k) {

		int l = 10;
		int m = k + l;
        System.out.println(m);
		return k;

	}

	public void sample() {

		String str1 = "python";
		String str2 = "java";
		String str3 = str1 + str2;
        System.out.println(str3);
	}

	public boolean validation() {

		boolean b1 = 10 < 20;
		boolean b2 = 20 > 30;
        System.out.println(b1);
        return b2;

	}

}
