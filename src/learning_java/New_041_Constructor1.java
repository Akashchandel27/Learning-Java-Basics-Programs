package learning_java;

public class New_041_Constructor1 {

	String car;
	int year;
	
	
	// construtor with parameter
	New_041_Constructor1(String carname,int yr){
		car=carname;
		year=yr;
	}
	
	public static void main(String[] args) {
		
		New_041_Constructor1 obj = new New_041_Constructor1("Alto", 2012);
		System.out.println(obj.car + " " + obj.year);
		
		
		
		
		

	}

}
