package learning_java;

public class New_024_Methodoverload2 extends New_024_Methodoverload1  {
	
	public void sum(int a, int b) {
		System.out.println(a - b);
	} //Concept of Method Overloading

	public static void main(String[] args) {
		
		//Concept of Method Overriding
		
		New_024_Methodoverload1 mo2 = new New_024_Methodoverload2();
		
		mo2.sum(10, 5, 20);
		mo2.sum(25, 15);
		mo2.sum("akash","chandel");
		mo2.sum(19,10);

	}

}
