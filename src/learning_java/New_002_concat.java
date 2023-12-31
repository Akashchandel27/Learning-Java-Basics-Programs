package learning_java;

public class New_002_concat {

	public static void main(String[] args) {
		
		// Concatenation symbol is +
		int a=10;
		int b=20;

		System.out.println(a+b); // Here, it will add the a and b values and give the output

		String x ="Learning";
		String y ="Java";

		System.out.println(x+y); // Here, it will add the two string and give the output.

		System.out.println(a+b+x+y); // Here, it will add first and then concatation of the two string.

		System.out.println(x+y+a+b);// Here, it will add the two string and then give print the value 10 and 20.
		System.out.println(x+y+(a+b)); // Here, a+b first add then concat.


		char s1 ='a'; // Here it will store the ACSII Value
		char s2 ='b'; //Here it will store the ACSII Value

		System.out.println(s1 + s2); // Numerical result we will get

		boolean b1 = true;
		//boolean b2 = false;

		//System.out.println(b1 + b2); // Error will come
		System.out.println(s1 + x +b1); // only one value will take in boolean

		double d1=10.11;
		double d2=10.12;

		System.out.println(d1+d2);

		System.out.println(" the value of a is " +a);
		System.out.println(" the value od a is" +a +b);
		System.out.println("the value of a is"+ (a+b));
		

	}

}
