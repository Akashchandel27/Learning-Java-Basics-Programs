package learning_java;

public class New_044_ConstuctorOverloading {

	New_044_ConstuctorOverloading(int x) {
		System.out.println(x);
	}

	New_044_ConstuctorOverloading(double x) {

		System.out.println(x);

	}

	New_044_ConstuctorOverloading(double x, double y) {

		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] args) {

		New_044_ConstuctorOverloading obj1 = new New_044_ConstuctorOverloading(2);
		New_044_ConstuctorOverloading obj2 = new New_044_ConstuctorOverloading(223.23,232.23);
		New_044_ConstuctorOverloading obj3 = new New_044_ConstuctorOverloading(212321.23,31232.2);
		
		
	}

}
