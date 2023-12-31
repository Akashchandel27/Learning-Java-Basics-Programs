package learning_java;

public class New_018_Constructors1 {
	
	String name ;
	int student_id ;
	int age;
	static String college_name = "DTU";

	public static void main(String[] args) {

		New_018_Constructors1 st1 = new New_018_Constructors1 ("rohit",23,34);   // this is object
		New_018_Constructors1 st2 = new New_018_Constructors1 ("deppaje",32,45); // this is object
		
		System.out.println(st1.name + " " + st1.student_id + "" + st1.age + college_name);
		System.out.println(st2.name + " " + st2.student_id + "" + st2.age + college_name);

		// Complier executes constructor the moment we create an object- Default constructor
    	}
	
		public New_018_Constructors1(String name, int student_id, int age) { // Constructor
		this.name=name;
		this.student_id=student_id;
		this.age=age;

	}

}

// if we have initionalize the variable globally and make the constructor with the same parameter which we declare on the global variable.
// and making the object and calling the object at the time the complier will confused which value needs to be printed so at that time we use 
// the this keywords in the java

