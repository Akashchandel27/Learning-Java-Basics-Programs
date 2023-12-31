package learning_java;

public class New_042_Static {
	
	// Class variable
	int roll; // non-static, unique for each student
	String studentname; //non-static,,, unique for each student
	
	
	static String collegename ="DU"; // static allocated memory only once 
	
	public static void main(String[] args) {
		
		New_042_Static student1 = new New_042_Static();
		student1.studentname="amit";
		student1.roll=32;
		
		System.out.println(student1.studentname +"," + student1.roll + "," + student1.collegename);
		
		New_042_Static student2 = new New_042_Static();
		student2.studentname="ait";
		student2.roll=2;
		
		System.out.println(student2.studentname +"," + student2.roll + "," + student2.collegename);
	}

}
