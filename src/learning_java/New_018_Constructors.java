package learning_java;

public class New_018_Constructors {

	String broswer;
	int SINo;
	int rollno;
	int age;

	// What are constructor?
	// it is block. it look like a method but it is not a method.
	// constructor name is same as class name
    // it will not come on the main method
	// it will come on the outside the main method
	// Constructor ka return type --> no return type
	// it is no return type nahi hota toh no void in that
	// aise bhi hu sakta hai we can't use public,private, protected,

	// Modifiers that can be used- public, private, protected, 
	// how to invoke a constructor?? -- automatical, execution when you create the object
	// types -- parameterized, default constructor, user-defined constructor

	public New_018_Constructors(String browser,int SINo, int rollno, int age) {       // its has no return type.no void is used
		int a=10;
		System.out.println(a);
	this.broswer= browser;
	this.SINo=SINo;
	this.rollno=rollno;
	this.age=age;
	}

	public static void main(String[] args) {
	New_018_Constructors objref =  new New_018_Constructors("chrome",23,95,12);
	New_018_Constructors objref1 = new New_018_Constructors("firefox",34,43,23);
	New_018_Constructors objref2 = new New_018_Constructors("excel",43,34,34);


	System.out.println(objref.broswer + " " + objref.SINo + objref.age + objref.rollno);
	System.out.println(objref1.broswer + " " + objref1.SINo +objref.age + objref.rollno);
	System.out.println(objref2.broswer + " " + objref2.SINo +objref.age + objref.rollno);

	}

}
