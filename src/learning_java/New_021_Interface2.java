 package learning_java;

public class New_021_Interface2 implements New_021_Interface1{

	@Override
	public void a() {
		System.out.println("hello interface");
	}
	
	public static void main(String[] args) {
		New_021_Interface2 if2 = new New_021_Interface2 ();
		if2.a();
		if2.b();
		New_021_Interface1.method1();
		
	}

	@Override
	public void b() {
		System.out.println("hello method b");
		
	}

}
