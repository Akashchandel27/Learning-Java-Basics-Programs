package learning_java;

public class New_042_Static2 {

	
	int roll;
	String studentname;
	
	static String collegename = "bharti college";
	
	New_042_Static2(int rollno, String name){
		
		roll= rollno;
		studentname=name;
	}
	
	void display() {
		
		System.out.println(studentname + "," + roll + "'" + collegename);
	}
	
	static void changevalue() {
		collegename =" du";
	}
	public static void main(String[] args) {
		
		New_042_Static2 obj1 = new New_042_Static2(101,"askl");
		New_042_Static2 obj2 = new New_042_Static2(101,"ask2");
		
		obj1.display();
		obj2.display();
		changevalue();
	
		obj1.display();
		obj2.display();
		

	}

}
