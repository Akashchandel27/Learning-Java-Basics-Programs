package learning_java;

public class New_021_Interface5 implements New_021_Interface3, New_021_Interface4{

	@Override
	public void b() {
		System.out.println("b method");
	}

	@Override
	public void a() {
		System.out.println("a method");
		
	}
	public static void main(String[] args) {
		New_021_Interface5 if5 = new New_021_Interface5();
		
		if5.a();
		if5.b();
		
		New_021_Interface3.dress();
		
		
		
		
	}

}
