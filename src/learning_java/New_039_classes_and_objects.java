package learning_java;

public class New_039_classes_and_objects {
	
	// instance variable --  Are those which are inside the class but outside the method
	String name;
	int roll_no;
	
	//Method
	public void  displayInformation() {   // data type and method name 
		
		System.out.println("Name:- " + name);
		System.out.println("Roll_no :- " + roll_no);
	}

	public static void main(String[] args) {
		
		New_039_classes_and_objects Student1 = new New_039_classes_and_objects(); //created the object here
		New_039_classes_and_objects Student2 = new New_039_classes_and_objects();  //second object
		
		
		// intialise the object Store data to the object student1
		
		Student1.name="priya";
		Student1.roll_no=9;
		
		Student2.name="pya";
		Student2.roll_no=3;
		
		//print information of the student 1 &2 
		
		Student1.displayInformation();
		Student2.displayInformation();
		
	
	}


	
}
