package learning_java;

public class New_028_PolyMethodoverriding1 extends New_028_PolyMethodoverriding {   // child class

	public static void main(String[] args) {
		New_028_PolyMethodoverriding1 child = new New_028_PolyMethodoverriding1();
		child.initialize();
		
		New_028_PolyMethodoverriding parent = new New_028_PolyMethodoverriding();
		parent.initialize();
		
		
	}
	public void  initialize() {
		System.out.println("this is child's initialize method");
			}

}
