package learning_java;

public class New_039_classes_and_objects1 {

	// instance variable -- Are those which are inside the class but outside the

	// method
	String name;
	int roll_no;

	// Method 1:-

	void insertrecord(String Student_name, int student_rollno) {
		name = Student_name;
		roll_no = student_rollno;
	}

	// Method
	public void displayInformation() { // data type and method name

		System.out.println("Name:- " + name);
		System.out.println("Roll_no :- " + roll_no);
	}

	public static void main(String[] args) {

		New_039_classes_and_objects1 Student1 = new New_039_classes_and_objects1(); // created the object here
		New_039_classes_and_objects1 Student2 = new New_039_classes_and_objects1(); // second object

		// intialise the object Store data to the object student1

		Student1.insertrecord("priya", 02);
		Student2.insertrecord("akash", 03);

		// print information of the student 1 &2

		Student1.displayInformation();
		Student2.displayInformation();
		
	}

}