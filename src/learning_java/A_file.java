package learning_java;

public class A_file {
	
	// this is a demo test 
	// which i am performing
	
	
	static String COLLEGE;
	static String subject;
	static int marks;
	static int roll_no;
	
	
	A_file(int marks,int roll_no){
		this.marks= marks;
		this.roll_no=roll_no;
	}
	
	public void getResult() {
		System.out.println("this is my marks" +marks + "roll no" + roll_no +"student of college" +COLLEGE );
		
	}
	

}
