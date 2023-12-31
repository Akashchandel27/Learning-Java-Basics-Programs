package learning_java;

public class New_024_Methodoverload8 {

	public void sum(int a, int b) { // when the variable type is same

		System.out.println(a + b);
	}

	public void sum(long a, long b) { // when the variable type is same

		System.out.println(a + b);
	}
	
	public void sum(String a, String b) {
		
		System.out.println("String a" +"String b");
	}

	public static void main(String[] args) {
		New_024_Methodoverload8 mo8 = new New_024_Methodoverload8();
		mo8.sum(20, 20);
		mo8.sum(234, 423);
		mo8.sum("asfj", "chandel");

	}
}
