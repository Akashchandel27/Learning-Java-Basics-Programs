package learning_java;

public class New_024_Methodoverload7 {
	
	public void sum(int a, long b) {  // when the variable type is different

		System.out.println(a + b);
	}

	public void sum(int a, String b) {  // when the variable type is different

		System.out.println(a + b);
	}

	public static void main(String[] args) {
		New_024_Methodoverload7 mo7 = new New_024_Methodoverload7();
		mo7.sum(21, "akans");
		mo7.sum(23, 23423523);
		mo7.sum(21, 12421412);
	}
	

}
