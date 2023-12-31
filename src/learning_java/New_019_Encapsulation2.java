package learning_java;

public class New_019_Encapsulation2 extends New_019_Encapsulation1
{

	public static void main(String[] args) {
		
		New_019_Encapsulation1 e2 = new New_019_Encapsulation1();
		
		
		e2.Name("Selenium");
		System.out.println(e2.Name()+"india");
		
		e2.set_roll_no(23);
		System.out.println((e2.get_roll_no()+1));

	}

}
