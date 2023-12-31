package learning_java;

public class New_045_methodoverriding_main {

	public static void main(String[] args) {

		New_045_methodoverriding_ChildA objA = new New_045_methodoverriding_ChildA();
		System.out.println("A rate of interest" + objA.getRateOfInterest());

		New_045_methodoverriding_ChildB objB = new New_045_methodoverriding_ChildB();
		System.out.println("B rate of interest" + objB.getRateOfInterest());

		New_045_methodoverriding_ChildC objC = new New_045_methodoverriding_ChildC();
		System.out.println("C rate of interest" + objC.getRateOfInterest());

	}

}
