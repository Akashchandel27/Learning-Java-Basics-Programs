package learning_java;

public class New_017_static4 {
	
	public static void main(String[] args) {

		New_017_static3 s3 = new New_017_static3(1, "ram");
		New_017_static3 s4 = new New_017_static3(2, "shyam");
		New_017_static3 s5 = new New_017_static3(3, "shilpa");

		New_017_static3.college = "NIBM";
		//New_017_static3.age =23;
		
		s3.getResult();
		s4.getResult();
	    s5.getResult();
	}

}
