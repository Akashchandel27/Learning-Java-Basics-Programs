package learning_java;

public class New_044_Mainmethodoverlaoading {
	
	
	void main(int x) {
		System.out.println(x);
	}
	
	void main(double x,int y) {
		System.out.println(x);
	}
	
	void main(double x) {
		System.out.println(x);
	}
	

	// Entry point 
	public static void main(String[] args) {
		
		New_044_Mainmethodoverlaoading obj = new New_044_Mainmethodoverlaoading();
		obj.main(3);
		obj.main(23.23);
		obj.main(232.23, 20);
		

	}

}
