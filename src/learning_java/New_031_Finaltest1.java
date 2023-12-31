package learning_java;

public class New_031_Finaltest1 extends New_031_Finaltest{

	public static void main(String[] args) {
		New_031_Finaltest fw = new New_031_Finaltest();
		fw.trio();   //**  we got the error in this case because we final the in the methods which we are calling.
		

	}
	
	public void trio() {  // we can't over- ride on this method now
		
		System.out.println("this is final method named transcation.");
	}
	
	

}
