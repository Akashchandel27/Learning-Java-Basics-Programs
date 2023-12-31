package learning_java;

public class New_034_thiskeywords {

	// this is a reference variable which refer the object
	// if we initialize the value in the global variable and the methods variable
	// also be the same. then we use this keywords

	int i; // 0 default value // instance variable
	String name; // null
	boolean promotion; // false

	public void empData(int i, String name, boolean promotion) {

		this.i = i;
		this.name = name;
		this.promotion = promotion;

	}

	public void outPut() {
		System.out.println(i);
		System.out.println(name);
		System.out.println(promotion);

	}
}
