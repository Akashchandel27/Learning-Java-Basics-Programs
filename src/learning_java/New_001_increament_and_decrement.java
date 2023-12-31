package learning_java;

public class New_001_increament_and_decrement {

	public static void main(String[] args) {
		
		// i++ -> post increment
		// ++i -> pre increment
		// i-- -> post decrement
		// --i -> pre decrement 

		int i=10;                      // Now i=10, j is not define
		int j=i++;                     // Now i=j, now j=10, and then i value will increase by +1.

		// post increment 2 operations hote hain.
		
		// 1st operation is j=i
		// then on the 2nd operation the value of i will change

		System.out.println(j); // we think that here value will increase by +1 that is 1.
		System.out.println(i); // Here, it will be remain 10.

		int a =5;  // a value is 5
		int b=++a; // b value will increase 6, and a value be also treated as 6.

		System.out.println(a);
		System.out.println(b);

		int x =10; // Here x =10
		int y=x--; // Here y will equal to 10, and x value will got decreased by -1. so it will 9

		System.out.println(x);
		System.out.println(y);

		int c=10; // here c is 10
		int d=--c;// here d is 9, and which is equal to c then it is 9

		System.out.println(c);
		System.out.println(d);

	}

}
