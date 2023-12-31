package learning_java;

public class New_031_Finaltest extends New_031_Final{  // ** we can't extends it because its a final declared in the parent class which we are calling 

	public static void main (String[] args) {
		
		New_031_Final fo = new New_031_Final();
		fo.india();
		fo.westindians();
		
    }
	
	public final void trio() {
		System.out.println("this is final method named transcation.");
	}

}
